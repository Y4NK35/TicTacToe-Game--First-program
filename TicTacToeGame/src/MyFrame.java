import org.w3c.dom.ls.LSOutput;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.RandomAccess;

public class MyFrame extends JFrame implements MouseListener, ActionListener {
    JButton buttonNewGame;
    JButton buttonExit;
    JPanel panelMain;
    JPanel panelTop;
    JLabel whoIsMoveLabel;
    TicTacToeLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
    ImageIcon kolko;
    ImageIcon krzyzyk;
    Random  rnd = new Random();
    int counter, firstNumber;
    int[] winner = new int[9];


    MyFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 830);
        this.setLayout(new BorderLayout(0, 0));
        this.setTitle("Tic Tac Toe");
        buttonNewGame = new JButton("New Game");
        buttonNewGame.setPreferredSize(new Dimension(480, 100));
        buttonNewGame.addActionListener(this);
        counter = rnd.nextInt(2)+1;
        firstNumber = counter;
        buttonExit = new JButton("Exit game");
        buttonExit.setPreferredSize(new Dimension(600, 100));
        buttonExit.addActionListener(this);

        panelMain = new JPanel();
        panelMain.setPreferredSize(new Dimension(600, 600));
        panelMain.setLayout(new GridLayout(3, 3));
        panelTop =new JPanel();
        panelTop.setPreferredSize(new Dimension(600, 100));
        panelTop.setLayout(new FlowLayout (FlowLayout.LEFT, 0, 0));
        panelTop.setOpaque(true);
        whoIsMoveLabel =new JLabel();
        whoIsMoveLabel.setPreferredSize(new Dimension(100,100));

        label1 = new TicTacToeLabel();
        label1.addMouseListener(this);
        label2 = new TicTacToeLabel();
        label2.addMouseListener(this);
        label3 = new TicTacToeLabel();
        label3.addMouseListener(this);
        label4 = new TicTacToeLabel();
        label4.addMouseListener(this);
        label5 = new TicTacToeLabel();
        label5.addMouseListener(this);
        label6 = new TicTacToeLabel();
        label6.addMouseListener(this);
        label7 = new TicTacToeLabel();
        label7.addMouseListener(this);
        label8 = new TicTacToeLabel();
        label8.addMouseListener(this);
        label9 = new TicTacToeLabel();
        label9.addMouseListener(this);

        panelMain.add(label1);
        panelMain.add(label2);
        panelMain.add(label3);
        panelMain.add(label4);
        panelMain.add(label5);
        panelMain.add(label6);
        panelMain.add(label7);
        panelMain.add(label8);
        panelMain.add(label9);
        panelTop.add(whoIsMoveLabel);
        panelTop.add(buttonNewGame);
        kolko = new ImageIcon(getClass().getClassLoader().getResource("Kolko100.png"));
        krzyzyk = new ImageIcon(getClass().getClassLoader().getResource("Krzyzyk100.png"));
        whoMoveIs(counter);
        this.add(panelTop, BorderLayout.NORTH);
        this.add(buttonExit, BorderLayout.SOUTH);
        this.add(panelMain, BorderLayout.CENTER);
        setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (label1 == e.getSource() && label1.isOnOff()) {
            winner[0] = label1.zmienObraz(counter);
            label1.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label2 == e.getSource() && label2.isOnOff()) {
            winner[1] = label2.zmienObraz(counter);
            label2.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label3 == e.getSource() && label3.isOnOff()) {
            winner[2] = label3.zmienObraz(counter);
            label3.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label4 == e.getSource() && label4.isOnOff()) {
            winner[3] = label4.zmienObraz(counter);
            label4.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label5 == e.getSource() && label5.isOnOff()) {
            winner[4] = label5.zmienObraz(counter);
            label5.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label6 == e.getSource() && label6.isOnOff()) {
            winner[5] = label6.zmienObraz(counter);
            label6.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label7 == e.getSource() && label7.isOnOff()) {
            winner[6] = label7.zmienObraz(counter);
            label7.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label8 == e.getSource() && label8.isOnOff()) {
            winner[7] = label8.zmienObraz(counter);
            label8.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
        if (label9 == e.getSource() && label9.isOnOff()) {
            winner[8] = label9.zmienObraz(counter);
            label9.setOff();
            counter++;
            theWinnerIs(winner);
            whoMoveIs(counter);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void theWinnerIs(int[] x) {
        if (x[0] == 1 && x[1] == 1 && x[2] == 1 || x[3] == 1 && x[4] == 1 && x[5] == 1 || x[6] == 1 && x[7] == 1 && x[8] == 1 || x[0] == 1 && x[3] == 1 && x[6] == 1 || x[1] == 1 && x[4] == 1 && x[7] == 1
                || x[2] == 1 && x[5] == 1 && x[8] == 1 || x[0] == 1 && x[4] == 1 && x[8] == 1 || x[2] == 1 && x[4] == 1 && x[6] == 1) {
            System.out.println(" The winner is Player1");
            for(int i =0;i<9;i++){
                if(winner[0] ==0) label1.setOff();
                if(winner[1] ==0) label2.setOff();
                if(winner[2] ==0) label3.setOff();
                if(winner[3] ==0) label4.setOff();
                if(winner[4] ==0) label5.setOff();
                if(winner[5] ==0) label6.setOff();
                if(winner[6] ==0) label7.setOff();
                if(winner[7] ==0) label8.setOff();
                if(winner[8] ==0) label9.setOff();
            }
            JOptionPane.showMessageDialog(null,"The winnner is Player1","END",JOptionPane.PLAIN_MESSAGE);
        } else if (x[0] == 2 && x[1] == 2 && x[2] == 2 || x[3] == 2 && x[4] == 2 && x[5] == 2 || x[6] == 2 && x[7] == 2 && x[8] == 2 || x[0] == 2 && x[3] == 2 && x[6] == 2 || x[1] == 2 && x[4] == 2 && x[7] == 2
                || x[2] == 2 && x[5] == 2 && x[8] == 2 || x[0] == 2 && x[4] == 2 && x[8] == 2 || x[2] == 2 && x[4] == 2 && x[6] == 2) {
            System.out.println(" The winner is Player2");
            JOptionPane.showMessageDialog(null,"The winnner is Player2","END",JOptionPane.PLAIN_MESSAGE);
            for(int i =0;i<9;i++){
                if(winner[0] ==0) label1.setOff();
                if(winner[1] ==0) label2.setOff();
                if(winner[2] ==0) label3.setOff();
                if(winner[3] ==0) label4.setOff();
                if(winner[4] ==0) label5.setOff();
                if(winner[5] ==0) label6.setOff();
                if(winner[6] ==0) label7.setOff();
                if(winner[7] ==0) label8.setOff();
                if(winner[8] ==0) label9.setOff();
            }
        }else if(counter== firstNumber+9)
            JOptionPane.showMessageDialog(null,"Draw","END",JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (buttonNewGame == e.getSource()) {
            label1.newGame();
            label2.newGame();
            label3.newGame();
            label4.newGame();
            label5.newGame();
            label6.newGame();
            label7.newGame();
            label8.newGame();
            label9.newGame();
            whoMoveIs(counter);
            counter = rnd.nextInt(2)+1;
            firstNumber = counter;
            for(int i=1; i<9;i++) {
                winner[i]=0;
            }
            System.out.println("new game" + counter);
        }
        if (buttonExit == e.getSource()) {
            System.exit(0);
        }
    }
    public void whoMoveIs(int x){
        if(x%2==0){
            whoIsMoveLabel.setIcon(kolko);
        }
        if(x%2==1) {
            whoIsMoveLabel.setIcon(krzyzyk);
        }
    }
}