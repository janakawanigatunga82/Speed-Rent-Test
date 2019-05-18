package com.speedrent.springdemo.service;

import com.speedrent.springdemo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    public Car getCar(){

        Car car = new Car();
        car.setManufacturer("BMW");
        car.setName("BMW Z4");
        return car;
    }
}
