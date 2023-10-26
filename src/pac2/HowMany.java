package pac2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов в строке: " + wordCount);
    }

    private static int countWords(String input) {
        String[] words = input.split("[\\s\\t,.;]+"); // Разделение строки на слова по пробелам

        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
