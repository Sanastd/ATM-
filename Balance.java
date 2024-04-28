import javax.swing.*;
import java.awt.*;
public class Balance {
    JFrame frame;
    JPanel panel;
    Font font = new Font("Avenir", 1,22);
   Balance(){
        frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(3);
        frame.setSize(900,700);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,900,700);
        panel.setBackground(Color.cyan);
        JLabel balance = new JLabel();
        balance.setText("موجودی حساب شما: ۱۲۳۰۰۰۰۰ ریال ");
        balance.setFont(font);
        balance.setBounds(300,200,300,100);
        panel.add(balance);
        frame.add(panel);
        frame.setVisible(true);
    }
}
