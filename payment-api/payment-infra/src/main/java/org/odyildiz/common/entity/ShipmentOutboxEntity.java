package org.odyildiz.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.ColumnTransformer;
import org.odyildiz.payment.enums.ShipmentOutboxState;
import org.odyildiz.payment.model.event.ShipmentEventPayload;

@Entity
@Data
@Table(schema = "outbox",name = "shipment_outbox")
public class ShipmentOutboxEntity {

    @Id
    private Long id;

    @Column(name = "topic_name")
    private String topicName;

    @Column(name = "payload")
    @ColumnTransformer(read = "payload", write = "?::jsonb")
    private ShipmentEventPayload shipmentEventPayload;

    @Column(name = "state")
    private ShipmentOutboxState state;
}
