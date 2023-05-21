package org.odyildiz.payment.port;

import org.odyildiz.payment.usecase.PaymentUseCase;

public interface PaymentPort {
    void startShipment(PaymentUseCase paymentUseCase);
}
