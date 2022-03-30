package com.tasanah.restapi.models.repository;

import java.util.List;

import com.tasanah.restapi.models.entities.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long>{

    Supplier findByEmail(String email);
    
    List<Supplier> findByNameContainsOrderByIdDesc(String name);

    List<Supplier> findByNameStartingWith(String prefix);

    List<Supplier> findByNameContainsOrEmailContains(String name, String email);
}
