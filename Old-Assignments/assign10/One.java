import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Text Style");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create three JCheckBoxes for bold, italic, and underline styles
        JCheckBox boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.setBounds(20, 40, 100, 30);
        frame.add(boldCheckBox);

        JCheckBox italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.setBounds(20, 80, 100, 30);
        frame.add(italicCheckBox);

        JCheckBox underlineCheckBox = new JCheckBox("Underline");
        underlineCheckBox.setBounds(20, 120, 100, 30);
        frame.add(underlineCheckBox);

        // Create a JLabel to display the selected styles
        JLabel label = new JLabel("Selected Styles");
        label.setBounds(150, 80, 120, 30);
        frame.add(label);

        // Add event listeners to the checkboxes
        boldCheckBox.addActionListener(e -> updateLabel(label, boldCheckBox, italicCheckBox, underlineCheckBox));
        italicCheckBox.addActionListener(e -> updateLabel(label, boldCheckBox, italicCheckBox, underlineCheckBox));
        underlineCheckBox.addActionListener(e -> updateLabel(label, boldCheckBox, italicCheckBox, underlineCheckBox));

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void updateLabel(JLabel label, JCheckBox boldCheckBox, JCheckBox italicCheckBox, JCheckBox underlineCheckBox) {
        StringBuilder styles = new StringBuilder();

        if (boldCheckBox.isSelected()) {
            styles.append("Bold ");
        }

        if (italicCheckBox.isSelected()) {
            styles.append("Italic ");
        }

        if (underlineCheckBox.isSelected()) {
            styles.append("Underline ");
        }

        label.setText(styles.toString());
    }
}
