import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Password implements ActionListener {
    JFrame frame;
    JPanel ppanel;
    JButton enter;
    JTextField password;
    Font font = new Font("Avenir", 1,22);
    Password(){
        frame = new JFrame("ATM");
        frame.setDefaultCloseOperation(3);
        frame.setSize(900,700);
        frame.setLayout(null);

        ppanel = new JPanel();
        ppanel.setLayout(null);
        ppanel.setBounds(0,0,900,700);
        ppanel.setBackground(Color.cyan);
        enter = new JButton("ثبت");
        enter.setBounds(300, 500,300,100);
        enter.addActionListener(this);
        JLabel pass = new JLabel();
        pass.setText("رمز خود را وارد کنید:");
        pass.setFont(font);
        pass.setBounds(375,200,300,100);
        password = new JTextField();
        password.setBounds(300,300,300,100);
        ppanel.add(enter);
        ppanel.add(pass);
        ppanel.add(password);
        frame.add(ppanel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==enter){
            frame.dispose();
            MainPanel mainPanel = new MainPanel();
        }
    }
}