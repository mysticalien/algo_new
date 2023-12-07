import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        String input = "Hello, world! This is a test";

        String regex = "\\b\\w +\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Результат:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
