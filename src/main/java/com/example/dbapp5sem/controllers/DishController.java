package com.example.dbapp5sem.controllers;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.services.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dishes")
@RequiredArgsConstructor
public class DishController {
    private final DishService dishService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("newDish", new Dish());
        model.addAttribute("dishes", dishService.findAll());

        return "admin/dishes";
    }

    @PostMapping
    public String create(@ModelAttribute Dish dish) {
        dishService.create(dish);

        return "redirect:/dishes";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        dishService.delete(id);

        return "redirect:/dishes";
    }

}
