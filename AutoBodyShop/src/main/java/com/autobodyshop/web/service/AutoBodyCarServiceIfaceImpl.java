package com.autobodyshop.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.autobodyshop.model.Car;
import com.autobodyshop.repository.CarMongoRepository;

@Service
public class AutoBodyCarServiceIfaceImpl implements AutoBodyCarServiceIface{
	
	@Autowired
	CarMongoRepository carMongoRepository;
	
	
	@Override
	public Iterable<Car> getcars() {
		
		Iterable<Car> allCars=carMongoRepository.findAll();
		return allCars;
	}

	@Override
	public Car getCar(String id) {
		
		Car car= (Car) carMongoRepository.findOne(id);
		return car;
	}

	@Override
	public Car createCar(Car car) {
		Car savedCar=(Car) carMongoRepository.save(car);
		return savedCar;
	}

	

	@Override
	public void delete(String id) {
		carMongoRepository.delete(id);
	}

	@Override
	public Car updateCar(Car car) {
		Car updateCar=(Car) carMongoRepository.save(car);
		return updateCar;
	}

}
