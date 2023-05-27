package org.odyildiz.payment.port;

import org.odyildiz.payment.model.entity.ShipmentOutboxModel;
import org.odyildiz.payment.usecase.PaymentUseCase;

public interface ShipmentOutboxPort {
    ShipmentOutboxModel save(PaymentUseCase useCase);
}
