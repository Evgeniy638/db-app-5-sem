package com.example.dbapp5sem.modules;

import lombok.Data;

@Data
public class Order {
    private Integer orderId;
    private String deliveryAddress;
    private Boolean isPaid;
    private Double playmentAmount;
    private String status;
    private Integer clientId;
    private Integer workerId;
}
