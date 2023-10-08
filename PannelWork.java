// Awt stuff
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Java swing stuff
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PannelWork extends JFrame implements ActionListener 
{

    // Add instances of these variables that the action listener will use
    static JButton addOne;
    static int i = 0;

    // No idea how this works, asking my teacher on Monday
    PannelWork ()
    {
        // Set the starting stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setSize(500, 500);

        // ---------------- Panel -----------------\\

        // Create the pannel we will use, also add the size it will be
        JPanel panTop = new JPanel();
        panTop.setPreferredSize(new Dimension(100, 100));

        // Give the panel a border layout so we can do center or north and stuff
        panTop.setLayout(new BorderLayout());

        // Add the color to the panel
        panTop.setBackground(Color.red);

        // Add the panel to the frame
        this.add(panTop, BorderLayout.NORTH);

        // --------------- button ------------------ \\
        
        // Create a button that will just add one to a variable
        addOne = new JButton("+1");
        
        // Give the button an action listener
        addOne.addActionListener(this);
        
        // Add the button to our panel, the center of it
        panTop.add(addOne, BorderLayout.CENTER);
    }

    // Add the action listener
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == addOne) 
        {
            // Add one every time we click the button, starts at 0 so fist click prints 1
            i += 1;
            System.out.println(i);
        }
    }

    // Add the main method that will run the stuff
    public static void main(String[] args){
        // Run the stuff
        new PannelWork();
    
    }
}