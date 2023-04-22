//computer paddle
import javax.swing.*;
import java.awt.*;
public class Computer{
    private int x, y, width, height, ySpeed;
    private Color color;
    public static int comScore;

    public Computer(JPanel panel){
        x = 450;
        y = 0;
        width = 20;
        height = 70;
        ySpeed = 2;
        color = new Color(255,255,255);
    }

    public void drawPaddle(Graphics g){

        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void movePaddle(JPanel panel){
        y+=ySpeed;
        if(y>=panel.getHeight() || y<= 0){
            ySpeed *= -1;
        }
    }


    public int findComputerX(){
        return x;
    }

    public int findComputerY(){
        return y;
    }

    public int findComputerW(){
        return width;
    }

    public int findComputerH(){
        return height;
    }

    public static void setComScore(int score){
        comScore = score;
    }

    public static int getComScore(){
        return comScore;
    }




}