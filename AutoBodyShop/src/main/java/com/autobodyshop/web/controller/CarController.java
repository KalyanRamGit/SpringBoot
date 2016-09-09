package com.autobodyshop.web.controller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.autobodyshop.model.Car;
import com.autobodyshop.repository.CarSearchRepository;
import com.autobodyshop.web.service.AutoBodyCarServiceIface;

@RestController
public class CarController {

	@Autowired
	AutoBodyCarServiceIface aubtoBodyCarservice;

	@Autowired
	CarSearchRepository carSearchRepository;

	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<Car>> getCars() {

		Iterable<Car> findAllCars = aubtoBodyCarservice.getcars();
		return new ResponseEntity<Iterable<Car>>(findAllCars, HttpStatus.OK);

	}

	@RequestMapping(value = "/home/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Car> getCar(@PathVariable("id") String id) {
		Car car = aubtoBodyCarservice.getCar(id);
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}

	@RequestMapping(value = "/home/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Car> updateCar(@RequestBody Car car) {
		Car updateCar = aubtoBodyCarservice.createCar(car);
		return new ResponseEntity<Car>(updateCar, HttpStatus.OK);
	}

	@RequestMapping(value = "/addCar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Car> createCar(@RequestBody Car car) {
		Car createCar = aubtoBodyCarservice.createCar(car);
		return new ResponseEntity<Car>(createCar, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/home/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Car> deleteCar(@PathVariable("id") String id,
			@RequestBody Car greeting) {
		aubtoBodyCarservice.delete(id);
		// Greeting with id is delete and the Webservice Reponse Body is empty.
		return new ResponseEntity<Car>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/search", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Collection<Car>> search(@RequestParam String search) {
		Collection<Car> carCollection=carSearchRepository.searchCars(search);
		return new ResponseEntity<Collection<Car>>(carCollection, HttpStatus.OK);
    }

}
