package org.odyildiz.adapter.payment.producer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.odyildiz.payment.model.entity.ShipmentOutboxModel;
import org.springframework.amqp.core.Message;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ShipmentEventModel implements Serializable {
    private Long paymentId;
    private Long userId;

    public static ShipmentEventModel fromShipmentOutboxModel(ShipmentOutboxModel shipmentOutboxModel){
        return new ShipmentEventModel(shipmentOutboxModel.getShipmentEventPayload().getPaymentId(), shipmentOutboxModel.getShipmentEventPayload().getUserId());
    }
}
