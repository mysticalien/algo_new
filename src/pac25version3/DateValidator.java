package pac25version3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {

    public static void main(String[] args) {
        String validDate1 = "29/02/2000"; // Example of a valid date
        String validDate2 = "30/04/2003"; // Example of a valid date
        String validDate3 = "01/01/2003"; // Example of a valid date
        String invalidDate2 = "30-04-2003"; // Example of an invalid date
        String invalidDate3 = "1/1/1899";   // Example of an invalid date

        validateDate(validDate1);
        validateDate(validDate2);
        validateDate(validDate3);
        validateDate(invalidDate2);
        validateDate(invalidDate3);
    }

    private static void validateDate(String date) {
        String pattern = "^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/((19|([2-9][0-9]))\\d\\d)$";
        // "$" - end of the line
        // "^" - start of the line

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(date);

        if (matcher.matches()) {
            System.out.println(date + " is a valid date.");
        } else {
            System.out.println(date + " is not a valid date.");
        }
    }
}

