package com.builder;

import com.domain.Car;
import com.domain.Engine;

public class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private int mileage;
	private String engineType;

    

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder mileage(int mileage) {
        this.mileage = mileage;
        return this;
    }
    
    public CarBuilder engineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    
   
    public Car build() {
        return new Car(make, model, year, color, mileage, new Engine(engineType, 10));
    }
}

