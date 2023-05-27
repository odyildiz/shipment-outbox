package org.odyildiz.adapter.shipment.listener;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.shipment.model.ShipmentEventModel;
import org.odyildiz.common.usecase.VoidUseCaseHandler;
import org.odyildiz.shipment.usecase.ShipmentUseCase;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShipmentListener {

    private final VoidUseCaseHandler<ShipmentUseCase> shipmentUseCaseVoidUseCaseHandler;
    @RabbitListener(queues = "shipment")
    public void onShipment(ShipmentEventModel shipmentEventModel) {
        ShipmentUseCase shipmentUseCase = shipmentEventModel.toShipmentUseCase();
        shipmentUseCaseVoidUseCaseHandler.handle(shipmentUseCase);

    }
}
