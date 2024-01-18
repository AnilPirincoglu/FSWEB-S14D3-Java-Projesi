package com.ap.car.carRD;

public class GasPowderCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPowderCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
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
        return "*** GasPowderCar ***" + "\n"+
                "*avgKmPerLitre= " + avgKmPerLitre +"\n"+
                "*cylinders= " + cylinders;
    }
}
