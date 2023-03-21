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

public class FontColorMenu extends JFrame {

    JList colorList;

    private String[] ColorNames = {"Blue", "White", "LightGray", "Gray", "Black", "Dark Gray"};
    private Color[] colorOptions = {Color.BLUE, Color.WHITE, Color.lightGray, Color.GRAY, Color.BLACK, Color.darkGray};

    FontColorMenu() {
        super("Snake Game");

        JLabel fontColor = new JLabel();
        fontColor.setText("Choose font color");
        fontColor.setFont(new Font("Ink Free", Font.PLAIN, 20));
        this.add(fontColor);


        colorList = new JList(ColorNames);
        colorList.setFont(new Font ("Ink Free", Font.PLAIN, 15));
        colorList.setVisibleRowCount(6);
        this.add(colorList);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.add(fontColor);
        panel1.setBackground(new Color(210, 145, 188));
        panel2.add(new JScrollPane(colorList));
        panel2.setBackground(new Color(210, 145, 188));

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);



        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(210, 145, 188));
    }

    private class EventHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event) {
            GamePanel font = new GamePanel();
            font.fontColor = colorOptions[colorList.getSelectedIndex()];
            dispose();
            new GameFrame();
        }
    }
}
