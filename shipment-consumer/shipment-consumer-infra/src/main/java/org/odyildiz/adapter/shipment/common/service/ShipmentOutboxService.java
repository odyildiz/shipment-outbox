package org.odyildiz.adapter.shipment.common.service;

import org.odyildiz.adapter.shipment.common.entity.ShipmentOutboxEntity;
import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.odyildiz.payment.usecase.PaymentUseCase;
import org.odyildiz.shipment.usecase.ShipmentUseCase;

public interface ShipmentOutboxService {
    ShipmentOutboxEntity update(ShipmentUseCase shipmentUseCase);
    void delete(Long paymentId);
}
