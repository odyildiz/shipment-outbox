package org.odyildiz.shipment.port;

import org.odyildiz.shipment.usecase.ShipmentUseCase;

public interface CourierCompanyPort {

    void sendShipmentInfo(ShipmentUseCase shipmentUseCase);
}
