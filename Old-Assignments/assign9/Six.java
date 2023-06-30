import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Six {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Text Style");

        // Create a JLabel to display the selected styles
        JLabel label = new JLabel("Selected Styles: ");
        label.setBounds(20, 20, 150, 30);
        frame.add(label);

        // Create three JCheckBoxes for bold, italic, and underline styles
        JCheckBox boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.setBounds(20, 60, 100, 30);
        frame.add(boldCheckBox);

        JCheckBox italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.setBounds(20, 100, 100, 30);
        frame.add(italicCheckBox);

        JCheckBox underlineCheckBox = new JCheckBox("Underline");
        underlineCheckBox.setBounds(20, 140, 100, 30);
        frame.add(underlineCheckBox);

        // Set the size and close operation of the frame
        frame.setSize(250, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
