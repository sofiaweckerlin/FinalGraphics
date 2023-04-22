//pong game
//computer paddle must follow the ball somehow - just automatically bounces up and down
import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args){

        JFrame myFrame = new JFrame();
        myFrame.setSize(500, 500);
        Main myPanel = new Main();
        PaddlePanel paddlePanel = new PaddlePanel();


//        paddlePanel.setLayout(new BorderLayout());
//        JLabel comScore = new JLabel("0");
//        comScore.setFont(new Font("Calibri", Font.BOLD, 50));
//        comScore.setForeground(Color.WHITE);
//        comScore.setHorizontalAlignment(JLabel.CENTER);
//        paddlePanel.add(comScore, BorderLayout.SOUTH);
//
//        JLabel padScore = new JLabel("0");
//        padScore.setFont(new Font("Calibri", Font.BOLD, 50));
//        padScore.setForeground(Color.BLUE);
//        padScore.setHorizontalAlignment(JLabel.CENTER);
//        paddlePanel.add(padScore, BorderLayout.NORTH);





        // JFrame newFrame = new JFrame();
        // newFrame.setSize(500, 500);
        // JPanel gameOver = new JPanel();
        // gameOver.setLayout(new BorderLayout());
        // JLabel label = new JLabel("GAME OVER");


        // gameOver.add(label, BorderLayout.CENTER);
        //   newFrame.add(gameOver);

        myFrame.add(paddlePanel);

        myFrame.setVisible(true);




    }
}