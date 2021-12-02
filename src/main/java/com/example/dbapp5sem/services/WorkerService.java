package com.example.dbapp5sem.services;

import com.example.dbapp5sem.modules.Worker;
import com.example.dbapp5sem.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerService {
    private final WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public void create(Worker worker) {
        workerRepository.create(worker);
    }

    public void delete(Integer id) {
        workerRepository.delete(id);
    }
}
