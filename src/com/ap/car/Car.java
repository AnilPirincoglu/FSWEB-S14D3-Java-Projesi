package com.ap.car;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "*** Car *** \n" +
                "*engine= " + engine + "\n" +
                "*cylinders= " + cylinders + "\n" +
                "*name= " + name + "\n" +
                "*wheels= " + wheels;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName()+" the car's engine is starting");
    }
    public void accelerate(){
        System.out.println(getClass().getSimpleName()+" the car is accelerating");
    }
    public void brake(){
        System.out.println(getClass().getSimpleName()+" the car is braking");
    }

}
