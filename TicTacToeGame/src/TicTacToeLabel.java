import javax.swing.*;
import java.awt.*;

public class TicTacToeLabel extends JLabel {
    ImageIcon przycisk0;
    ImageIcon przycisk1;
    ImageIcon przycisk2;
    private boolean onOff = true;
    TicTacToeLabel(){
        this.setSize(new Dimension(200,200));
        przycisk0 = new ImageIcon(getClass().getClassLoader().getResource("Przycik2.png"));
        przycisk1 = new ImageIcon(getClass().getClassLoader().getResource("Kolko.png"));
        przycisk2 = new ImageIcon(getClass().getClassLoader().getResource("Krzyzyk.png"));
        this.setIcon(przycisk0);
    }
    public int changeImage(int x){
        if(x%2 == 0){
            this.setIcon(przycisk1);
            return 1;
        }
        else{
            this.setIcon(przycisk2);
            return 2;
        }

    }
    public boolean isOnOff(){
        return onOff;
    }
    public void setOff(){
        onOff =false;
    }
    public void newGame(){
        this.setIcon(przycisk0);
        onOff =true;
    }



}