package main.java.com.teben.car;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setSpeed(int speed) {
        if (speed > 240) {
            System.out.println("It`s too fast");
        } else if (speed <= 0) {
            System.out.println("Car isn`t moving");
        } else if (speed > 0 && speed <= 240) {
            System.out.println("Car speed: " + speed + " km/h");
            this.speed = speed;
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void startEngine() {
        System.out.println("Car " + brand + " model " + model + " year " + year + " Started engine!");
    }

    public void stopEngine() {
        System.out.println("Car " + brand + " model " + model + " year " + year + " Stoped engine!");
    }

}
