package org.odyildiz.adapter.shipment.common.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnTransformer;
import org.odyildiz.adapter.shipment.common.event.ShipmentEventPayload;
import org.odyildiz.adapter.shipment.converter.ShipmentEventPayloadConverter;
import org.odyildiz.shipment.common.enums.ShipmentOutboxState;

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
