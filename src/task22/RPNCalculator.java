package task22;
import java.util.Stack;

public class RPNCalculator {
    public static Double calculate(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);            }
        }
        return stack.pop();
    }
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static double performOperation(String operator, double operand1, double operand2) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };
    }
    public static void main(String[] args) {
        String expression = "5 1 2 + 4 * + 3 -"; // Выражение: (5 + (1 + 2) * 4) - 3 = 14
        Double result = calculate(expression);
        System.out.println("Результат: " + result);
    }
}
