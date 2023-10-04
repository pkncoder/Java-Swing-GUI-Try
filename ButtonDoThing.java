import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDoThing extends JFrame implements ActionListener
{
    ButtonDoThing() {

        JButton button = new JButton();
        button.setBounds(200, 200, 100, 50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);

    }

    public void ActionListener(ActionEvent e) {


    }
}
