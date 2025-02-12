import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");

        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Result:");
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");

        label1.setBounds(20, 20, 100, 30);
        num1Field.setBounds(120, 20, 150, 30);
        label2.setBounds(20, 60, 100, 30);
        num2Field.setBounds(120, 60, 150, 30);
        addButton.setBounds(20, 100, 50, 30);
        subButton.setBounds(80, 100, 50, 30);
        mulButton.setBounds(140, 100, 50, 30);
        divButton.setBounds(200, 100, 50, 30);
        resultLabel.setBounds(20, 140, 300, 30);

        frame.add(label1);
        frame.add(label2);
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(resultLabel);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = 0;

                    if (e.getSource() == addButton) result = num1 + num2;
                    if (e.getSource() == subButton) result = num1 - num2;
                    if (e.getSource() == mulButton) result = num1 * num2;
                    if (e.getSource() == divButton) {
                        if (num2 == 0) throw new ArithmeticException("Division by zero");
                        result = num1 / num2;
                    }

                    resultLabel.setText("Result: " + result);
                } catch (Exception ex) {
                    resultLabel.setText("Error: " + ex.getMessage());
                }
            }
        };

        addButton.addActionListener(listener);
        subButton.addActionListener(listener);
        mulButton.addActionListener(listener);
        divButton.addActionListener(listener);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
