package com.example.dbapp5sem.controllers;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.modules.Worker;
import com.example.dbapp5sem.services.DishService;
import com.example.dbapp5sem.services.RestaurantService;
import com.example.dbapp5sem.services.WorkerService;
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
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerService workerService;
    private final RestaurantService restaurantService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("newWorker", new Worker());
        model.addAttribute("workers", workerService.findAll());
        model.addAttribute("listRestaurants", restaurantService.findAll());

        return "admin/workers";
    }

    @PostMapping
    public String create(@ModelAttribute Worker worker) {
        workerService.create(worker);

        return "redirect:/workers";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        workerService.delete(id);

        return "redirect:/workers";
    }
}
