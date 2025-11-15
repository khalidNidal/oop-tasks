package vehicles;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String model, double loadCapacity) {
        super(model);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting " + model);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
