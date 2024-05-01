package assignment4;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get the radius of the circle
    public double getRadius() {
        return radius;
    }
}

