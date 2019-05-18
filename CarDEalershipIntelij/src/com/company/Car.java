package com.company;

import java.util.LinkedList;
import java.util.List;

public class Car extends Vehicle {

    List<Vehicle> carsSolded = new LinkedList<>();

    public Car(String type, double price) {
        super(type, price);
    }
}
