package pac312;

public class Circle {
    private Point center;
    private double radius;
    private double circumference;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        this.circumference = 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public Point getCenter() {
        return center;
    }
}
