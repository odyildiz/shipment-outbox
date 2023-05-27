package org.odyildiz.adapter.shipment.listener;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.shipment.model.ShipmentEventModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShipmentListener {

    @RabbitListener(queues = "shipment")
    public void onShipment(ShipmentEventModel shipmentEventModel) {

        shipmentEventModel.toString();

    }
}
