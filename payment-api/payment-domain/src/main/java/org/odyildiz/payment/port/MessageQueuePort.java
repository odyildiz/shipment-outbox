package org.odyildiz.payment.port;

import org.odyildiz.payment.model.entity.ShipmentOutboxModel;

public interface MessageQueuePort {
    void sendToShipment(ShipmentOutboxModel shipmentOutboxModel);
}
