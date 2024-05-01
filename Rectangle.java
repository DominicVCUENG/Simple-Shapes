package assignment4;

public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Method to set the length of the rectangle
    public void setLength(double length) {
        this.length = length;
    }

    // Method to set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to get the length of the rectangle
    public double getLength() {
        return length;
    }

    // Method to get the width of the rectangle
    public double getWidth() {
        return width;
    }
}

