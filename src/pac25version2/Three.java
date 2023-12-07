import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Three {
    public static void main(String[] args) {
        String input = "Текст со списками цен: 25.98 USD, 44 ERR, 0.004 EU";

        String regex = "\\d+(\\.\\d+)?\\s+(USD|RUB|EU)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String price = matcher.group();
            System.out.println(price);
        }
    }
}

// используем регулярное выражение \\b\\d+\\b(?![+]),
// которое ищет последовательности цифр (\\d+),
// за которыми не стоит знак "+" ((?![+])). Здесь \\b обозначает границу слова.