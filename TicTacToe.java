import javafx.scene.control.Cell;

import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;
import  javax.swing.border.LineBorder;
public class TicTacToe {
    private  char whoseTurn = 'X';
    private  Cell[][] cells =new Cell[3][3];
    private JLabel jlblStatus = new JLabel("X's turn to play");

    public TicTacToe() {
        JPanel p = new JPanel(new GridLayout(3,3,0,0));

                p.add((cells[i][j] = new Cell());
            p.setBorder(new LineBorder(Color.yellow,1));
            add(p,BorderLayout.CENTER);
        for(int i =0;i<3;i++)
            for(int j =0;j<3;j++)       add(jlblStatus,BorderLayout.SOUTH);
    }
    public boolean isFull(){
        for(int i =0;i<3;i++)
            for(int j =0;j<3;j++)
                if(cells[i][j].getToken()=='')
                    return false;
                return  true;
    }
    public  boolean isWon(char Token){
        for(int i =0;i<3;i++)
            if((cells[i][0].getToken()== token)&&(cells[1][j].getToken()==token)
                    &&(cells[2][j].getToken()==token)){
                return  true;
            }
        for(int j=0;j<3;j++)
            if((cells[0][j]).getToken()==token)&&(cells[1][j].getToken()==token)
                &&(cells[2][j].getToken()==token)){
                    return  true;
        }
    }
}
