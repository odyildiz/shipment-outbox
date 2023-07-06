package org.odyildiz.adapter.shipment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.client.CourierCompanyClient;
import org.odyildiz.shipment.port.CourierCompanyPort;
import org.odyildiz.shipment.usecase.ShipmentUseCase;


@RequiredArgsConstructor
public class CourierCompanyAdapter implements CourierCompanyPort {

    private final CourierCompanyClient courierCompanyClient;
    @Override
    public void sendShipmentInfo(ShipmentUseCase shipmentUseCase) {
        courierCompanyClient.sendInfoToCourierCompany(shipmentUseCase);
    }
}
