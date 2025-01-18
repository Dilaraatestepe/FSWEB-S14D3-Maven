package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLiter, int cylinders) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLiter(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
