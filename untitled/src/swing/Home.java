package swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home{

    public static void main(String[] args) {

        Login log = new Login();
    }

}

class Login{

    Login(){
        JFrame f = new JFrame("Login");
        f.setLayout(null);

        JLabel lUser, lpsw;
        JTextField tfuser;
        JPasswordField tfpsw;
        JButton jblog, jbsignup;

        lUser = new JLabel("Username:");
        f.add(lUser);
        lUser.setBounds(100,100,100,30);

        tfuser = new JTextField(15);
        f.add(tfuser);
        tfuser.setBounds(170,100,150,25);

        lpsw = new JLabel("Password:");
        f.add(lpsw);
        lpsw.setBounds(100,140,100,30);

        tfpsw = new JPasswordField(15);
        f.add(tfpsw);
        tfpsw.setBounds(170,140,150,25);

        jblog = new JButton("Login");
        f.add(jblog);
        jblog.setBounds(150,200,80,30);

        jbsignup = new JButton("Sign Up");
        f.add(jbsignup);
        jbsignup.setBounds(250,200,80,30);


        jblog.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String user = tfuser.getText();
                String pw = tfpsw.getText();
                int result = userLogin(user, pw);

                if(result == 1){
                    new Employee();
                    f.dispose();
                }

//                if(user.equals("mano123") && pw.equals("1234")){
//                    new Employee();
//                    f.dispose();
//                }
//                else{
//                    JOptionPane.showMessageDialog(f,"Invalid Username of Password!!!");
//                }

            }
        });


        jbsignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new Register();
            }
        });


        f.setSize(500,500);
        f.setVisible(true);

    }//end of constructor

    public int userLogin(String user, String psw){
        if(user.equals("admin") && psw.equals("admin")){
            return 1;
        }
        return 0;
    }

}
