package com.js.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="personBean")
public class Person {

    private String name = "Lucy";

    public String getName() {
        return name;
    }

    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.printf("Person bean created by Spring");
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setName(String name) {
        this.name = name;
    }
}
