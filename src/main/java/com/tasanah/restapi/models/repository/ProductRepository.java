package com.tasanah.restapi.models.repository;

import java.util.List;

import com.tasanah.restapi.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
    List<Product> findByNameContains(String name);
}
