import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "abcdefghijklmnopqrstuv18340";

        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Строка соответствует регулярному выражению.");
        } else {
            System.out.println("Строка не соответствует регулярному выражению.");
        }
    }
}
//регулярное выражение "\\d+(\\.\\d+)?\\s+(USD|RUB|EU)"
// ищет последовательности символов, которые начинаются с одной или более цифр,
// за которыми может следовать десятичная часть (если есть),
// и после которых идет пробел и одна из строк "USD", "RUB" или "EU".