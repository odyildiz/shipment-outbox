package org.odyildiz.adapter.shipment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.shipment.common.entity.ShipmentOutboxEntity;
import org.odyildiz.shipment.common.model.ShipmentOutboxModel;
import org.odyildiz.adapter.shipment.common.service.ShipmentOutboxService;
import org.odyildiz.shipment.port.ShipmentOutboxPort;
import org.odyildiz.shipment.usecase.ShipmentUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShipmentOutboxAdapter implements ShipmentOutboxPort {

    private final ShipmentOutboxService shipmentOutboxService;

    @Override
    public ShipmentOutboxModel update(ShipmentUseCase shipmentUseCase) {
        ShipmentOutboxEntity shipmentOutboxEntity = shipmentOutboxService.update(shipmentUseCase);
    }

    @Override
    public void delete(Long paymentId) {
        shipmentOutboxService.delete(paymentId);
    }
}
