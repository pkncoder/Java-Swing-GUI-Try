// AWT stuff
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Swing imports
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDoThing extends JFrame implements ActionListener
{
    // Add instance variables
    JButton button;

    public void createButton()
    {
        // Create button
        button = new JButton("Click Me!!");

        // Give button coords and size and stuff (actually thats it)
        button.setBounds(200, 200, 100, 50);

        // Give the button an action listener
        button.addActionListener(this);

        // Give it a close operation so we can click the red X
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Give it a layout
        this.setLayout(null);

        // Give the window a size
        this.setSize(500, 500);

        // Shows the window
        this.setVisible(true);

        // Add the button to the window
        this.add(button);

    }

    public static void main(String[] args) 
    {
        // Create an object so we can run commands in this main file
        ButtonDoThing start = new ButtonDoThing();

        // Start it all up
        start.createButton();
    }

    // This tests for actions
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // Test for button action
        if (e.getSource()==button)
        {
            // Print out something
            System.out.println("You clicked me!");
        }
    }

}
