import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eight {
    public static boolean isPasswordSecure(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[\\w\\d]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String password1 = "F032_Password";
        String password2 = "TrySpy1";
        String password3 = "smart_pass";
        String password4 = "A007";

        System.out.println(password1 + " is secure: " + isPasswordSecure(password1));
        System.out.println(password2 + " is secure: " + isPasswordSecure(password2));
        System.out.println(password3 + " is secure: " + isPasswordSecure(password3));
        System.out.println(password4 + " is secure: " + isPasswordSecure(password4));
    }
}
