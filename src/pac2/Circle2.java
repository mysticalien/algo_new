package pac2;

public class Circle2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isEqualTo(Circle2 otherCircle) {
        return this.radius == otherCircle.radius;
    }
}
