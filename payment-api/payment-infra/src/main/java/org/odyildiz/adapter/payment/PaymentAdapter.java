package org.odyildiz.adapter.payment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.odyildiz.common.repository.ShipmentOutboxRepository;
import org.odyildiz.payment.enums.ShipmentOutboxState;
import org.odyildiz.payment.port.PaymentPort;
import org.odyildiz.payment.usecase.PaymentUseCase;

@RequiredArgsConstructor
public class PaymentAdapter implements PaymentPort {

    private final ShipmentOutboxRepository shipmentOutboxRepository;
    @Override
    public void startShipment(PaymentUseCase paymentUseCase) {
        try {
            ShipmentOutboxEntity shipmentOutboxEntity = new ShipmentOutboxEntity();
            shipmentOutboxEntity.setTopicName("shipment");
            shipmentOutboxEntity.setShipmentEventPayload(paymentUseCase.toShipmentEventPayload());
            shipmentOutboxEntity.setState(ShipmentOutboxState.PENDING);

            shipmentOutboxRepository.save(shipmentOutboxEntity);

            // TODO : Add kafka producer

        }
        catch (Exception e) {
            throw new RuntimeException(String.format("Couldn't start shipment for userId : % with paymentId : %", paymentUseCase.getUserId(), paymentUseCase.getPaymentId()));
        }
    }
}
