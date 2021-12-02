package com.example.dbapp5sem.repositories;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.modules.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class WorkerRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Worker> findAll() {
        String SQL = "SELECT * FROM Worker";
        return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Worker.class));
    }

    public void create(Worker worker) {
        String SQL = "INSERT INTO Worker (`name`, surname, patronomic, position, restaurant_id) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(SQL,
                worker.getName(),
                worker.getSurname(),
                worker.getPatronomic(),
                worker.getPosition(),
                worker.getRestaurantId()
        );
    }

    public void delete(Integer id) {
        String SQL = "DELETE FROM Worker WHERE worker_id=?";
        jdbcTemplate.update(SQL, id);
    }
}
