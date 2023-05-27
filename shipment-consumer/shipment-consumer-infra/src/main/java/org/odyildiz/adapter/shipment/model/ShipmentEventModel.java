package org.odyildiz.adapter.shipment.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShipmentEventModel {
    private Long paymentId;
    private Long userId;
}
