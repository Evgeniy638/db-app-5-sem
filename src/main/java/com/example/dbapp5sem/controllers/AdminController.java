package com.example.dbapp5sem.controllers;

import com.example.dbapp5sem.modules.Client;
import com.example.dbapp5sem.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdminController {
    private final ClientRepository clientRepository;

    @GetMapping("/")
    public String admin() {
        Client client = new Client();
        client.setName("name");

        clientRepository.save(client);

        return "admin";
    }
}
