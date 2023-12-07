package pac25version3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();

            System.out.println("Choose an operation:");
            System.out.println("1. Extract words");
            System.out.println("2. Extract numbers");
            System.out.println("3. Extract email addresses");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    extractWords(inputString);
                    break;
                case 2:
                    extractNumbers(inputString);
                    break;
                case 3:
                    extractEmailAddresses(inputString);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void extractWords(String input) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        // "\b" is a word boundary anchor
        // "\w" represents any word character (alphanumeric character or underscore)
        // "+" means "one or more occurrences."
        Matcher matcher = pattern.matcher(input);

        System.out.println("Words in the string:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void extractNumbers(String input) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        // "\b" is a word boundary anchor
        // "\d" represents any digit (0-9)
        // "+" means "one or more occurrences."
        Matcher matcher = pattern.matcher(input);

        System.out.println("Numbers in the string:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void extractEmailAddresses(String input) {
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        // "\b" is a word boundary anchor
        // [A-Za-z0-9._%+-] represents a character class that includes uppercase
        // and lowercase letters, digits, and some special characters commonly
        // allowed in the local part of an email address.
        // @: The at symbol is a literal character used to separate the local part
        // from the domain part in an email address
        // "\\.": Dot (.)
        // {2,} means "two or more occurrences,"
        Matcher matcher = pattern.matcher(input);

        System.out.println("Email addresses in the string:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
