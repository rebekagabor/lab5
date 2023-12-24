class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Constructor pentru clasa parinte (Vehicle)
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter și setter pentru brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter și setter pentru model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter și setter pentru year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor pentru clasa copil (Car)
    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter și setter pentru numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasFairing;

    // Constructor pentru clasa copil (Motorcycle)
    public Motorcycle(String brand, String model, int year, boolean hasFairing) {
        super(brand, model, year);
        this.hasFairing = hasFairing;
    }

    // Getter și setter pentru hasFairing
    public boolean hasFairing() {
        return hasFairing;
    }

    public void setHasFairing(boolean hasFairing) {
        this.hasFairing = hasFairing;
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplu de utilizare
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, true);

        // Afișare atribute pentru mașină
        System.out.println("Car - Brand: " + car.getBrand() + ", Model: " + car.getModel() +
                ", Year: " + car.getYear() + ", Doors: " + car.getNumberOfDoors());

        // Afișare atribute pentru motocicletă
        System.out.println("Motorcycle - Brand: " + motorcycle.getBrand() + ", Model: " + motorcycle.getModel() +
                ", Year: " + motorcycle.getYear() + ", Fairing: " + motorcycle.hasFairing());
    }
}
