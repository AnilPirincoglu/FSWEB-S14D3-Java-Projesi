package com.ap.car.carRD;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + "'s engine is starting");

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(getName() + " is driving");
    }

    @Override
    protected void runEngine() {
        System.out.println(getName() + "'s engine is running");
    }

    @Override
    public String toString() {
        return "***HybridCar *** \n" +
                "*avgKmPerLitre= " + avgKmPerLitre + "\n" +
                "*batterySize= " + batterySize + "\n" +
                "*cylinders= " + cylinders;
    }
}
