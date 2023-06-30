import java.awt.Frame;

class MyFrame extends Frame {
    public MyFrame(String title) {
        super(title); // Call the constructor of the superclass (Frame) to set the title
        setSize(400, 300); // Set the size of the frame
        setVisible(true); // Make the frame visible
    }
}

public class Two {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("My Frame"); // Create an object of the subclass (MyFrame)
    }
}
