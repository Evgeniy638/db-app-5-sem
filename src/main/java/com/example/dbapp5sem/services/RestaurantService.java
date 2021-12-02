package com.example.dbapp5sem.services;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.modules.Restaurant;
import com.example.dbapp5sem.repositories.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    public void create(Restaurant restaurant) {
        restaurantRepository.create(restaurant);
    }

    public void delete(Integer id) {
        restaurantRepository.delete(id);
    }
}
