package com.speedrent.springdemo.controller;


import com.speedrent.springdemo.model.Car;
import com.speedrent.springdemo.service.CarService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.client.RestTemplate;


@RunWith(MockitoJUnitRunner.Silent.class)
@SpringBootTest
public class CarControllerIntegrationTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private CarService carService;

    @Test
    public void testGetCar() {
        Car testCar = createTestCar();

        Mockito.when(restTemplate.getForEntity("http://localhost:8080/hello", Car.class))
          .thenReturn(new ResponseEntity(testCar, HttpStatus.OK));

        Car car = carService.getCar();
        Assert.assertEquals(car, testCar);
    }

    private Car createTestCar(){
        Car car = new Car();
        car.setManufacturer("BMW");
        car.setName("BMW Z4");
        return car;
    }
}
