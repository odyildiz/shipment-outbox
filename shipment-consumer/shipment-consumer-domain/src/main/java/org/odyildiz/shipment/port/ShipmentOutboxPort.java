package org.odyildiz.shipment.port;

import org.odyildiz.payment.model.entity.ShipmentOutboxModel;
import org.odyildiz.payment.usecase.PaymentUseCase;
import org.odyildiz.shipment.common.model.ShipmentOutboxModel;
import org.odyildiz.shipment.usecase.ShipmentUseCase;

public interface ShipmentOutboxPort {
    ShipmentOutboxModel update(ShipmentUseCase shipmentUseCase);
    void delete(Long paymentId);
}
