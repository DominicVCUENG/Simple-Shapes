package assignment4;

public class Square {
    private double sideLength;

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to get the area of the square
    public double getArea() {
        return sideLength * sideLength;
    }

    // Method to get the perimeter of the square
    public double getPerimeter() {
        return 4 * sideLength;
    }

    // Method to set the side length of the square
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // Method to get the side length of the square
    public double getSideLength() {
        return sideLength;
    }
}

