import javax.swing.*;
import java.awt.*;

public class guiTesting {

    private static JButton btn1;
    private static JButton btn2;
    private static JButton btn3;
    private static JButton btn4;
    private static JButton btn5;
    private static JButton btn6;
    private static JButton btn7;
    private static JButton btn8;
    private static JButton btn9;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,500);
        frame.setVisible(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setVisible(true);
        buttonPanel.setLayout(new GridLayout(3,3));
        frame.add(buttonPanel);

        btn1 = new JButton("");
        btn2 = new JButton("");
        btn3 = new JButton("");
        btn4 = new JButton("");
        btn5 = new JButton("");
        btn6 = new JButton("");
        btn7 = new JButton("");
        btn8 = new JButton("");
        btn9 = new JButton("");

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);

        frame.pack();
        frame.repaint();

        frame.setSize(300,500);

    }

}
