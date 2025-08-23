import javax.swing.*;
import java.awt.*;
public class question{
    public static void main(String[] args){
        JFrame frame = new JFrame("Add");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Enter two numbers");
        JTextField num1 = new JTextField(10);
        JTextField num2 = new JTextField(10);

        panel.add(label);
        panel.add(num1);
        panel.add(num2);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);


    }
}