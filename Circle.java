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

    // Main method for testing
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(5.0);
        System.out.println("New radius: " + circle.getRadius());
        System.out.println("New area: " + circle.getArea());
        System.out.println("New circumference: " + circle.getCircumference());
    }
}

