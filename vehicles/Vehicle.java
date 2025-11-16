package vehicles;

public abstract class Vehicle {

    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Vehicle{model='" + model + "'}";
    }
}
