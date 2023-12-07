package pac25version3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidation {

    public static void main(String[] args) {
        String input1 = "abcdefghghijklmnopqrstuv18340"; // Example of a valid expression
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340"; // Example of an incorrect expression

        System.out.println("String 1 is valid: " + isValidExpression(input1));
        System.out.println("String 2 is valid: " + isValidExpression(input2));
    }

    private static boolean isValidExpression(String input) {
        String pattern = "abcdefghghijklmnopqrstuv18340";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(input);

        return matcher.matches();
    }
}

