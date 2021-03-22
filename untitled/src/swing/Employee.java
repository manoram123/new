package swing;
import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Employee {

    public static void main(String[] args) {
        new Employee();
    }

    Employee() {
        JFrame frame = new JFrame("Employee");

        JLabel sf, luser, border;
        JTextField tname, tcode, tdesignation, tsalary;

        JButton save, exit, photo, view;

        sf = new JLabel("Employee Management");
        frame.add(sf);
        sf.setBounds(160, 25, 400, 60);
        sf.setFont(new Font("poppins", Font.BOLD, 22));

        border = new JLabel(" ");
        frame.add(border);
        border.setBorder(new LineBorder(Color.DARK_GRAY));
        border.setBounds(10,80,570,400);

        luser = new JLabel("Name: ");
        frame.add(luser);
        luser.setBounds(50, 120, 200, 35);
        luser.setFont(new Font("poppins", Font.PLAIN, 20));


        tname = new JTextField(35);
        frame.add(tname);
        tname.setBounds(190, 125, 250, 35);
        tname.setFont(new Font("poppins", Font.PLAIN, 20));
        luser = new JLabel("Code: ");
        frame.add(luser);
        luser.setBounds(50, 170, 200, 35);
        luser.setFont(new Font("poppins", Font.PLAIN, 20));

        tcode = new JTextField(35);
        frame.add(tcode);

        tcode.setBounds(190, 175, 250, 35);
        tcode.setFont(new Font("poppins", Font.PLAIN, 20));
        luser = new JLabel("Designation: ");
        frame.add(luser);
        luser.setBounds(20, 220, 300, 35);
        luser.setFont(new Font("poppins", Font.PLAIN, 20));

        tdesignation = new JTextField(35);
        frame.add(tdesignation);
        tdesignation.setBounds(190, 225, 250, 35);
        tdesignation.setFont(new Font("poppins", Font.PLAIN, 20));
        luser = new JLabel("Salary: ");
        frame.add(luser);
        luser.setBounds(50, 270, 200, 35);
        luser.setFont(new Font("poppins", Font.PLAIN, 20));
        tsalary = new JTextField(35);
        frame.add(tsalary);
        tsalary.setBounds(190, 275, 250, 35);
        tsalary.setFont(new Font("poppins", Font.PLAIN, 18));
        luser = new JLabel("Photo:");
        frame.add(luser);
        luser.setBounds(50, 325, 200, 35);
        luser.setFont(new Font("poppins", Font.PLAIN, 20));
        photo = new JButton("Choose File...");
        frame.add(photo);
        photo.setBounds(325, 325, 115, 30);
        photo.setFont(new Font("poppins", Font.PLAIN, 13));


        view = new JButton("View Details");
        frame.add(view);
        view.setBounds(220,440,120,25);
        view.setFont(new Font("poppins",Font.PLAIN,14));

        save = new JButton("Save");
        frame.add(save);
        save.setBounds(480, 510, 80, 25);
        save.setFont(new Font("poppins", Font.PLAIN, 14));

        exit = new JButton("Exit");
        frame.add(exit);
        exit.setBounds(30, 510, 80, 25);
        exit.setFont(new Font("poppins", Font.PLAIN, 14));
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(new Color(230, 230, 230));

        exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int select = JOptionPane.showConfirmDialog(exit, "Do You Want To Exit?");
                if(select == 0){
                    frame.dispose();
                    new Login();
                }

            }
        });
//        JTextField finalTfield = tfield;
        save.addActionListener(e-> {

            String name = tname.getText();
            String code = tcode.getText();
            String position = tdesignation.getText();
            String salary = tsalary.getText();

            try{

                DbConnect db = new DbConnect();

                String query="insert into employee values ('"+name+"','"+code+" ','"+position+"',"+salary+" )";
                int result = db.connection().executeUpdate(query);
                if(result>0){
                    JOptionPane.showMessageDialog(view,"Employee Added");
                }

                System.out.println(result);
                System.out.println(query);
            }
            catch(SQLException e1){
                e1.printStackTrace();
            }


        });



        save.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        });

        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();
                frame.dispose();
            }
        });

        }
}
