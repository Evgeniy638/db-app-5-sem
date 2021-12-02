package com.example.dbapp5sem.modules;

import lombok.Data;

@Data
public class Worker {
    private Integer workerId;
    private String name;
    private String surname;
    private String patronymic;
    private String position;
}
