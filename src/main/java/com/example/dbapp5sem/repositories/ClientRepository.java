package com.example.dbapp5sem.repositories;

import com.example.dbapp5sem.modules.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ClientRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Client> findAll() {
        return jdbcTemplate.query("SELECT * FROM Client", new BeanPropertyRowMapper<>(Client.class));
    }
}
