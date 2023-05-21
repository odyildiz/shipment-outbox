package org.odyildiz.payment.model.event;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class ShipmentEventPayload implements Serializable {
    private Long paymentId;
    private Long userId;
}
