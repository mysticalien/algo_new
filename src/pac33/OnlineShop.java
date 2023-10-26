package pac33;

import java.util.Scanner;

import static pac33.Currency.EUR;
import static pac33.Currency.RUB;

public class OnlineShop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите стоимость товара:");
            double price = scanner.nextDouble();
            double convertedPrice = RUB.convert(EUR, price);
            System.out.printf("Стоимость товара в выбранной валюте: %.2f%n", convertedPrice);
        }
    }
}
