class Vehicle {
 String name ;
    Vehicle (String n){
        name = n ;
    }


    void start (){
        System.out.println("vehicle is starting " + name);
    }
}



class Bike extends Vehicle {
    int gearCount ;

    Bike (String n , int g){
        super(n);
        gearCount = g ;
    }

    @Override
    void start() {
        System.out.println("bike is starting " + name);
    }
}   

class Truck extends Vehicle {
    Double loadCapacity ;

    Truck (String n , Double l){
        super(n);
        loadCapacity = l ;
    }

    @Override
    void start() {
        System.out.println("truck is starting " + name);
    }
}


