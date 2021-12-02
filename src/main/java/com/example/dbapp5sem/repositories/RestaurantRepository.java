package com.example.dbapp5sem.repositories;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.modules.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RestaurantRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Restaurant> findAll() {
        String SQL = "SELECT * FROM Restaurant";
        return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Restaurant.class));
    }

    public void create(Restaurant restaurant) {
        String SQL = "INSERT INTO Restaurant (address) VALUES (?)";
        jdbcTemplate.update(SQL, restaurant.getAddress());
    }

    public void delete(Integer id) {
        String SQL = "DELETE FROM Restaurant WHERE restaurant_id=?";
        jdbcTemplate.update(SQL, id);
    }
}
