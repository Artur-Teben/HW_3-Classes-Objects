package main.java.com.teben;

import main.java.com.teben.circle.Circle;
import main.java.com.teben.count.ObjectCount;
import main.java.com.teben.car.Car;

public class Main {

    public static final double RADIUS = 7.14D;

    public static void main(String[] args) {
        Circle circle = new Circle(RADIUS);
        System.out.println(circle);

        new ObjectCount();
        new ObjectCount();
        new ObjectCount();
        new ObjectCount();

        System.out.println("Number of created objects = " + ObjectCount.getCount());

        Car firstCar = new Car("BMW", "X5", 2008);
        firstCar.startEngine();
        firstCar.setSpeed(-10);
        firstCar.setSpeed(300);
        firstCar.setSpeed(120);
        firstCar.stopEngine();
    }
}
        