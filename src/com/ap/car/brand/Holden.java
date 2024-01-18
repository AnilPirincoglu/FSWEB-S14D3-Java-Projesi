package com.ap.car.brand;

import com.ap.car.Car;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+" "+getName()+"'s engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName()+" "+getName()+" is braking");
    }
}
