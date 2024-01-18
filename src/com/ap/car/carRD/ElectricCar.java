package com.ap.car.carRD;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName()+"'s engine is starting");

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(getName()+" is driving");
    }

    @Override
    protected void runEngine() {
        System.out.println(getName()+"'s engine is running");
    }

    @Override
    public String toString() {
        return "*** ElectricCar ***" + "\n"+
                "*avgKmPerCharge= " + avgKmPerCharge +"\n"+
                "*batterySize= " + batterySize;
    }
}
