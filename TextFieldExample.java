import java.awt.*;
import javax.swing.*;

class TextFieldExample extends JFrame {
    JTextField tf;
    JLabel lf;

    // Constructor
    TextFieldExample() {
        // Create components
        tf = new JTextField(20);
        lf = new JLabel("Write Your Full Name");

        // Set layout and add components
        setLayout(new FlowLayout());
        add(lf);
        add(tf);

        // Frame settings
        setTitle("Text Field Example");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new TextFieldExample();
    }
}
