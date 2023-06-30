import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Three {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE); // Set the background color of the frame

        frame.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLUE); // Set the color of the text
        g.setFont(new Font("Arial", Font.BOLD, 20)); // Set the font of the text

        String message = "Hello, World!";
        int x = 100; // X-coordinate for the text
        int y = 150; // Y-coordinate for the text

        g.drawString(message, x, y); // Draw the text on the frame
    }
}
