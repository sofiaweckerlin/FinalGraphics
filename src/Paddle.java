import javax.swing.*;
import java.awt.*;
public class Paddle{
    private int x, y, width, height, ySpeed;
    private Color color;
    //public static int padScore;

    public Paddle(JPanel panel){
        x = 0;
        y = 0;
        width = 20;
        height = 70;
        ySpeed = 8;
        color = Color.BLUE;
    }

    public void drawPaddle(Graphics g){

        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void moveUp(JPanel panel){ //moving down
        y+=ySpeed;

        if(y >= panel.getHeight()-height){
            y = panel.getHeight()-height;
        }
    }

    public void moveDown(JPanel panel){ //moving up
        y-=ySpeed;

        if(y <= 0){
            y = 0;
        }
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


    public int findPaddleX(){
        return x;
    }

    public int findPaddleY(){
        return y;
    }

    public int findPaddleW(){
        return width;
    }

    public int findPaddleH(){
        return height;
    }

//    public static void setPadScore(int score){
//        padScore = score;
//    }
//
//    public static int getPadScore(){
//        return padScore;
//    }

}