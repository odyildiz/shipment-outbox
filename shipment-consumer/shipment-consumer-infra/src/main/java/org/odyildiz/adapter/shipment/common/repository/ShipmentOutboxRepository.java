package org.odyildiz.adapter.shipment.common.repository;

import org.odyildiz.adapter.shipment.common.entity.ShipmentOutboxEntity;
import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.odyildiz.shipment.common.enums.ShipmentOutboxState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentOutboxRepository extends JpaRepository<ShipmentOutboxEntity, Long> {

    @Query("UPDATE ShipmentOutboxEntity SET state = :shipmentOutboxState WHERE shipmentEventPayload.paymentId = :paymentId")
    ShipmentOutboxEntity updateStateByPaymentId(Long paymentId, ShipmentOutboxState shipmentOutboxState);

}
