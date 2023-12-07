import java.util.regex.*;

public class Five {
    public static void main(String[] args) {
        String text = "29/02/2000";
        String pattern = "^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[012])/((19|20)\\d\\d)$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.println("Строка является датой в формате dd/mm/yyyy");
        } else {
            System.out.println("Строка не является датой в формате dd/mm/yyyy");
        }
    }
}

