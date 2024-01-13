package com.js.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name="Lucy";
   // private final Vehicle vehicle;

//    @Autowired - 3. Constructor - production ready recommendation.
    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */
    /* @Autowired -1. class fields - not production ready recommendation. (private final Vehicle vehicle; - vehicle bean yet to be created) */
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    /*@Autowired - 2. setter method - not production ready recommendation.
     private Vehicle vehicle;
    * */
//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}