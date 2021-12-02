package com.example.dbapp5sem.repositories;

import com.example.dbapp5sem.modules.Dish;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DishRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Dish> findAll() {
        String SQL = "SELECT * FROM Dish";
        return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Dish.class));
    }

    public void create(Dish dish) {
        String SQL = "INSERT INTO Dish (`name`, description) VALUES (?, ?)";
        jdbcTemplate.update(SQL, dish.getName(), dish.getDescription());
    }

    public void delete(Integer id) {
        String SQL = "DELETE FROM Dish WHERE dish_id=?";
        jdbcTemplate.update(SQL, id);
    }
}
