import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Four {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Image Frame");

        // Set the image icon for the frame
        ImageIcon icon = new ImageIcon("path/to/your/image.jpg"); // Replace with the actual path to your image file
        frame.setIconImage(icon.getImage());

        // Create a JLabel to display the image in the frame
        JLabel imageLabel = new JLabel(icon);
        frame.getContentPane().add(imageLabel);

        // Set the size and close operation of the frame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
