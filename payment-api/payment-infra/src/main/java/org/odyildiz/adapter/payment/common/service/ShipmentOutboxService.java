package org.odyildiz.adapter.payment.common.service;

import org.odyildiz.adapter.payment.common.entity.ShipmentOutboxEntity;
import org.odyildiz.payment.usecase.PaymentUseCase;

public interface ShipmentOutboxService {
    ShipmentOutboxEntity save(PaymentUseCase paymentUseCase);
}
