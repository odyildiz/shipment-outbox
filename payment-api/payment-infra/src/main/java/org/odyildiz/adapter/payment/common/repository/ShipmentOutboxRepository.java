package org.odyildiz.common.repository;

import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentOutboxRepository extends JpaRepository<ShipmentOutboxEntity, Long> {
}
