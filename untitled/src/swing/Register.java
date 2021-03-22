package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {

//    public static void main(String[] args) {
//        new Register();
//    }

    Register(){
        JFrame f = new JFrame("Login");
        f.setLayout(null);

        JLabel lUser, lpsw;
        JTextField tfuser;
        JPasswordField tfpsw;
        JButton jblog, jbsignup;

        JLabel title = new JLabel("Register");
        f.add(title);
        title.setBounds(200, 20, 100, 30);
        title.setFont(new Font("Poppins", Font.BOLD,20));

        lUser = new JLabel("Username:");
        f.add(lUser);
        lUser.setBounds(50,100,100,30);
        lUser.setFont(new Font("Poppins", Font.PLAIN,14));

        tfuser = new JTextField(15);
        f.add(tfuser);
        tfuser.setBounds(150,100,150,25);

        lpsw = new JLabel("Password:");
        f.add(lpsw);
        lpsw.setBounds(50,140,100,30);
        lpsw.setFont(new Font("Poppins", Font.PLAIN,14));

        tfpsw = new JPasswordField(15);
        f.add(tfpsw);
        tfpsw.setBounds(150,140,150,25);

        jbsignup = new JButton("Register");
        f.add(jbsignup);
        jbsignup.setBounds(200,200,100,30);
        lpsw.setFont(new Font("Poppins", Font.PLAIN,14));



        jbsignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        f.setSize(500,500);
        f.setVisible(true);
    }
}
