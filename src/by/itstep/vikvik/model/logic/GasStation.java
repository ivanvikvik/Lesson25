package by.itstep.vikvik.model.logic;

import by.itstep.vikvik.model.entity.abstracts.Transport;

public class GasStation {
    public static int calcTotalOil(Transport[] transports) {
        int total = 0;

        for (Transport transport : transports) {
            total += transport.getTank();
        }

        return total;
    }
}
