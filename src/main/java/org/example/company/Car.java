package org.example.company;

import java.util.Objects;

public class Car {


    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        System.out.println("Class name : "+ getClass().getSimpleName());
        return "the car's engine is starting";

    }

    public String accelerate() {
        System.out.println("Class name : "+ getClass().getSimpleName());
        return "the car is accelerating";

    }

    public String brake() {
        System.out.println("Class name : "+ getClass().getSimpleName());
        return "the car is braking";

    }





    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }
}
