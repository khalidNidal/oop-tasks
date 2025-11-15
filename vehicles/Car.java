package vehicles;

public class Car extends Vehicle {

    private int year;
    private double price;

    public Car(String model, int year, double price) {
        super(model);
        this.year = year;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void start() {
        System.out.println("Car is starting " + model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
