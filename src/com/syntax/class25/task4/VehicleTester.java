package com.syntax.class25.task4;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] cars ={new Sedan(12520,3.5), new Truck(43854,40)};
        for (Vehicle car:cars
        ) {
            System.out.println(car.calculateSalePrice());
        }
        // break till 1:23

    }
}
