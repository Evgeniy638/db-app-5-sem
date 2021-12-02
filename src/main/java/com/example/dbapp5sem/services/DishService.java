package com.example.dbapp5sem.services;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.repositories.DishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishService {
    private final DishRepository dishRepository;

    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    public void create(Dish dish) {
        dishRepository.create(dish);
    }

    public void delete(Integer id) {
        dishRepository.delete(id);
    }
}
