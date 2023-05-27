package org.odyildiz.shipment;

import org.odyildiz.common.DomainComponent;
import org.odyildiz.common.usecase.VoidUseCaseHandler;
import org.odyildiz.shipment.usecase.ShipmentUseCase;

@DomainComponent
public class ShipmentHandler implements VoidUseCaseHandler<ShipmentUseCase> {
    @Override
    public void handle(ShipmentUseCase useCase) {

    }
}
