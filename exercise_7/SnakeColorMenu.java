import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
// import javax.swing.BorderFactory;
// import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class SnakeColorMenu extends JFrame {

    JList colorList;

    private String[] colorNames = {"Blue", "White", "LightGray", "Gray", "Black", "Dark Gray"};
    private Color[] colors = {Color.BLUE, Color.WHITE, Color.lightGray, Color.GRAY, Color.BLACK, Color.darkGray};

    SnakeColorMenu() {
        super("Snake Game");

        JLabel label = new JLabel();
        label.setText("Choose snake color");
        label.setFont(new Font("Ink Free", Font.PLAIN, 20));
        this.add(label);


        colorList = new JList(colorNames);
        colorList.setFont(new Font ("Ink Free", Font.PLAIN, 15));
        colorList.setVisibleRowCount(6);
        this.add(colorList);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.add(label);
        panel1.setBackground(new Color(199, 206, 234));
        panel2.add(new JScrollPane(colorList));
        panel2.setBackground(new Color(199, 206, 234));

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);


        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(199, 206, 234));
    }

    private class EventHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event) {
            GamePanel gp = new GamePanel();
            gp.snakeColor = colors[colorList.getSelectedIndex()];
            dispose();
            new BGColorMenu();
        }
    }
}
