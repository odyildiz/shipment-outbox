package org.odyildiz.adapter.shipment.common.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class ShipmentEventPayload implements Serializable {
    private Long paymentId;
    private Long userId;
}
