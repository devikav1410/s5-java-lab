import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    JTextField userField;
    JPasswordField passField;
    JButton loginBtn, resetBtn, exitBtn;

    String validUser = "admin";
    String validPass = "12345";

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new FlowLayout());

        add(new JLabel("Username:"));
        userField = new JTextField(15);
        add(userField);

        add(new JLabel("Password:"));
        passField = new JPasswordField(15);
        add(passField);

        loginBtn = new JButton("Login");
        resetBtn = new JButton("Reset");
        exitBtn = new JButton("Exit");
        add(loginBtn); add(resetBtn); add(exitBtn);

        loginBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            String username = userField.getText();
            String password = new String(passField.getPassword()); // secure way

            if (username.equals(validUser) && password.equals(validPass)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == resetBtn) {
            userField.setText("");
            passField.setText("");
        } else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
