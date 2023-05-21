package org.odyildiz.payment;

import lombok.RequiredArgsConstructor;
import org.odyildiz.common.VoidUseCaseHandler;
import org.odyildiz.payment.port.PaymentPort;
import org.odyildiz.payment.usecase.PaymentUseCase;

@RequiredArgsConstructor
public class PaymentHandler implements VoidUseCaseHandler<PaymentUseCase> {

    private final PaymentPort paymentPort;

    @Override
    public void handle(PaymentUseCase useCase) {
        paymentPort.startShipment(useCase);
    }
}
