package com.example.dbapp5sem.modules;

import lombok.Data;

@Data
public class Client {
    private Integer clientId;
    private String name;
    private String surname;
    private String patronymic;
    private String phone;
}
