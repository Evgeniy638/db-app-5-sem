package com.example.dbapp5sem.controllers;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.modules.Restaurant;
import com.example.dbapp5sem.services.RestaurantService;
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
@RequestMapping("/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("newRestaurant", new Restaurant());
        model.addAttribute("restaurants", restaurantService.findAll());

        return "admin/restaurants";
    }

    @PostMapping
    public String create(@ModelAttribute Restaurant restaurant) {
        restaurantService.create(restaurant);

        return "redirect:/restaurants";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        restaurantService.delete(id);

        return "redirect:/restaurants";
    }
}
