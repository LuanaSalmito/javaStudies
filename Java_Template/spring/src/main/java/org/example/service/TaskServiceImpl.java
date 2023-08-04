package org.example.service;

import org.example.entity.Task;
import org.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl {

    @Autowired
    private TaskRepository repository;

    public List<Task> getAll(){
        return repository.findAll();
    }

    public Task create(Task task){
        return repository.save(task);
    }


}
