import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
//add button to start the game
//add score at the top
//add button to pause, quit, play again etc
//when person loses add option to quit or play again - max score is 5?
//if hits paddle it adds point
//if hits wall the ball stops and game ends
//if hits paddle it bounces off - changes to negative?
//each time ball bounces off paddle the score for the side goes up
public class PaddlePanel extends JPanel{

    Paddle cat;
    Computer pony;
    Ball ball;
    PaddlePanel me;
    private int px,py,cx,cy,pw,ph,cw,ch,bx,by,bsize,pScore,cScore;

//    JLabel comScore = new JLabel("0");
//    JLabel padScore = new JLabel("0");


    public PaddlePanel(){
        setBackground(Color.BLACK);
        cat = new Paddle(this);
        pony = new Computer(this);
        ball = new Ball(this);
        pScore = 0;
        cScore = 0;
//        me = this;
//
//        comScore.setFont(new Font("Calibri", Font.BOLD, 50));
//        comScore.setForeground(Color.WHITE);
//        comScore.setHorizontalAlignment(JLabel.CENTER);
//        padScore.setFont(new Font("Calibri", Font.BOLD, 50));
//        padScore.setForeground(Color.BLUE);
//        padScore.setHorizontalAlignment(JLabel.CENTER);
//
//        this.setLayout(new BorderLayout());
//        this.add(comScore, BorderLayout.SOUTH);
//        this.add(padScore, BorderLayout.NORTH);

        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode());
                int keyCode = e.getKeyCode();


                if(keyCode == 40){
                    cat.moveUp(PaddlePanel.this);
                }
                if(keyCode == 38){
                    cat.moveDown(PaddlePanel.this);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);


        g.setColor(Color.WHITE);
        g.drawString(""+pScore, 250, 10);
        g.drawString(""+cScore, 250, 490);

        cat.drawPaddle(g);
        pony.drawPaddle(g);
        ball.drawBall(g);
        pony.movePaddle(this, ball.findBallY());
        //pony.bounceComputer(this);
        ball.moveBall(this);

        if(pony.ifHit(ball)){
            ball.bounce(this);
            cScore++;
        }
        if(cat.ifHit(ball)){
            ball.bounce(this);
            pScore++;
        }


//         px = cat.findPaddleX();
//         py = cat.findPaddleY();
//         cx= pony.findComputerX();
//         cy = pony.findComputerY();
//         pw = cat.findPaddleW();
//         ph = cat.findPaddleH();
//         cw = pony.findComputerW();
//         ch = pony.findComputerH();
//         bx = ball.findBallX();
//         by = ball.findBallY();
//         bsize = ball.getSize();
//         pScore = 0;
//         cScore = 0;
//
//        if((px==bx) && (by>=py && by<=py+ph)){
//            ball.bounce(me);
//            pScore = pScore+1; //not updating, just staying at 1
//            System.out.println(pScore);
//            //Paddle.setPadScore(pScore);
//            padScore.setText(""+pScore);
//            me.removeAll();
//            me.add(comScore, BorderLayout.SOUTH);
//            me.add(padScore, BorderLayout.NORTH);
//        }
//
//        if((cx==bx) && (by>=cy && by<=cy+ch)){
//            ball.bounce(me);
//            cScore++;
//            //Computer.setComScore(cScore);
//            comScore.setText(""+cScore);
//            me.removeAll();
//            me.add(comScore, BorderLayout.SOUTH);
//            me.add(padScore, BorderLayout.NORTH);
//        }


        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }



        repaint();
    }



}