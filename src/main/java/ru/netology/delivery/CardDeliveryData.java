package ru.netology.delivery;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CardDeliveryData {
    private final String city;
    private final String data;
    private final String name;
    private final String phone;
}
