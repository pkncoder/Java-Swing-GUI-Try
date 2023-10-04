import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloSwing extends JFrame
{
    // Declare instance variables
    JLabel message;
    JButton button;
    JPanel pannel;
    public HelloSwing()
    {
        // Add the GUI name
        super("Hello World");

        // Create a message
        JLabel message = new JLabel("Hello Test");

        // Create 2 buttons
        JButton clickButton = new JButton("Click Me!");
        JButton cancelButton = new JButton("Cancel");

        // Make the overall Pannel
        pannel = new JPanel();

        // Add the things to the pannel
        pannel.add(message);
        pannel.add(clickButton);
        pannel.add(cancelButton);

        
    }
}