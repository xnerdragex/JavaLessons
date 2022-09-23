import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JButton cancelButton;
    private static JLabel success;

    private static JLabel denied;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setResizable(false);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new GUI());
        panel.add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(100, 80, 80, 25);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(cancelButton);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        denied = new JLabel("");
        denied.setBounds(10, 110, 300, 25);
        panel.add(denied);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("moliva") && password.equals("Pingu1234")) {
            success.setText("Login successful");
        }
        else { denied.setText("Login failed");
        }
    }
}
