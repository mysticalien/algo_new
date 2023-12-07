package task22;
import javax.swing.*;import java.awt.*;
import java.awt.event.ActionListener;
public class CalculatorView extends JFrame {
    private final JTextField textField;
    private final JButton button0;
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton button5;
    private final JButton button6;
    private final JButton button7;
    private final JButton button8;
    private final JButton button9;
    private final JButton buttonPlus;
    private final JButton buttonMinus;
    private final JButton buttonMultiply;
    private final JButton buttonDivide;
    private final JButton buttonEquals;

    private final JButton buttonClear;
    public CalculatorView() {
        // Создание компонентов
        textField = new JTextField();
        textField.setEditable(false);
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");
        // Создание контейнера для компонентов
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        // Добавление компонентов на панель
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMinus);
        panel.add(button0);
        panel.add(buttonEquals);
        panel.add(buttonClear);
        panel.add(buttonPlus);
        // Создание контейнера для текстового поля
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textField, BorderLayout.CENTER);
        // Добавление панелей на главный контейнер окна
        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        // Установка свойств окна
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
    }
    public void setButton0Listener(ActionListener listener) {
        button0.addActionListener(listener);
    }
    public void setButton1Listener(ActionListener listener) {
        button1.addActionListener(listener);
    }
    public void setButton2Listener(ActionListener listener) {
        button2.addActionListener(listener);
    }
    public void setButton3Listener(ActionListener listener) {
        button3.addActionListener(listener);
    }
    public void setButton4Listener(ActionListener listener) {
        button4.addActionListener(listener);
    }
    public void setButton5Listener(ActionListener listener) {
        button5.addActionListener(listener);
    }
    public void setButton6Listener(ActionListener listener) {
        button6.addActionListener(listener);
    }
    public void setButton7Listener(ActionListener listener) {
        button7.addActionListener(listener);
    }
    public void setButton8Listener(ActionListener listener) {
        button8.addActionListener(listener);
    }
    public void setButton9Listener(ActionListener listener) {
        button9.addActionListener(listener);
    }
    public void setButtonPlusListener(ActionListener listener) {
        buttonPlus.addActionListener(listener);
    }
    public void setButtonMinusListener(ActionListener listener) {
        buttonMinus.addActionListener(listener);
    }
    public void setButtonMultiplyListener(ActionListener listener) {
        buttonMultiply.addActionListener(listener);
    }
    public void setButtonDivideListener(ActionListener listener) {
        buttonDivide.addActionListener(listener);
    }
    public void setButtonEqualsListener(ActionListener listener) {
        buttonEquals.addActionListener(listener);
    }
    public void setButtonClearListener(ActionListener listener) {
        buttonClear.addActionListener(listener);
    }
    public void setTextFieldText(String text) {
        textField.setText(text);
    }
}
