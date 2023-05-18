package com.example.Videojuegos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.Videojuegos.models.VideogameModel;

public interface MyRepository extends CrudRepository<VideogameModel, Long> {
    
}
