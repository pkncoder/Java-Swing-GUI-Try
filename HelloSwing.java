import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;

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

        // Set the content pane?
        setContentPane(pannel);
    }

    public static void main(String[] args)
    {
        // Create the object for the plane
        HelloSwing hellowSwingRun = new HelloSwing();

        // Let the program exit
        hellowSwingRun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hellowSwingRun.pack();
        hellowSwingRun.setVisible(true);
    }
}