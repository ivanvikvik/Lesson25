package by.itstep.vikvik.model.entity;

import by.itstep.vikvik.model.entity.abstracts.Transport;

public class Truck extends Transport {
    // ...
    private int volume;


    public Truck() {
    }

    public Truck(int tank, int volume) {
        super(tank);
        this.volume = volume;
    }

    public int getTank() {
        System.out.println("getTank from Truck class");
        return super.getTank() + volume;
    }
}
