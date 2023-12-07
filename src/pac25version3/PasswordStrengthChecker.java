package pac25version3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        String strongPassword1 = "F032_Password"; // Example of a strong password
        String strongPassword2 = "TrySpy1_";        // Example of a strong password
        String weakPassword1 = "smart_pass";       // Example of a weak password
        String weakPassword2 = "A007";             // Example of a weak password

        checkPasswordStrength(strongPassword1);
        checkPasswordStrength(strongPassword2);
        checkPasswordStrength(weakPassword1);
        checkPasswordStrength(weakPassword2);
    }

    private static void checkPasswordStrength(String password) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(_?).{8,}$";
        // "?=" is the syntax for a positive lookahead assertion
        // ".*" : Any Character Zero or More Times (except for a newline)
        // ".{8,}": Matches any character (except for a newline)

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(password);

        if (matcher.matches()) {
            System.out.println(password + " is a strong password.");
        } else {
            System.out.println(password + " is not a strong password.");
        }
    }
}

