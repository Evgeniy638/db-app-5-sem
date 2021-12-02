package com.example.dbapp5sem.services;

import com.example.dbapp5sem.modules.Client;
import com.example.dbapp5sem.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
