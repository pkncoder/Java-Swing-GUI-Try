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
    static JButton addTwo;
    static JButton addThree;
    static JButton addFour;
    static JButton addFive;
    static JButton addSix;
    static JButton addSeven;
    static JButton addEight;
    static JButton addNine;
    
    static int i = 0;

    // No idea how this works, asking my teacher on Monday
    PannelWork ()
    {
        // Set the starting stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setSize(500, 500);

        // ---------------- Panel ----------------- \\

        // Create the pannel we will use, also add the size it will be
        JPanel panTopKeypad = new JPanel();
        JPanel panCenterKeypad = new JPanel();
        JPanel panBottomKeypad = new JPanel();
        JPanel centerEncaplsePanel = new JPanel();
        JPanel panBottom = new JPanel();

        // Get the sizes needed
        panTopKeypad.setPreferredSize(new Dimension(100, 100));
        panCenterKeypad.setPreferredSize(new Dimension(100, 100));
        panBottomKeypad.setPreferredSize(new Dimension(100, 100));
        panBottom.setPreferredSize(new Dimension(100, 100));

        // Give the panel a border layout so we can do center or north and stuff
        panTopKeypad.setLayout(new BorderLayout());
        panCenterKeypad.setLayout(new BorderLayout());
        panBottomKeypad.setLayout(new BorderLayout());
        centerEncaplsePanel.setLayout(new BorderLayout());
        panBottom.setLayout(new BorderLayout());

        // Add the color to the panel
        panTopKeypad.setBackground(Color.red);
        panCenterKeypad.setBackground(Color.red);
        panBottomKeypad.setBackground(Color.red);
        centerEncaplsePanel.setBackground(Color.green);
        panBottom.setBackground(Color.green);

        // Add the panel to the frame
        this.add(panBottom, BorderLayout.SOUTH);
        this.add(centerEncaplsePanel, BorderLayout.CENTER);
        this.add(panTopKeypad, BorderLayout.NORTH);
        centerEncaplsePanel.add(panCenterKeypad, BorderLayout.NORTH);
        centerEncaplsePanel.add(panBottomKeypad, BorderLayout.CENTER);

        // --------------- buttons ------------------ \\
        
        // Create a button that will just add one to a variable
        addOne = new JButton("+1");
        addTwo = new JButton("+2");
        addThree = new JButton("+3");
        addFour = new JButton("+4");
        addFive = new JButton("+5");
        addSix = new JButton("+6");
        addSeven = new JButton("+7");
        addEight = new JButton("+8");
        addNine = new JButton("+9");
        
        // Give the button an action listener
        addOne.addActionListener(this);
        addTwo.addActionListener(this);
        addThree.addActionListener(this);
        addFour.addActionListener(this);
        addFive.addActionListener(this);
        addSix.addActionListener(this);
        addSeven.addActionListener(this);
        addEight.addActionListener(this);
        addNine.addActionListener(this);
        
        // Add the button to our panel, the center of it
        panTopKeypad.add(addOne, BorderLayout.WEST);
        panTopKeypad.add(addTwo, BorderLayout.CENTER);
        panTopKeypad.add(addThree, BorderLayout.EAST);
        panCenterKeypad.add(addFour, BorderLayout.WEST);
        panCenterKeypad.add(addFive, BorderLayout.CENTER);
        panCenterKeypad.add(addSix, BorderLayout.EAST);
        panBottomKeypad.add(addSeven, BorderLayout.WEST);
        panBottomKeypad.add(addEight, BorderLayout.CENTER);
        panBottomKeypad.add(addNine, BorderLayout.EAST);
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
        else if (e.getSource() == addTwo)
        {
            // Add two every time, print
            i += 2;
            System.out.println(i);
        }
        else if (e.getSource() == addThree)
        {
            // Add two every time, print
            i += 3;
            System.out.println(i);
        }
        else if (e.getSource() == addFour)
        {
            // Add two every time, print
            i += 4;
            System.out.println(i);
        }
        else if (e.getSource() == addFive)
        {
            // Add two every time, print
            i += 5;
            System.out.println(i);
        }
        else if (e.getSource() == addSix)
        {
            // Add two every time, print
            i += 6;
            System.out.println(i);
        }
        else if (e.getSource() == addSeven)
        {
            // Add two every time, print
            i += 7;
            System.out.println(i);
        }
        else if (e.getSource() == addEight)
        {
            // Add two every time, print
            i += 8;
            System.out.println(i);
        }
        else if (e.getSource() == addNine)
        {
            // Add two every time, print
            i += 9;
            System.out.println(i);
        }
    }

    // Add the main method that will run the stuff
    public static void main(String[] args){
        // Run the stuff
        new PannelWork();
    
    }
}