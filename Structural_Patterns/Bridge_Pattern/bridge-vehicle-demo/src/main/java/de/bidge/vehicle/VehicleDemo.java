package de.bidge.vehicle;

/**
 * Bridge Vehicle Demo!
 *
 */
public class VehicleDemo {

    private VehicleDemo() {

    }

    public static void main(String[] args) {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

    }
}
