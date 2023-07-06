package org.odyildiz.adapter.shipment.common.service;

import lombok.RequiredArgsConstructor;
import org.odyildiz.adapter.shipment.common.entity.ShipmentOutboxEntity;
import org.odyildiz.adapter.shipment.common.repository.ShipmentOutboxRepository;
import org.odyildiz.common.entity.ShipmentOutboxEntity;
import org.odyildiz.common.repository.ShipmentOutboxRepository;
import org.odyildiz.payment.enums.ShipmentOutboxState;
import org.odyildiz.payment.usecase.PaymentUseCase;
import org.odyildiz.shipment.usecase.ShipmentUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShipmentOutboxServiceImpl implements ShipmentOutboxService{

    private final ShipmentOutboxRepository shipmentOutboxRepository;

    @Override
    public ShipmentOutboxEntity update(ShipmentUseCase shipmentUseCase) {
        shipmentOutboxRepository.save()
    }

    @Override
    public void delete(Long paymentId) {

    }
}
