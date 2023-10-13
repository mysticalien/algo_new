package pac312;

import java.util.Arrays;
import java.util.Random;

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
            System.out.println("Массив полон. Невозможно добавить боольше окружностей.");
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 0; i < count; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (count == 0) {
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void orderCircleByRadius() {
        Arrays.sort(circles, 0, count, (circle1, circle2) -> Double.compare(circle1.getRadius(), circle2.getRadius()));
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            double x = random.nextDouble() * 10;
            double y = random.nextDouble() * 10;
            double radius = random .nextDouble() * 5;
            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        System.out.println("Самая маленькая окружность:");
        System.out.println(tester.findSmallestCircle().getRadius());

        System.out.println("\nСамая большая окружность:");
        System.out.println(tester.findLargestCircle().getRadius());

        System.out.println("\nОкружности, отсортированные по радиусу:");
        tester.orderCircleByRadius();
        for (int i = 0; i < tester.count; i++) {
            System.out.println("Радиус: " + tester.circles[i].getRadius());
        }
    }
}

