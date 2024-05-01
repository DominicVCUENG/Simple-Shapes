package assignment4;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to calculate the area of the triangle using Heron's formula
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate the perimeter of the triangle
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Method to set the length of side 1
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    // Method to set the length of side 2
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // Method to set the length of side 3
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Method to get the length of side 1
    public double getSide1() {
        return side1;
    }

    // Method to get the length of side 2
    public double getSide2() {
        return side2;
    }

    // Method to get the length of side 3
    public double getSide3() {
        return side3;
    }

    // Main method for testing
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        triangle.setSide1(6.0);
        triangle.setSide2(8.0);
        triangle.setSide3(10.0);
        System.out.println("New side lengths: " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3());
        System.out.println("New area: " + triangle.getArea());
        System.out.println("New perimeter: " + triangle.getPerimeter());
    }
}

