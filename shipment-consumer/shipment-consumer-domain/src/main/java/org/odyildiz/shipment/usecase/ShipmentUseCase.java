package org.odyildiz.shipment.usecase;

import lombok.Builder;
import lombok.Getter;
import org.odyildiz.common.model.UseCase;

@Builder
@Getter
public class ShipmentUseCase implements UseCase {
    private Long paymentId;
    private Long userId;
}
