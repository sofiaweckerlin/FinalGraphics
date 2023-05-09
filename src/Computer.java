//computer paddle
import javax.swing.*;
import java.awt.*;
public class Computer{
    private int x, y, width, height, ySpeed;
    private Color color;
    //public static int comScore;

    public Computer(JPanel panel){
        x = 480;
        y = 0;
        width = 20;
        height = 70;
        ySpeed = 1;
        color = Color.WHITE;
    }

    public void drawPaddle(Graphics g){

        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void movePaddle(JPanel panel, int ballPos){
        y+=ySpeed;
        if(y>=panel.getHeight()-height || y <= 0){
            ySpeed *= -1;
        }

        if(y>ballPos){
            y-=ySpeed;
        }
        if(y<ballPos){
            y+=ySpeed;
        }
        //y+=ySpeed;

    }

    public boolean ifHit(Ball ball){
        int rightX = x+width;
        int rightY = y+height;
        if(ball.findBallX() > x && ball.findBallX() < rightX){
            if(ball.findBallY() > y && ball.findBallY() < rightY){
                return true;
            }
        }
        return false;
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

//    public static void setComScore(int score){
//        comScore = score;
//    }
//
//    public static int getComScore(){
//        return comScore;
//    }




}