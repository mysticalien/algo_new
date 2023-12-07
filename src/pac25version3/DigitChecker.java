package pac25version3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitChecker {
    public static void main(String[] args) {
        String text = "6 / 5 - 2 - 9";

        Pattern pattern = Pattern.compile("\\d((\\s)?\\+)");
        // "\\s" - whitespace

        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


