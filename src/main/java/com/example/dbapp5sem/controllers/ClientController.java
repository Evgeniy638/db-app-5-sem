package com.example.dbapp5sem.controllers;

import com.example.dbapp5sem.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public String admin(Model model) {
        model.addAttribute("clients", clientService.findAll());

        return "admin/clients";
    }
}
