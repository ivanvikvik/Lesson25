package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.entity.Bus;
import by.itstep.vikvik.model.entity.Car;
import by.itstep.vikvik.model.entity.Truck;
import by.itstep.vikvik.model.entity.abstracts.Transport;
import by.itstep.vikvik.model.logic.GasStation;

public class Main {
    public static void main(String[] args) {
        A ref = new B();
        System.out.println(ref.value);  //
        System.out.println(ref.svalue);
        ref.test(); // <<--- new B()
        ref.stest();
    }
}
