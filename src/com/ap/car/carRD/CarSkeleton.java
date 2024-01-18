package com.ap.car.carRD;

import java.util.Objects;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
    }

    public void drive() {
        runEngine();
    }

    protected void runEngine() {}

    @Override
    public String toString() {
        return "*** CarSkeleton ***" + '\n' +
                "*name= " + name + '\n' +
                "*description= " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarSkeleton that = (CarSkeleton) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description);
    }

}
