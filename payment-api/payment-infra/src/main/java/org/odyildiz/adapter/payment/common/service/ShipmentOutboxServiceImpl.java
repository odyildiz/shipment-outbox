package org.odyildiz.adapter.payment.common.service;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.payment.common.entity.ShipmentOutboxEntity;
import org.odyildiz.adapter.payment.common.repository.ShipmentOutboxRepository;
import org.odyildiz.payment.enums.ShipmentOutboxState;
import org.odyildiz.payment.usecase.PaymentUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShipmentOutboxServiceImpl implements ShipmentOutboxService{

    private final ShipmentOutboxRepository shipmentOutboxRepository;

    public ShipmentOutboxEntity save(PaymentUseCase paymentUseCase){
        ShipmentOutboxEntity shipmentOutboxEntity = new ShipmentOutboxEntity();
        shipmentOutboxEntity.setTopicName("shipment");
        shipmentOutboxEntity.setShipmentEventPayload(paymentUseCase.toShipmentEventPayload());
        shipmentOutboxEntity.setState(ShipmentOutboxState.PENDING);

        return shipmentOutboxRepository.save(shipmentOutboxEntity);
    }
}
