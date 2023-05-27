package org.odyildiz.adapter.payment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.payment.producer.model.ShipmentEventModel;
import org.odyildiz.payment.model.entity.ShipmentOutboxModel;
import org.odyildiz.payment.port.MessageQueuePort;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageQueueAdapter implements MessageQueuePort {

    private final RabbitTemplate rabbitTemplate;
    @Override
    public void sendToShipment(ShipmentOutboxModel shipmentOutboxModel) {
        rabbitTemplate.convertAndSend("shipment", ShipmentEventModel.fromShipmentOutboxModel(shipmentOutboxModel));
    }
}
