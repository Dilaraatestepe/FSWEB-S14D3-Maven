package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {




            CarSkeleton gasCar = new GasPoweredCar(15.5, 6);
            CarSkeleton electricCar = new ElectricCar(75.0, 200);
            CarSkeleton hybridCar = new HybridCar(12.5, 5, 5);





    }
}