import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class Brick_Breaker extends JLabel implements ActionListener, KeyListener {
    public static JFrame frame = new JFrame();
    public static Image platform;
    public static Image ball;

    public static Image brick;

    public int bricks =30;

    Timer timer;

    public int WIDTH = 1000;
    public int HEIGHT = 700;

    public static int x = 500;
    public static int x_ball = 500;
    public static int y_ball = 400;
    public static int x_ball_velocity = 1;
    public static int y_ball_velocity = 1;

    public static int[] brick_x = {10, 110, 210, 310, 410,510, 610, 710, 810, 910, 11, 111, 211, 311, 411, 511, 611, 711, 811, 911, 12, 112, 212, 312, 412,  512, 612, 712, 812, 912,};
    public static int[] brick_y = {30, 70, 110};
    public Brick_Breaker() throws IOException {
        platform = ImageIO.read(new File("platform.png")).getScaledInstance(180, 50, Image.SCALE_DEFAULT);
        ball = ImageIO.read(new File("ball.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        brick = ImageIO.read(new File("brick.png")).getScaledInstance(80, 30, Image.SCALE_DEFAULT);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.add(this);
        timer = new Timer(13, this);
        timer.start();

    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D platform_g = (Graphics2D) g;
        Graphics2D ball_g = (Graphics2D) g;
        Graphics2D brick_g = (Graphics2D) g;
        platform_g.drawImage(platform, x, 600, null);
        ball_g.drawImage(ball, x_ball, y_ball, null);
        for (int i = 0; i <= 9; i++) {

                brick_g.drawImage(brick, brick_x[i], 30, null);
        }
        for (int i = 10; i <= 19; i++) {

            brick_g.drawImage(brick, brick_x[i], 70, null);
        }
        for (int i = 20; i <= 29; i++) {

            brick_g.drawImage(brick, brick_x[i], 110, null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key){
            case 39:
                x += 10;
                break;
            case 37:
                x -= 10;
                break;
    }}

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x_ball = x_ball + (4 * x_ball_velocity);
        y_ball = y_ball + (4 * y_ball_velocity);
        if(x_ball >= WIDTH - ball.getWidth(null) || x_ball<= 0){
            x_ball_velocity *= -1;
        }
        if(y_ball >= HEIGHT- ball.getHeight(null) || y_ball <= 0){
            y_ball_velocity *= -1;
        }
        if(y_ball == 500 && x >= x_ball - 200 && x <= x_ball + 160){
            y_ball_velocity *= -1;
        }

            for (int i = 0; i <= 9; i++) {

                if (brick_x[i] >= x_ball - 30 && brick_x[i] <= x_ball + 30 && 30 >= y_ball - 15 && 30 <= y_ball + 15) {
                    brick_x[i] = 1000;
                    bricks -= 1;
                    System.out.println("Zostało: " + bricks);
                    y_ball_velocity *= -1;

                }
            }
        for (int i = 10; i <= 19; i++) {

            if (brick_x[i] >= x_ball - 30 && brick_x[i] <= x_ball + 30 && 70 >= y_ball - 15 && 70 <= y_ball + 15) {
                brick_x[i] = 1000;
                bricks -= 1;
                System.out.println("Zostało: " + bricks);
                y_ball_velocity *= -1;

            }
        }
        for (int i = 20; i <= 29; i++) {

            if (brick_x[i] >= x_ball - 30 && brick_x[i] <= x_ball + 30 && 110 >= y_ball - 15 && 110 <= y_ball + 15) {
                brick_x[i] = 1000;
                bricks -= 1;
                System.out.println("Zostało: " + bricks);
                y_ball_velocity *= -1;

            }
        }
        if(y_ball >= 600){
            System.out.println("dead");
            x_ball_velocity = 0;
            y_ball_velocity = 0;
        }
        if(bricks <= 0){
            System.out.println("wygrales");
            x_ball_velocity = 0;
            y_ball_velocity = 0;
        }
        repaint();
    }
}