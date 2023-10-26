package pac2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Поиск компьютера");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буффера

            switch (choice) {
                case 1:
                    System.out.print("Введите бренд компьютера: ");
                    String brand = scanner.nextLine();
                    System.out.print("Введите модель компьютера: ");
                    String model = scanner.nextLine();
                    shop.addComputer(brand, model);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;
                case 2:
                    System.out.print("Введите бренд компьютера для удаления: ");
                    brand = scanner.nextLine();
                    System.out.print("Введите модель компьютера для удаления: ");
                    model = scanner.nextLine();
                    shop.removeComputer(brand, model);
                    System.out.println("Компьютер удален из магазина.");
                    break;
                case 3:
                    System.out.print("Введите бренд компьютера для поиска: ");
                    brand = scanner.nextLine();
                    List<Computer> searchResults = shop.searchComputers(brand);
                    if (searchResults.isEmpty()) {
                        System.out.println("Компьютеры с таким брендом не найдены.");
                    } else {
                        System.out.println("Найденные компьютеры:");
                        for (Computer computer : searchResults) {
                            System.out.println(computer);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильный выбор. Попробуйте снова.");

            }
        }
    }
}
