package com.speedrent.springdemo.model;

import java.io.Serializable;

public class Car implements Serializable {

    private String name;
    private String manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Car)) {
            return false;
        }

        Car car = (Car) o;

        return car.name.equals(name) &&
                car.manufacturer.equals(manufacturer);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + manufacturer.hashCode();
        return result;
    }
}
