package pac22;

import java.util.Hashtable;
import java.util.Stack;

public class Calc {
    public static double evaluate(String expr) {
        if (expr.isEmpty()) return 0;

        int start = 0;

        Stack<Double> stack = new Stack<>();

        do {
            // find the next space
            int space = expr.substring(start).indexOf(' ');
            int end = space == -1 ? expr.length() : start + space;
            // get the next number or operator
            String current = expr.substring(start, end);
            // if current is an operator, apply operation to top 2 on stack
            if ("+-*/".indexOf(current.charAt(0)) != -1) {
                Double a = stack.pop();
                Double b = stack.pop();
                stack.push(operate(current.charAt(0), b, a));
            } else {
                stack.push(Double.parseDouble(current));
            }
            start = end + 1;
        } while (start < expr.length());

        double result = stack.pop();

        while (!stack.isEmpty()) {
            double current = stack.pop();
            result = current > result ? current : result;
        }
        return result;
    }

    public static double operate(char operator, double a, double b) {
        Hashtable<Character, Double> opHash = new Hashtable<>();
        opHash.put('+', a + b);
        opHash.put('-', a - b);
        opHash.put('*', a * b);
        opHash.put('/', a / b);

        return opHash.get(operator);
    }
}

