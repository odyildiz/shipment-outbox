package org.odyildiz.adapter.payment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.odyildiz.common.repository.ShipmentOutboxRepository;
import org.odyildiz.payment.enums.ShipmentOutboxState;
import org.odyildiz.payment.model.entity.ShipmentOutboxModel;
import org.odyildiz.payment.port.ShipmentOutboxPort;
import org.odyildiz.payment.usecase.PaymentUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShipmentOutboxAdapter implements ShipmentOutboxPort {

    private final ShipmentOutboxRepository shipmentOutboxRepository;
    @Override
    public ShipmentOutboxModel save(PaymentUseCase useCase) {
        ShipmentOutboxEntity shipmentOutboxEntity = new ShipmentOutboxEntity();
        shipmentOutboxEntity.setTopicName("shipment");
        shipmentOutboxEntity.setShipmentEventPayload(useCase.toShipmentEventPayload());
        shipmentOutboxEntity.setState(ShipmentOutboxState.PENDING);

        shipmentOutboxRepository.save(shipmentOutboxEntity);

        return new ShipmentOutboxModel(shipmentOutboxEntity.getId(), shipmentOutboxEntity.getTopicName(), shipmentOutboxEntity.getShipmentEventPayload(), shipmentOutboxEntity.getState());
    }
}
