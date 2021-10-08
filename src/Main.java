/*

  _    _ _     _       _ _   _  _____
 | |  | | |   (_)     (_) | (_)/ ____|
 | |  | | |__  _ _ __  _| |_ _| (___
 | |  | | '_ \| | '_ \| | __| |\___ \
 | |__| | |_) | | | | | | |_| |____) |
  \____/|_.__/|_|_| |_|_|\__|_|_____/

This script made by Bryce Sheridan, https://github.com/UbinitiS

This is the THIRD version of TicTacToe. This one is going to be GUI based, so you don't have to keep using the console.
This script is pretty much just the basic TicTacToe engine that I built previously on TicTacToe2 but somewhat re-wrote
to allow a GUI to be used. Other than that, most of the main logic is all the same.

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

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
    private static JLabel gameText;
    private static int btnClick;


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel contentPanel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(contentPanel, BoxLayout.Y_AXIS);
        contentPanel.setLayout(boxlayout);
        frame.add(contentPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));
        contentPanel.add(buttonPanel);

        JPanel gameInfo = new JPanel();
        gameInfo.setLayout(new FlowLayout());
        contentPanel.add(gameInfo);

        btn1 = new JButton(new AbstractAction("") {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(1, "player");
            }
        });
        btn2 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(2, "player");
            }
        });
        btn3 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(3, "player");
            }
        });
        btn4 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(4, "player");
            }
        });
        btn5 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(5, "player");
            }
        });
        btn6 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(6, "player");
            }
        });
        btn7 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(7, "player");
            }
        });
        btn8 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(8, "player");
            }
        });
        btn9 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(9, "player");
            }
        });

        gameText = new JLabel("Testing");
        gameText.setVisible(true);
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

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        gameInfo.add(gameText);

        frame.pack();
        frame.repaint();

    }

    public static void placePlayerPiece(int pos, String player) {

        System.out.println("Submitted Values: " + pos + " from player: " + player);

    }

}

