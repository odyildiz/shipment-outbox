package org.odyildiz.adapter.client;

import org.odyildiz.shipment.usecase.ShipmentUseCase;

public class CourierCompanyClient {

    public void sendInfoToCourierCompany(ShipmentUseCase shipmentUseCase){
        System.out.println("Informations for paymentId : " + shipmentUseCase.getPaymentId() + " has been send to Courier Company !!!!");
    }
}
