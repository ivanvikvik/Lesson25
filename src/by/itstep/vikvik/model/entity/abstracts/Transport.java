package by.itstep.vikvik.model.entity.abstracts;

// abstract-entity
public class Transport {
    private int tank;

    public Transport() {
    }

    public Transport(int tank) {
        this.tank = tank;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }
}
