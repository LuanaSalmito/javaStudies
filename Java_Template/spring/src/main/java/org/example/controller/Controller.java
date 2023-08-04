package org.example.controller;

import org.example.entity.Task;
import org.example.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class Controller {

    @Autowired
    private TaskServiceImpl service;

    @GetMapping
    public List<Task> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Task create(@RequestBody Task task){
        return service.create(task);
    }

}
