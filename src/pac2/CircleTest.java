package pac2;

public class CircleTest {
    public static void main(String[] args) {
        // Создаем два объекта Circle
        Circle2 circle1 = new Circle2(5.0);
        Circle2 circle2 = new Circle2(3.0);

        // Вывод информации о первой окружности
        System.out.println("Окружность 1:");
        System.out.println("Радиус: " + circle1.getRadius());
        System.out.println("Площадь: " + circle1.calculateArea());
        System.out.println("Длина окружности: " + circle1.calculatePerimeter());

        // Вывод информации о второй окружности
        System.out.println("\nОкружность 2:");
        System.out.println("Радиус: " + circle2.getRadius());
        System.out.println("Площадь: " + circle2.calculateArea());
        System.out.println("Длина окружности: " + circle2.calculatePerimeter());

        // Сравнение окружностей
        if (circle1.isEqualTo(circle2)) {
            System.out.println("\nОкружности равны по радиусу.");
        } else {
            System.out.println("\nОкружности разные по радиусу.");
        }
    }

}
