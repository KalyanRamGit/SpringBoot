package com.autobodyshop.web.service;

import com.autobodyshop.model.Car;

public interface AutoBodyCarServiceIface {
	
	
	public Iterable<Car> getcars();
	public Car getCar(String id);
	public Car createCar(Car car);
	public Car updateCar(Car car);
	public void delete (String id);

}
