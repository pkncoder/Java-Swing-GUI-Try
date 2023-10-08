import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class PannelWork{

	public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame();

        // Set the starting stuff
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);

        // Create the pannel we will use with dimentions
        JPanel panTop = new JPanel();
        panTop.setPreferredSize(new Dimension(100, 100));

        // Add the color to the panel
        panTop.setBackground(Color.red);

        // Add the panel to the top
        frame.add(panTop, BorderLayout.NORTH);
	}
}