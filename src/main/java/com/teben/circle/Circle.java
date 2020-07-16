package main.java.com.teben.circle;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getCircleArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Area of the circle = " + getCircleArea();
    }
}
