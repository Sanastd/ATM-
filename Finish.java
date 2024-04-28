import javax.swing.*;
import java.awt.*;
public class Finish {
    JFrame frame;
    JPanel panel;
    Font font = new Font("Avenir", 1,22);
    Finish(){
        frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(3);
        frame.setSize(900,700);
        frame.setLayout(null);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,900,700);
        panel.setBackground(Color.cyan);
        JLabel done = new JLabel();
        done.setText("عملیات با موفقیت انجام شد!");
        done.setFont(font);
        done.setBounds(350,300,300,100);
        panel.add(done);
        frame.add(panel);
        frame.setVisible(true);
    }
}
