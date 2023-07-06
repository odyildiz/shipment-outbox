package org.odyildiz.common.service;

import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.odyildiz.payment.usecase.PaymentUseCase;

public interface ShipmentOutboxService {
    ShipmentOutboxEntity save(PaymentUseCase paymentUseCase);
}
