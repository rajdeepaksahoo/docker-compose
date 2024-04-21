package com.docker.compose.service.impl;

import com.docker.compose.entity.MyEntity;
import com.docker.compose.repository.MyRepo;
import com.docker.compose.service.MyService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MyServiceImpl implements MyService {
    private MyRepo myRepo;
    @Override
    public MyEntity addEntity(MyEntity myEntity) {
        return myRepo.save(myEntity);
    }

    @Override
    public List<MyEntity> allEntities(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return myRepo.findAll(pageRequest).stream().toList();
    }

    @Override
    public MyEntity updateMyEntity(MyEntity myEntity) {
        return myRepo.save(myEntity);
    }

    @Override
    public MyEntity deleteMyEntity(MyEntity myEntity) {
        MyEntity found = myRepo.findById(myEntity.getId()).orElseThrow(() -> new RuntimeException("Not Found"));
        myRepo.delete(found);
        return found;
    }
}
