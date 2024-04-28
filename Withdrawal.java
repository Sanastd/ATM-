import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Withdrawal implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton enter;
    JTextField amount;
    Font font = new Font("Avenir", 1,22);
    Withdrawal(){
        frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(3);
        frame.setSize(900,700);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,900,700);
        panel.setBackground(Color.cyan);
        enter = new JButton("ثبت");
        enter.setBounds(300, 500,300,100);
        enter.addActionListener(this);
        JLabel m = new JLabel();
        m.setText("مبلغ مورد نظر را وارد کنید:");
        m.setFont(font);
        m.setBounds(375,200,300,100);
        amount = new JTextField();
        amount.setBounds(300,300,300,100);
        panel.add(enter);
        panel.add(m);
        panel.add(amount);
        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==enter){
            frame.dispose();
            Finish finish = new Finish();
        }
    }
}
