package task22;

import javax.script.ScriptEngine;import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;import javax.script.ScriptException;
public class CalculatorModel {
    private String expression;
    public CalculatorModel() {
        this.expression = "";
    }
    public void addToExpression(String value) {
        expression += value;
    }
    public void calculate() {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result = engine.eval(expression);
            expression = result.toString();
        } catch (ScriptException e) {
            expression = "Ошибка";
        }
    }
    public void clear() {
        expression = "";
    }
    public String getExpression() {
        return expression;
    }
    public String getResult() {
        return expression;
    }
}
