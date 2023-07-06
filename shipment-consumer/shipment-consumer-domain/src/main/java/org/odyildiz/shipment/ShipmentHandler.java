package org.odyildiz.shipment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.common.DomainComponent;
import org.odyildiz.common.usecase.VoidUseCaseHandler;
import org.odyildiz.shipment.port.CourierCompanyPort;
import org.odyildiz.shipment.port.ShipmentOutboxPort;
import org.odyildiz.shipment.usecase.ShipmentUseCase;

@DomainComponent
@RequiredArgsConstructor
public class ShipmentHandler implements VoidUseCaseHandler<ShipmentUseCase> {

    private final CourierCompanyPort courierCompanyPort;
    private final ShipmentOutboxPort shipmentOutboxPort;
    @Override
    public void handle(ShipmentUseCase shipmentUseCase) {
        try {
            courierCompanyPort.sendShipmentInfo(shipmentUseCase);

        } catch (Exception e) {

        }
    }
}
