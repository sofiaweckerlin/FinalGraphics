import javax.swing.*;
import java.awt.*;
public class Ball{
    private int x, y, size, xSpeed, ySpeed;
    private Color color;
    private int count;

    public Ball(JPanel panel){
        x = 250;
        y = (int)(Math.random()*450)+1;
        size = 30;
        // xSpeed = (int)(Math.random()*3);
        // ySpeed = (int)(Math.random()*3);
        xSpeed = 1;
        ySpeed = 1;
        color = new Color(255,0,0);
        count = 0;
    }

    public void drawBall(Graphics g){

        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    public void moveBall(JPanel panel){
        x+=xSpeed;
        y+=ySpeed;

        if(y >= panel.getHeight()-size || y <= 0){
            ySpeed *= -1;
        }

        if(x >= panel.getWidth()-size || x <= 0){
            xSpeed *= -1;
        }
        // if(y >= panel.getHeight()-size || y<= 0){
        //   count++;
        //   if(count == 5){
        //     //(Main.newFrame).setVisible(true);
        //   }
        // }
        // if(x >= panel.getWidth()-size || x<= 0){
        //   count++;
        //   if(count == 5){
        //     //new panel
        //   }
        // }
    }


    public int findBallX(){
        return x;
    }

    public int findBallY(){
        return y;
    }

    public int getSize(){

        return size;
    }

    //method that bounces the ball automatically
    public void bounce(JPanel panel){
        ySpeed *= -1;
        xSpeed *= -1;
    }


}