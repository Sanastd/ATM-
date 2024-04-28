import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Transfer implements ActionListener{
    JFrame frame;
    JPanel panel;
    JButton enter;
    JTextField amount;
    JTextField cart;
    Font font = new Font("Avenir", 1,22);
    Transfer(){
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
        m.setBounds(350,100,300,50);
        amount = new JTextField();
        amount.setBounds(300,150,300,100);
        JLabel sh = new JLabel();
        sh.setText("شماره کارت مقصد را وارد کنید:");
        sh.setFont(font);
        sh.setBounds(330,300,300,50);
        cart = new JTextField();
        cart.setBounds(300,350,300,100);
        panel.add(enter);
        panel.add(m);
        panel.add(amount);
        panel.add(sh);
        panel.add(cart);
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
