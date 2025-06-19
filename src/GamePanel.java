import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    //Screen settings
    final int orginalTileSize = 16; //16x16 tile size
    final int scale = 3;  //Increase the char scale

    final int tileSize = orginalTileSize * scale; //48x48 tile

    //Total screen to be displayed vertically and horizontally
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;  //768 pixels
    final int screenHeight = tileSize * maxScreenRow;  //576 pixels

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){

        //Create Game Loop
        while(gameThread != null) {

            //1. Update : update information such as character positions
            update();
            //2. Draw : draw the screen with updated information
            repaint();
        }
    }
    public void update() {

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white);
        g2.fillRect(100,100,tileSize,tileSize);

        g2.dispose();
    }
}
