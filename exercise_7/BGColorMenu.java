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

public class BGColorMenu extends JFrame {

    JList colorList;

    private String[] Colornames = {"Blue", "White", "LightGray", "Gray", "Black", "Dark Gray"};
    private Color[] color = {Color.BLUE, Color.WHITE, Color.lightGray, Color.GRAY, Color.BLACK, Color.darkGray};

    BGColorMenu() {
        super("Snake Game");

        JLabel bgColor = new JLabel();
        bgColor.setText("Choose background color");
        bgColor.setFont(new Font("Ink Free", Font.PLAIN, 20));
        this.add(bgColor);

        colorList = new JList(Colornames);
        colorList.setFont(new Font ("Ink Free", Font.PLAIN, 15));
        colorList.setVisibleRowCount(6);
        this.add(colorList);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.add(bgColor);
        panel1.setBackground(new Color(224, 187, 228));
        panel2.add(new JScrollPane(colorList));
        panel2.setBackground(new Color(224, 187, 228));

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);


        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(224, 187, 228));
    }

    private class EventHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event) {
            GamePanel bg = new GamePanel();
            bg.bgColor = color[colorList.getSelectedIndex()];
            dispose();
            new FontColorMenu();
        }
    }
}
