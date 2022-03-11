package com.tasanah.restapi.models.repository;

import com.tasanah.restapi.models.entities.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long>{
    
}
