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
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
    private static boolean gameOver = false; // No touchy!!!


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 450);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel contentPanel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(contentPanel, BoxLayout.Y_AXIS);
        contentPanel.setLayout(boxlayout);
        contentPanel.setSize(new Dimension(300, 450));
        frame.add(contentPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBounds(0, 60,300,300);
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

        gameText = new JLabel(" ");
        gameText.setVisible(true);
        gameText.setSize(new Dimension(400, 20));
        JButton resetGame = new JButton(new AbstractAction("Reset Game") {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleButtons(true);
                playerPositions.clear();
                cpuPositions.clear();
                btn1.setText(" ");
                btn2.setText(" ");
                btn3.setText(" ");
                btn4.setText(" ");
                btn5.setText(" ");
                btn6.setText(" ");
                btn7.setText(" ");
                btn8.setText(" ");
                btn9.setText(" ");
            }
        });
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
        gameInfo.add(resetGame);

        frame.pack();
        frame.repaint();

        frame.setSize(300,500);

    }

    public static String checkWinner() {

        List<List> winning = new ArrayList<List>();
        winning.add(Arrays.asList(1,2,3));
        winning.add(Arrays.asList(4,5,6));
        winning.add(Arrays.asList(7,8,9));
        winning.add(Arrays.asList(1,4,7));
        winning.add(Arrays.asList(2,5,8));
        winning.add(Arrays.asList(3,6,9));
        winning.add(Arrays.asList(1,5,9));
        winning.add(Arrays.asList(3,5,7));
        winning.add(Arrays.asList(1,3,7,9));

        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                gameOver = true;
                System.out.println("Player Wins!");
                toggleButtons(false);
                System.out.println(gameOver);
                gameText.setText("Player Wins!");
                return "Player Won!";
            }
            System.out.println("Tested: " + l);
        }
        for (List l : winning) {
            if (cpuPositions.containsAll(l)) {
                gameOver = true;
                toggleButtons(false);
                System.out.println("CPU Wins!");
                return "CPU Won!";
            }
        }
        if (playerPositions.size() + cpuPositions.size() == 9) {
            gameOver = true;
            System.out.println("Tie Wins!");
            toggleButtons(false);
            return "Tie!";

        }

        return "";

    }

    public static void toggleButtons(boolean enabled) {

        btn1.setEnabled(enabled);
        btn2.setEnabled(enabled);
        btn3.setEnabled(enabled);
        btn4.setEnabled(enabled);
        btn5.setEnabled(enabled);
        btn6.setEnabled(enabled);
        btn7.setEnabled(enabled);
        btn8.setEnabled(enabled);
        btn9.setEnabled(enabled);
        gameText.setText("Deeze nuts");

    }

    public static void placePlayerPiece(int pos, String player) {

        // Checks to see if the player or CPU has already played that
        boolean placePiece = false;
        String symbol = " ";
        checkWinner();

        if (pos < 10) {
            if (playerPositions.contains(pos) || cpuPositions.contains(pos)) {

                gameText.setText("You can't go there!");

            } else {

                System.out.println("Great Success!");
                if (player.equals("player")) {

                    playerPositions.add(pos);
                    symbol = "X";
                    placePiece = true;
                    placePlayerPiece(cpuPositionPicker(), "cpu");

                } else if (player.equals("cpu")) {

                    cpuPositions.add(pos);
                    symbol = "O";
                    placePiece = true;

                } else {

                    System.err.println("Trying to call a player that does not exist!");

                }

            }
            if (placePiece) {

                gameText.setText("");

                if (pos == 1) {
                    btn1.setText(symbol);
                } else if (pos == 2) {
                    btn2.setText(symbol);
                } else if (pos == 3) {
                    btn3.setText(symbol);
                } else if (pos == 4) {
                    btn4.setText(symbol);
                } else if (pos == 5) {
                    btn5.setText(symbol);
                } else if (pos == 6) {
                    btn6.setText(symbol);
                } else if (pos == 7) {
                    btn7.setText(symbol);
                } else if (pos == 8) {
                    btn8.setText(symbol);
                } else if (pos == 9) {
                    btn9.setText(symbol);
                }


            }

        }

        if (!gameOver) {
            gameText.setText(checkWinner());
        }

        System.out.println("Player Positions: " + playerPositions);
        System.out.println("CPU Positions: " + cpuPositions);

    }

    public static int cpuPositionPicker() {

        Random rand = new Random();
        int pickedPosition = rand.nextInt(9) + 1;
        while (playerPositions.contains(pickedPosition) || cpuPositions.contains(pickedPosition)) {
            pickedPosition = rand.nextInt(9) + 1;
            if (playerPositions.size() + cpuPositions.size() == 9) {
                System.out.println("Can't play, no more moves.");
                return 10;
            }
        }
        return pickedPosition;

    }

}

