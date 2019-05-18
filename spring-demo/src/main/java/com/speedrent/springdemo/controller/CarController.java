package com.speedrent.springdemo.controller;

import com.speedrent.springdemo.model.Car;
import com.speedrent.springdemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {


    @Autowired
    private CarService carService;

    @RequestMapping(value = "/hello" , produces = "application/json")
    public Car getCar()
    {
        return carService.getCar();
    }
}
