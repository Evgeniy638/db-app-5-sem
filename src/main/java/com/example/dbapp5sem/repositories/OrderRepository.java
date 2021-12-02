package com.example.dbapp5sem.repositories;

import com.example.dbapp5sem.modules.Dish;
import com.example.dbapp5sem.modules.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Order> findAll() {
        String SQL = "SELECT ord.*, co.client_id, wo.worker_id FROM `Order` as ord " +
                "JOIN Client_Order as co ON co.order_id = ord.order_id " +
                "JOIN Worker_Order as wo ON wo.order_id = ord.order_id";
        return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Order.class));
    }
}
