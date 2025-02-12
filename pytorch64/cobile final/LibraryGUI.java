import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Management System");
        JLabel bookLabel = new JLabel("Book:");
        JTextField bookField = new JTextField();
        JButton addButton = new JButton("Add Book");
        JTextArea bookList = new JTextArea();

        bookLabel.setBounds(20, 20, 50, 30);
        bookField.setBounds(80, 20, 150, 30);
        addButton.setBounds(240, 20, 100, 30);
        bookList.setBounds(20, 70, 320, 150);

        frame.add(bookLabel);
        frame.add(bookField);
        frame.add(addButton);
        frame.add(bookList);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookName = bookField.getText();
                if (!bookName.isEmpty()) {
                    bookList.append(bookName + "\n");
                    bookField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Book name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
