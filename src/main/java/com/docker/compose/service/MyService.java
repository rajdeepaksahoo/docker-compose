package com.docker.compose.service;

import com.docker.compose.entity.MyEntity;

import java.util.List;

public interface MyService {
    public MyEntity addEntity(MyEntity myEntity);
    public List<MyEntity> allEntities(int page, int size);
    public MyEntity updateMyEntity(MyEntity myEntity);
    public MyEntity deleteMyEntity(MyEntity myEntity);
}
