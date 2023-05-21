package org.odyildiz.payment.usecase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.odyildiz.common.model.UseCase;
import org.odyildiz.payment.model.event.ShipmentEventPayload;

@AllArgsConstructor
@Getter
public class PaymentUseCase implements UseCase {
    private Long paymentId;
    private Long userId;

    public ShipmentEventPayload toShipmentEventPayload() {
        return new ShipmentEventPayload(this.paymentId,this.userId);
    }

}
