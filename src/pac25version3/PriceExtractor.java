package pac25version3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = "This item costs 25.98 USD. Another item costs 3000 RUB, and a third item costs 20.00 EUR. But 44 ERR and 0.004 EU are not valid prices.";
        
        Pattern pattern = Pattern.compile("\\d+(\\.\\d{2})? (USD|RUB|EUR)");
        // "\d+" matches one or more digits
        // "\\.": Dot (.)
        // "\d{2}" matches exactly two digits
        // "?" makes the entire group optional (matches 0 or 1 occurrences)

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found a price: " + matcher.group());
        }
    }
}

