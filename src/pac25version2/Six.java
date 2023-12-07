import java.util.regex.*;

public class Six {
    public static void main(String[] args) {
        String text = "user@example.com";
        String pattern = "^((\"[\\w\\d\\S]+\")|([\\w\\d\\S]+))@[a-zA-Z]+\\.[a-zA-Z]+$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.println("Является допустимым е-mail адресом согласно RFC под номером 2822. \n");
        } else {
            System.out.println("Не является.");
        }
    }
}

