class ElectricCar extends Car {
    int battaryCapacity ;

    public ElectricCar(String model, int year, Double price, int battaryCapacity) {
        super(model, year, price);
        this.battaryCapacity = battaryCapacity;
    }
    @Override
    void start() {
        System.out.println("Electric car is starting " + brand);
    }

}