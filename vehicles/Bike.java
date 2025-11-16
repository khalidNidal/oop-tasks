package vehicles;

public class Bike extends Vehicle {

    private int gearCount;

    public Bike(String model, int gearCount) {
        super(model);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    @Override
    public void start() {
        System.out.println("Bike is starting " + model);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", gearCount=" + gearCount +
                '}';
    }
}
