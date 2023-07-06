package org.odyildiz.shipment.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.odyildiz.payment.enums.ShipmentOutboxState;
import org.odyildiz.payment.model.event.ShipmentEventPayload;
import org.odyildiz.shipment.common.enums.ShipmentOutboxState;

@Getter
@Setter
@AllArgsConstructor
public class ShipmentOutboxModel {

    private Long id;
    private String topicName;
    //private ShipmentEventPayload shipmentEventPayload;
    private ShipmentOutboxState state;
}
