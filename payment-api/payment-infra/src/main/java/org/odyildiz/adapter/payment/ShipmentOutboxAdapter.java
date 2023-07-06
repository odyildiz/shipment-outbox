package org.odyildiz.adapter.payment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.payment.common.entity.ShipmentOutboxEntity;
import org.odyildiz.adapter.payment.common.service.ShipmentOutboxService;
import org.odyildiz.payment.model.entity.ShipmentOutboxModel;
import org.odyildiz.payment.port.ShipmentOutboxPort;
import org.odyildiz.payment.usecase.PaymentUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShipmentOutboxAdapter implements ShipmentOutboxPort {

    private final ShipmentOutboxService shipmentOutboxService;
    @Override
    public ShipmentOutboxModel save(PaymentUseCase paymentUseCase) {
        ShipmentOutboxEntity shipmentOutboxEntity = shipmentOutboxService.save(paymentUseCase);
        return new ShipmentOutboxModel(shipmentOutboxEntity.getId(), shipmentOutboxEntity.getTopicName(), shipmentOutboxEntity.getShipmentEventPayload(), shipmentOutboxEntity.getState());
    }
}
