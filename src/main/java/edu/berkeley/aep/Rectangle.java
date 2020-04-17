package edu.berkeley.aep;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.print(rectangle.getArea());
    }

    //static factory method
    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }
}

