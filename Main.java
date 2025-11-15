

import vehicles.Bike;
import vehicles.ElectricCar;
import vehicles.Truck;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();

        list.add(new Bike("Yamaha", 5));
        list.add(new Truck("Volvo", 10000.0));
        list.add(new ElectricCar("Tesla", 2024, 50000.0, 75));

        for (Vehicle v : list) {
            v.start();
            System.out.println(v);
        }
    }
}
