package com.example.dbapp5sem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdminController {
    @GetMapping("/")
    public String admin() {
        return "admin/index";
    }
}
