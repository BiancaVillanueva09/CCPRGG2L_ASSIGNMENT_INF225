import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JOptionPane;
import javax.swing.JPanel;
// import javax.swing.plaf.basic.BasicBorders.ButtonBorder;
import java.awt.*;
// import java.io.IOException;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    MainMenu() {
        this.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("528105.png");

        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setBackground(Color.BLACK);
    
        JButton button = new JButton();
        button.setText("Start Game");
        button.setFont(new Font("Georgia", Font.BOLD, 50));
        button.setBorder(BorderFactory.createEtchedBorder());

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);


        JPanel panel1 = new JPanel();
        panel1.add(label);
        panel1.setBackground(new Color(254, 200, 216));
        this.add(panel1); 

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(254, 200, 216));
        panel2.add(button);
        this.add(panel2);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(254, 200, 216));
    }


    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new SnakeColorMenu();
            dispose();
        }
    }
}
