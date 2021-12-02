package com.example.dbapp5sem.controllers;

import com.example.dbapp5sem.modules.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {
    private final JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String admin() {
        List<Client> clients = jdbcTemplate.query("SELECT * FROM Client", new BeanPropertyRowMapper<>(Client.class));

        System.out.println(clients);

        return "admin";
    }
}
