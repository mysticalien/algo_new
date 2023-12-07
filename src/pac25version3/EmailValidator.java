package pac25version3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {
        String validEmail1 = "user@example.com";
        String validEmail2 = "root@localhost";
        String invalidEmail1 = "myhost@@@@@@com.ru";
        String invalidEmail2 = "@my.ru";
        String invalidEmail3 = "Julia String";

        validateEmail(validEmail1);
        validateEmail(validEmail2);
        validateEmail(invalidEmail1);
        validateEmail(invalidEmail2);
        validateEmail(invalidEmail3);
    }

    private static void validateEmail(String email) {
        String pattern = "^[A-Za-z0-9._%+-]+@+((localhost)|([A-Za-z0-9.-]+\\.+((com)|(org)|(net))))$";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}

