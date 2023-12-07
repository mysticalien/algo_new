package pac22version2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RPNCalculatorTest {

    @Test
    void testSimpleAddition() {
        String[] expression = {"2", "3", "+"};
        double result = RPNCalculator.evaluateRPN(expression);
        assertEquals(5.0, result);
    }

    @Test
    void testSimpleSubtraction() {
        String[] expression = {"5", "3", "-"};
        double result = RPNCalculator.evaluateRPN(expression);
        assertEquals(2.0, result);
    }

    @Test
    void testSimpleMultiplication() {
        String[] expression = {"2", "3", "*"};
        double result = RPNCalculator.evaluateRPN(expression);
        assertEquals(6.0, result);
    }

    @Test
    void testSimpleDivision() {
        String[] expression = {"6", "3", "/"};
        double result = RPNCalculator.evaluateRPN(expression);
        assertEquals(2.0, result);
    }

    @Test
    void testComplexExpression() {
        String[] expression = {"2", "3", "+", "4", "*"};
        double result = RPNCalculator.evaluateRPN(expression);
        assertEquals(20.0, result);
    }

    @Test
    void testExpressionWithDecimals() {
        String[] expression = {"3.5", "2", "+"};
        double result = RPNCalculator.evaluateRPN(expression);
        assertEquals(5.5, result);
    }

    @Test
    void testDivisionByZero() {
        String[] expression = {"5", "0", "/"};
        assertThrows(ArithmeticException.class, () -> RPNCalculator.evaluateRPN(expression));
    }

    @Test
    void testInvalidToken() {
        String[] expression = {"2", "a", "+"};
        assertThrows(IllegalArgumentException.class, () -> RPNCalculator.evaluateRPN(expression));
    }

    @Test
    void testNotEnoughOperands() {
        String[] expression = {"2", "+"};
        assertThrows(IllegalArgumentException.class, () -> RPNCalculator.evaluateRPN(expression));
    }

    @Test
    void testEmptyExpression() {
        String[] expression = {};
        assertThrows(IllegalArgumentException.class, () -> RPNCalculator.evaluateRPN(expression));
    }
}

