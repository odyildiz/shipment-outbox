package org.odyildiz.adapter.payment.rest;

import lombok.RequiredArgsConstructor;
import org.odyildiz.common.VoidUseCaseHandler;
import org.odyildiz.payment.usecase.PaymentUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(value = "payment")
@RequiredArgsConstructor
public class PaymentController {

    private final VoidUseCaseHandler<PaymentUseCase> paymentUseCaseVoidUseCaseHandler;
    @GetMapping("/success")
    public ResponseEntity<String> sendPaymentSuccessEvent(){
        PaymentUseCase paymentUseCase = new PaymentUseCase(new Random().nextLong(), new Random().nextLong());
        paymentUseCaseVoidUseCaseHandler.handle(paymentUseCase);


        return new ResponseEntity<>("Shipment process has started!", HttpStatus.OK);
    }
}
