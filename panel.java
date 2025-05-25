import java.awt.*; // for Color
import javax.swing.*; // for Swing components

class panel extends JFrame {
    static JFrame f;
    static JButton b1, b2, b3;
    static JLabel l;

    public static void main(String[] args) {
        f = new JFrame("Eec");
        l = new JLabel("Hi I am Swastika");
        b1 = new JButton("Click Me");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");

        // Create JPanel and add components
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        p.setBackground(Color.green);

        // Add panel to frame
        f.add(p);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
