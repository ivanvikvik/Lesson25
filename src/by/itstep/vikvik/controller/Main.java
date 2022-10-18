package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.entity.Bus;
import by.itstep.vikvik.model.entity.Car;
import by.itstep.vikvik.model.entity.Truck;
import by.itstep.vikvik.model.entity.abstracts.Transport;
import by.itstep.vikvik.model.logic.GasStation;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

//        Car car1 = new Car();
//        Car car2 = new Car();
//        Bus bus1 = new Bus();
//        Bus bus2 = new Bus();
//        Bus bus3 = new Bus();
//
//        Transport[] transports = {car1, car2, bus1, bus2, bus3};

        Transport[] transports = {new Car(50), new Car(40),
                new Bus(110), new Bus(200), new Bus(300),
                new Truck(500, 1000)};

        int total = GasStation.calcTotalOil(transports);

        System.out.println("Total oil: " + total);

    }
}
