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
import javax.swing.JTextField;

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

    // Change operation button
    static JButton operationChange;

    // Clear cache button
    static JButton clearButton;

    // Regular text feild
    static JTextField sumTextField;
    
    // The total sum
    static int i = 0;

    // What operation is going on at the time
    static String operation = "+";

    // No idea how this works, asking my teacher on Monday
    PannelWork ()
    {
        // Set the starting stuff
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setSize(500, 500);

        // ---------------- Panel ----------------- \\

        // Create the pannel we will use, also add the size it will be
        // Part of the keypads
        JPanel panTopKeypad = new JPanel();
        JPanel panCenterKeypad = new JPanel();
        JPanel panBottomKeypad = new JPanel();

        // Generic panels for other things to go on besides keypads
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

        // The green means not keypad
        centerEncaplsePanel.setBackground(Color.green);
        panBottom.setBackground(Color.green);

        // Add the panel to the frame
        this.add(panBottom, BorderLayout.SOUTH);
        this.add(centerEncaplsePanel, BorderLayout.CENTER);
        this.add(panTopKeypad, BorderLayout.NORTH);

        // Adding the the centerEncaplsePanel so we can format the calc better
        centerEncaplsePanel.add(panCenterKeypad, BorderLayout.NORTH);
        centerEncaplsePanel.add(panBottomKeypad, BorderLayout.CENTER);

        // --------------- buttons ------------------ \\
        
        // Create a button that will just add one to a variable
        // Change sum buttons
        addOne = new JButton(operation + "1");
        addTwo = new JButton(operation + "2");
        addThree = new JButton(operation + "3");
        addFour = new JButton(operation + "4");
        addFive = new JButton(operation + "5");
        addSix = new JButton(operation + "6");
        addSeven = new JButton(operation + "7");
        addEight = new JButton(operation + "8");
        addNine = new JButton(operation + "9");

        // Change operations button
        operationChange = new JButton("-");

        // Clear cache button
        clearButton = new JButton("CLEAR");
        
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
        clearButton.addActionListener(this);
        operationChange.addActionListener(this);
        
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

        panBottom.add(clearButton, BorderLayout.CENTER);
        panBottom.add(operationChange, BorderLayout.EAST);

        // ------------------------ Text ---------------------- \\

        // Make a text feild
        sumTextField = new JTextField("Sum: " + i);

        // Set the bounds
        sumTextField.setPreferredSize(new Dimension(100, 100));
        
        // Add to panel
        panBottom.add(sumTextField, BorderLayout.WEST);
    }

    // Add the action listener
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == addOne) 
        {
            // Add one every time we click the button, starts at 0 so fist click prints 1
            i = sumValueChange(i, Integer.valueOf(operation + "1"), sumTextField);
        }
        else if (e.getSource() == addTwo)
        {
            // Add two every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "2"), sumTextField);
        }
        else if (e.getSource() == addThree)
        {
            // Add three every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "3"), sumTextField);
        }
        else if (e.getSource() == addFour)
        {
            // Add four every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "4"), sumTextField);
        }
        else if (e.getSource() == addFive)
        {
            // Add five every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "5"), sumTextField);
        }
        else if (e.getSource() == addSix)
        {
            // Add six every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "6"), sumTextField);
        }
        else if (e.getSource() == addSeven)
        {
            // Add seven every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "7"), sumTextField);
        }
        else if (e.getSource() == addEight)
        {
            // Add eight every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "8"), sumTextField);
        }
        else if (e.getSource() == addNine)
        {
            // Add nine every time, print
            i = sumValueChange(i, Integer.valueOf(operation + "9"), sumTextField);
        }

        // Clear button
        if (e.getSource() == clearButton)
        {
            // Reset i back to 0
            i = 0;
            sumTextField.setText("Sum: 0");
        }

        // Operation change button
        if (e.getSource() == operationChange)
        {
            // If '+' swap to '-'
            if (operation == "+")
            {
                // Changes everything to '-'
                operation = "-";
                operationChange.setText("+");

                // Reset the text
                addOne.setText(operation + "1");
                addTwo.setText(operation + "2");
                addThree.setText(operation + "3");
                addFour.setText(operation + "4");
                addFive.setText(operation + "5");
                addSix.setText(operation + "6");
                addSeven.setText(operation + "7");
                addEight.setText(operation + "8");
                addNine.setText(operation + "9");
            }

            // If '-' swap to '+'
            else if (operation == "-")
            {
                // Changes everything to '+'
                operation = "+";
                operationChange.setText("-");

                // Reset the text
                addOne.setText(operation + "1");
                addTwo.setText(operation + "2");
                addThree.setText(operation + "3");
                addFour.setText(operation + "4");
                addFive.setText(operation + "5");
                addSix.setText(operation + "6");
                addSeven.setText(operation + "7");
                addEight.setText(operation + "8");
                addNine.setText(operation + "9");
            }
        }
    }

    public static int sumValueChange(int i, int changingValue, JTextField textField)
    {
        i += changingValue;
        textField.setText("Sum: " + i); 
        return i;
    }

    // Add the main method that will run the stuff
    public static void main(String[] args){
        // Run the stuff
        new PannelWork();
    
    }
}