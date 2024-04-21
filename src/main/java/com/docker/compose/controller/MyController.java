package com.docker.compose.controller;

import com.docker.compose.entity.MyEntity;
import com.docker.compose.service.MyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MyController {
    private MyService service;
    @PostMapping
    public ResponseEntity<MyEntity> add(@RequestBody MyEntity entity){
        return new ResponseEntity<>(service.addEntity(entity), HttpStatus.CREATED);
    }
    @GetMapping
    private ResponseEntity<List<MyEntity>> all(@RequestParam("page") int page,@RequestParam("size") int size){
        return new ResponseEntity<>(service.allEntities(page,size),HttpStatus.FOUND);
    }

    @PutMapping
    public ResponseEntity<MyEntity> update(@RequestBody MyEntity entity){
        return new ResponseEntity<>(service.updateMyEntity(entity), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<MyEntity> delete(@RequestBody MyEntity entity){
        return new ResponseEntity<>(service.deleteMyEntity(entity), HttpStatus.OK);
    }
}
