
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;

public class StFrame {

    private static GraphicsConfiguration gConfiguration;
    public static void main(String[] args) {
        JFrame frame = new JFrame(gConfiguration);
        frame.setTitle("My JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocation(400, 200);
        frame.setBackground(Color.GREEN);
        frame.setVisible(true);
    }
    
}






