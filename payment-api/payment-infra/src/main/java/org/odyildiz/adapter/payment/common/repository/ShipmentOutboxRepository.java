package org.odyildiz.adapter.payment.common.repository;

import org.odyildiz.adapter.payment.common.entity.ShipmentOutboxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentOutboxRepository extends JpaRepository<ShipmentOutboxEntity, Long> {
}
