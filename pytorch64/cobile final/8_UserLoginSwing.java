import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLoginSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Login");
        JLabel label1 = new JLabel("Username:");
        JLabel label2 = new JLabel("Password:");
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        label1.setBounds(20, 20, 100, 30);
        label2.setBounds(20, 60, 100, 30);
        usernameField.setBounds(120, 20, 150, 30);
        passwordField.setBounds(120, 60, 150, 30);
        loginButton.setBounds(120, 100, 100, 30);

        frame.add(label1);
        frame.add(label2);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                try {
                    if (username.isEmpty() || password.isEmpty()) {
                        throw new Exception("Fields cannot be empty!");
                    }
                    if (username.equals("admin") && password.equals("password")) {
                        JOptionPane.showMessageDialog(frame, "Login Successful!");
                    } else {
                        throw new Exception("Invalid Credentials!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}