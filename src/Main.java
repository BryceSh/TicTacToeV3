import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    public static int frameWidth = 400;
    public static int frameHeight = 500;
    private static JButton btn1;
    private static JButton btn2;
    private static JButton btn3;
    private static JButton btn4;
    private static JButton btn5;
    private static JButton btn6;
    private static JButton btn7;
    private static JButton btn8;
    private static JButton btn9;
    private static int btnClick;


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        frame.add(buttonPanel);

        btn1 = new JButton(" ");
        btn2 = new JButton(" ");
        btn3 = new JButton(" ");
        btn4 = new JButton(" ");
        btn5 = new JButton(" ");
        btn6 = new JButton(" ");
        btn7 = new JButton(" ");
        btn8 = new JButton(" ");
        btn9 = new JButton(" ");

        Dimension btnSize = new Dimension(50, 50);
        btn1.setPreferredSize(btnSize);
        btn2.setPreferredSize(btnSize);
        btn3.setPreferredSize(btnSize);
        btn4.setPreferredSize(btnSize);
        btn5.setPreferredSize(btnSize);
        btn6.setPreferredSize(btnSize);
        btn7.setPreferredSize(btnSize);
        btn8.setPreferredSize(btnSize);
        btn9.setPreferredSize(btnSize);

        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        btn7.setVisible(true);
        btn8.setVisible(true);
        btn9.setVisible(true);

        btn1.addActionListener(new Main());

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

    }


    @Override
    public void actionPerformed(ActionEvent e) {



    }
}

