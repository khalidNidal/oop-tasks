
import java.util.ArrayList;
import java.util.List;

class Car {

    String brand;
    int year;
    Double price;

    Car(String b, int y, Double p) {
        brand = b;
        year = y;
        price = p;
    }

    void start() {
        System.out.println("car is starting " + brand);
    }

    void stop() {
        System.out.println("car is stopping " + brand);
    }

}

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020, 30000.0);
        myCar.start();
        myCar.stop();
        Car myCar2 = new Car("Honda", 2019, 25000.0);
        myCar2.start();
        myCar2.stop();

        List<Vehicle> list = new ArrayList<>();
        list.add(new Bike("Yamaha", 5));
        list.add(new Truck("Volvo", 10000.0));

        for (Vehicle v : list) {
            v.start();
        }

        ////////////////////
         BankAccount acc = new BankAccount(100);

        System.out.println("Initial balance: " + acc.getBalance());

         acc.withdraw(120);

    }

}
