import java.util.regex.*;

public class Four {
    public static void main(String[] args) {
        String text = "6 / 5 - 2 * 9. java";
        String pattern = "\\d(?![+])"; // Регулярное выражение для поиска цифр без знака "+"

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println("Найдены цифры без знака '+'");
        } else {
            System.out.println("Цифры без знака '+' не найдены");
        }
    }
}
