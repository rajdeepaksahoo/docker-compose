package com.docker.compose.repository;

import com.docker.compose.entity.MyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyRepo extends JpaRepository<MyEntity,Long> {
    Page<MyEntity> findAll(Pageable pageable);}

