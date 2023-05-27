package org.odyildiz.adapter.shipment.model;

import lombok.*;
import org.odyildiz.shipment.usecase.ShipmentUseCase;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShipmentEventModel {
    private Long paymentId;
    private Long userId;

    public ShipmentUseCase toShipmentUseCase(){
        return ShipmentUseCase.builder()
                .paymentId(this.paymentId)
                .userId(this.userId)
                .build();
    }
}
