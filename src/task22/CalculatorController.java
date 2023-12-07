package task22;

import java.awt.event.ActionEvent;import java.awt.event.ActionListener;
public class CalculatorController {
    private final CalculatorModel model;
    private final CalculatorView view;
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        // Добавление слушателей кнопок
        view.setButton0Listener(new ButtonListener("0"));
        view.setButton1Listener(new ButtonListener("1"));
        view.setButton2Listener(new ButtonListener("2"));
        view.setButton3Listener(new ButtonListener("3"));
        view.setButton4Listener(new ButtonListener("4"));
        view.setButton5Listener(new ButtonListener("5"));
        view.setButton6Listener(new ButtonListener("6"));
        view.setButton7Listener(new ButtonListener("7"));
        view.setButton8Listener(new ButtonListener("8"));
        view.setButton9Listener(new ButtonListener("9"));
        view.setButtonPlusListener(new ButtonListener("+"));
        view.setButtonMinusListener(new ButtonListener("-"));
        view.setButtonMultiplyListener(new ButtonListener("*"));
        view.setButtonDivideListener(new ButtonListener("/"));
        view.setButtonEqualsListener(new EqualsButtonListener());
        view.setButtonClearListener(new ClearButtonListener());    }
    class ButtonListener implements ActionListener {
        private final String value;
        public ButtonListener(String value) {
            this.value = value;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            model.addToExpression(value);
            view.setTextFieldText(model.getExpression());
        }
    }
    class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.calculate();
            view.setTextFieldText(model.getResult());
        }
    }
    class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.clear();
            view.setTextFieldText("");
        }
    }
}
