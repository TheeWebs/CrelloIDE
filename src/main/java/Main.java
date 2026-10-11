import com.CrelloIDE.main.ui.MainWindowUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

void main() {

    JFrame frame = new JFrame();
    frame.setSize(
            new Dimension((int) MainWindowUI.SIZE_W, (int) MainWindowUI.SIZE_H)
    );

    JPanel p = new JPanel();
    p.setLayout(new GridLayout(2, 2));
    JLabel l = new JLabel("Crello IDE");
    p.add(l);
    JButton button = new JButton("Next");
    l.setFont(new Font("inter", Font.PLAIN, 15 + 5));
    l.setBorder(new EmptyBorder(20, 20, 20, 20));

    JPanel p2 = new JPanel();
    p2.add(p);

    JSplitPane pane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, p, p2);
    pane.setOrientation(SwingConstants.VERTICAL);

    p.setBackground(new Color(
            MainWindowUI.colors[0],
            MainWindowUI.colors[1],
            MainWindowUI.colors[2])
    );

    pane.setPreferredSize(new Dimension(200, 20));
    pane.setResizeWeight(0.15);
    frame.add(pane);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

}