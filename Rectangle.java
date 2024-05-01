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

    // Main method for testing
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        rectangle.setLength(6.0);
        rectangle.setWidth(8.0);
        System.out.println("New length: " + rectangle.getLength());
        System.out.println("New width: " + rectangle.getWidth());
        System.out.println("New area: " + rectangle.getArea());
        System.out.println("New perimeter: " + rectangle.getPerimeter());
    }
}

