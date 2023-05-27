package org.odyildiz.adapter.payment.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.RequiredArgsConstructor;
import org.odyildiz.payment.model.event.ShipmentEventPayload;

@Converter
@RequiredArgsConstructor
public class ShipmentEventPayloadConverter implements AttributeConverter<ShipmentEventPayload, String> {

    private final ObjectMapper objectMapper;
    @Override
    public String convertToDatabaseColumn(ShipmentEventPayload shipmentEventPayload) {
        try {
            return objectMapper.writeValueAsString(shipmentEventPayload);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ShipmentEventPayload convertToEntityAttribute(String shipmentEventPayload) {
        try {
            return objectMapper.readValue(shipmentEventPayload, ShipmentEventPayload.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
