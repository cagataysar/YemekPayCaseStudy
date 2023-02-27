package com.main.YemekPayCaseStudy.controller;

import com.main.YemekPayCaseStudy.model.ToDo;
import com.main.YemekPayCaseStudy.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
@AllArgsConstructor
public class ToDoController {

    private ToDoService service;

    @PostMapping(path = "todo")
    public ToDo createToDo(@RequestBody ToDo toDo) {
        // localhost:9090/api/save
        return service.createToDo(toDo);
    }

    @GetMapping("todo")
    public List<ToDo> getAll() {
        return service.getAll();
    }

    @GetMapping("todo/{id}")
    public ToDo getById(@PathVariable(name = "id") Integer id) {
        return service.getById(id);
    }

    @DeleteMapping(path = "todo/{id}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "id") Integer id)
    {
        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Silindi");
    }

    @PutMapping(path = "todo/{id}")
    public ResponseEntity<ToDo> updateToDo(@PathVariable(name = "id") Integer id,@RequestBody ToDo toDo) {
        // localhost:9090/api/todo/1
        return service.updateToDo(id, toDo);
    }
}
