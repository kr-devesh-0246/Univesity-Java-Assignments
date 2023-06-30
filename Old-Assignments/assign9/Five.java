import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Five {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Login");

        // Create a JLabel for the name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);

        // Create a JTextField for entering the name
        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(150, 50, 200, 30);

        // Create a JLabel for the password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);

        // Create a JPasswordField for entering the password
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);

        // Add the components to the frame
        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(passwordLabel);
        frame.add(passwordField);

        // Set the size and close operation of the frame
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
