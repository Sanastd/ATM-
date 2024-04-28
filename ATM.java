import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ATM implements ActionListener {
    JFrame mframe;
    JButton l1;
    JButton l2;
    JLabel label;
    JPanel lpanel;
    JPanel panel;

    Font font = new Font("Avenir", 1,22);
    ATM(){
        mframe = new JFrame("ATM");
        mframe.setDefaultCloseOperation(3);
        mframe.setSize(900,700);
        mframe.setLayout(null);

        lpanel = new JPanel();
        lpanel.setLayout(null);
        lpanel.setBounds(0,0,900,700);
        lpanel.setBackground(Color.cyan);

        l1 = new JButton("English");
        l2 = new JButton("فارسی");
        l1.addActionListener(this);
        l1.setFont(font);
        l1.setFocusable(false);
        l2.addActionListener(this);
        l2.setFont(font);
        l2.setFocusable(false);
        l1.setBounds(0,300,150,100);
        l2.setBounds(750,300,150,100);
        label = new JLabel();
        label.setText("Choose Language   زبان خود را انتخاب کنید");
        label.setFont(font);
        label.setBounds(250,300,500,100);

        lpanel.add(l1);
        lpanel.add(l2);
        lpanel.add(label);
        lpanel.setVisible(true);
        mframe.add(lpanel);
        mframe.setVisible(true);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==l1 || e.getSource()==l2){
            mframe.dispose();
            Password password = new Password();
        }
    }
}