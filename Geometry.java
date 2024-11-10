package geometry;

public abstract class GeometricObject implements GeometryInterface {

    protected double area;
    protected double perimeter;
    protected String color;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

package geometry;

public class Rectangle extends GeometricObject {

    private double length;
    private double height;

    public Rectangle(double length, double height, String color) {
        this.length = length;
        this.height = height;
        setColor(color);
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        area = length * height;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 2 * (length + height);
        return perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    public boolean isSquare() {
        return length == height;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));
    }

    public void resize(double scaleFactor) {
        this.length *= scaleFactor;
        this.height *= scaleFactor;
        calculateArea();
        calculatePerimeter();
    }
}
