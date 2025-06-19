import javax.swing.*;

public class Main{
    public static void main(String [] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D-Advanture");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null); // Window will be displayed center of the screen
        window.setVisible(true);

        gamePanel.startGameThread();


    }
}