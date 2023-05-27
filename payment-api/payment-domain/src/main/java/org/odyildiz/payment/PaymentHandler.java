package org.odyildiz.payment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.common.DomainComponent;
import org.odyildiz.common.usecase.VoidUseCaseHandler;
import org.odyildiz.payment.model.entity.ShipmentOutboxModel;
import org.odyildiz.payment.port.MessageQueuePort;
import org.odyildiz.payment.port.PaymentPort;
import org.odyildiz.payment.port.ShipmentOutboxPort;
import org.odyildiz.payment.usecase.PaymentUseCase;

@RequiredArgsConstructor
@DomainComponent
public class PaymentHandler implements VoidUseCaseHandler<PaymentUseCase> {

    private final ShipmentOutboxPort shipmentOutboxPort;
    private final MessageQueuePort messageQueuePort;

    @Override
    public void handle(PaymentUseCase paymentUseCase) {
        try {
            ShipmentOutboxModel shipmentOutboxModel = shipmentOutboxPort.save(paymentUseCase);
            messageQueuePort.sendToShipment(shipmentOutboxModel);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(String.format("Couldn't start shipment for userId : %s with paymentId : %s", paymentUseCase.getUserId(), paymentUseCase.getPaymentId()));
        }
    }
}
