package vehicles;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String model, int year, double price, int batteryCapacity) {
        super(model, year, price);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting " + getModel());
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
