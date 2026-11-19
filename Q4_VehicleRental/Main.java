class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void start() {
        System.out.println(brand + " " + model + " is starting...");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    void displayDetails() {
        System.out.println("--- Car ---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Doors : " + numberOfDoors);
        start();
    }
}

class Bike extends Vehicle {
    int engineCC;

    Bike(String brand, String model, int engineCC) {
        super(brand, model);
        this.engineCC = engineCC;
    }

    void displayDetails() {
        System.out.println("--- Bike ---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("CC    : " + engineCC);
        start();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Innova", 4);
        Bike bike = new Bike("Royal Enfield", "Classic 350", 350);
        car.displayDetails();
        System.out.println();
        bike.displayDetails();
    }
}
