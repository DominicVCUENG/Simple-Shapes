package assignment4;

public class Octagon {
    private double sideLength;

    // Constructor
    public Octagon(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to calculate the area of the octagon
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * sideLength * sideLength;
    }

    // Method to calculate the perimeter of the octagon
    public double getPerimeter() {
        return 8 * sideLength;
    }

    // Method to set the side length of the octagon
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to get the side length of the octagon
    public double getSideLength() {
        return sideLength;
    }

    // Main method for testing
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5.0);
        System.out.println("Area: " + octagon.getArea());
        System.out.println("Perimeter: " + octagon.getPerimeter());

        octagon.setSideLength(7.0);
        System.out.println("New side length: " + octagon.getSideLength());
        System.out.println("New area: " + octagon.getArea());
        System.out.println("New perimeter: " + octagon.getPerimeter());
    }
}

