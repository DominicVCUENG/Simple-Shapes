package assignment4;

public class Hexagon {
    private double sideLength;

    // Constructor
    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to calculate the area of the hexagon
    public double getArea() {
        return (3 * Math.sqrt(3) * sideLength * sideLength) / 2;
    }

    // Method to calculate the perimeter of the hexagon
    public double getPerimeter() {
        return 6 * sideLength;
    }

    // Method to set the side length of the hexagon
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to get the side length of the hexagon
    public double getSideLength() {
        return sideLength;
    }

    // Main method for testing
    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon(5.0);
        System.out.println("Area: " + hexagon.getArea());
        System.out.println("Perimeter: " + hexagon.getPerimeter());

        hexagon.setSideLength(7.0);
        System.out.println("New side length: " + hexagon.getSideLength());
        System.out.println("New area: " + hexagon.getArea());
        System.out.println("New perimeter: " + hexagon.getPerimeter());
    }
}

