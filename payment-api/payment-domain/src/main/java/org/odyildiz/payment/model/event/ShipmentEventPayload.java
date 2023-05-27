package org.odyildiz.payment.model.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class ShipmentEventPayload implements Serializable {
    private Long paymentId;
    private Long userId;
}
