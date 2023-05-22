package org.odyildiz.adapter.shipment.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class ShipmentEventModel {
    private final Long paymentId;
    private final Long userId;
}
