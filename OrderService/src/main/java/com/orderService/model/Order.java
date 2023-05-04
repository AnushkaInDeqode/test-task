package com.orderService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Order {

    private String orderNumber;
    private String customerName;
    private double orderTotal;
    private String userEmail;
}
