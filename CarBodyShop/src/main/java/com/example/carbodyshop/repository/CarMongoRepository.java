package com.example.carbodyshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.carbodyshop.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String> {

}
