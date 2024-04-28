import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainPanel implements ActionListener {
    JFrame frame;
    JPanel mpanel;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    Font font = new Font("Avenir", 1,22);
    MainPanel(){
        frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(3);
        frame.setSize(900,700);
        frame.setLayout(null);

        mpanel = new JPanel();
        mpanel.setLayout(null);
        mpanel.setBounds(0,0,900,700);
        mpanel.setBackground(Color.cyan);
        b1 = new JButton("تغییر رمز");
        b1.setBounds(750, 200,100,50);
        b1.addActionListener(this);
        b1.setFocusable(false);
        b2 = new JButton("اعلام موجودی");
        b2.setBounds(750, 400,100,50);
        b2.addActionListener(this);
        b2.setFocusable(false);
        b3 = new JButton("برداشت وجه");
        b3.setBounds(50, 200,100,50);
        b3.addActionListener(this);
        b3.setFocusable(false);
        b4 = new JButton("کارت به کارت");
        b4.setBounds(50, 400,100,50);
        b4.addActionListener(this);
        b4.setFocusable(false);

        mpanel.add(b1);
        mpanel.add(b2);
        mpanel.add(b3);
        mpanel.add(b4);
        frame.add(mpanel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            frame.dispose();
            ChangePass changePass = new ChangePass();
        }
        if (e.getSource()==b2){
            frame.dispose();
            Balance balance = new Balance();
        }
        if (e.getSource()==b3){
            frame.dispose();
            Withdrawal withdrawal = new Withdrawal();
        }
        if (e.getSource()==b4){
            frame.dispose();
            Transfer transfer = new Transfer();
        }
    }
}