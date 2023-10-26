package pac19;

import java.util.Scanner;
public class OnlinePurchase {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Введите ФИО: ");
        System.out.print("Введите номер ИНН: ");
        String inn = scanner.nextLine();
        if (isValidINN(inn)) {
            System.out.println("Номер ИНН действителен.");
        } else {
            throw new InvalidINNException("Номер ИНН недействителен!");
        }
    } catch (InvalidINNException e) {
        System.out.println(e.getMessage());        }
    }
    public static boolean isValidINN(String inn) {
        return inn.length() == 10 || inn.length() == 12;
    }
}
