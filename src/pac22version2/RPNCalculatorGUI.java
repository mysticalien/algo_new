package pac22version2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPNCalculatorGUI {
    private JFrame frame;
    private JTextField inputField;

    public RPNCalculatorGUI() {
        frame = new JFrame("RPN Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.getContentPane().setBackground(new Color(255, 182, 193)); // Розовый цвет

        inputField = new JTextField();
        inputField.setEditable(false);
        inputField.setHorizontalAlignment(JTextField.RIGHT);

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(createButtonPanel(), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "CE"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            button.setBackground(new Color(255, 182, 193)); // Розовый цвет
            buttonPanel.add(button);
        }

        return buttonPanel;
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();
            String currentInput = inputField.getText();

            if (buttonText.equals("=")) {
                try {
                    String[] expression = currentInput.split(" ");
                    double result = RPNCalculator.evaluateRPN(expression);
                    inputField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    inputField.setText("Error");
                }
            } else if (buttonText.equals("C")) {
                inputField.setText("");
            } else if (buttonText.equals("CE")) {
                // Удалить последний токен (слово) из выражения
                String[] tokens = currentInput.split(" ");
                if (tokens.length > 0) {
                    tokens[tokens.length - 1] = "";
                    StringBuilder newInput = new StringBuilder();
                    for (String token : tokens) {
                        if (!token.isEmpty()) {
                            newInput.append(token).append(" ");
                        }
                    }
                    inputField.setText(newInput.toString().trim());
                }
            } else {
                inputField.setText(currentInput + buttonText + " ");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RPNCalculatorGUI());
    }
}



