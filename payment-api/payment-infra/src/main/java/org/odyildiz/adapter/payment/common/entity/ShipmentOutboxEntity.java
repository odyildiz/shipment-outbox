package org.odyildiz.adapter.payment.common.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnTransformer;
import org.odyildiz.adapter.payment.converter.ShipmentEventPayloadConverter;
import org.odyildiz.payment.enums.ShipmentOutboxState;
import org.odyildiz.payment.model.event.ShipmentEventPayload;

@Entity
@Data
@Table(schema = "outbox",name = "shipment_outbox")
public class ShipmentOutboxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topic_name")
    private String topicName;

    @Column(name = "payload")
    @Convert(converter = ShipmentEventPayloadConverter.class)
    @ColumnTransformer(read = "payload", write = "?::jsonb")
    private ShipmentEventPayload shipmentEventPayload;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private ShipmentOutboxState state;
}
