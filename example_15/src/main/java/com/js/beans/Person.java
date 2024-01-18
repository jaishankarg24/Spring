package com.js.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="personBean")
@Lazy
public class Person {

    private String name = "Lucy";

    public String getName() {
        return name;
    }

    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setName(String name) {
        this.name = name;
    }
}
