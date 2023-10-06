package pac2;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Масик полон.");
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        Point center1 = new Point(1.0, 2.0);
        Circle circle1 = new Circle(center1, 3.0);
        tester.addCircle(circle1);

        Point center2 = new Point(0.0, 0.0);
        Circle circle2 = new Circle(center2, 2.5);
        tester.addCircle(circle2);

        Point center3 = new Point(-2.0, -3.0);
        Circle circle3 = new Circle(center3, 4.0);
        tester.addCircle(circle3);

        for (int i = 0; i < tester.count; i++) {
            Circle circle = tester.circles[i];
            Point center = circle.getCenter();
            double radius = circle.getRadius();
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("Центр: (" + center.getX() + ", " + center.getY() + ")");
            System.out.println("Радиус: " + radius);
            System.out.println();
        }
    }
}
