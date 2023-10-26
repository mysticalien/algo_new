package pac18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Enter an integer");
                String intString = scanner.next();
                int i = Integer.parseInt(intString);
                System.out.println( 2 / i );
            } catch (ArithmeticException e){
                System.out.println("Недопустимая арифметическая операция");
            } catch (NumberFormatException e) {
                System.out.println("Недопустимое значение");
            } catch (Exception e) {
                System.out.println("Возникло исключение");
            } finally {
                System.out.println("Блок finally");
                scanner.close();
        }

    }
    }

    public static void main(String[] args) {
        Exception2 num = new Exception2();
        num.exceptionDemo();
    }
}
