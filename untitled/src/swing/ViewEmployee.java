package swing;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewEmployee {

    public static void main(String[] args) {
        new ViewEmployee();
    }

    ViewEmployee(){
        JFrame screen = new JFrame();


        JLabel title = new JLabel("View Details");
        screen.add(title);
        title.setBounds(300,30,160,30);
        title.setFont(new Font("Poppins", Font.BOLD,20));

        String []column ={"Name", "Code", "Position", "Salary"};

//        String data[][] = {
//                {"Spydei", "SM0012", "Hero", "1234"},
//                {"Peter", "SM0013", "Human", "1235"}
//        };


        String query = "Select * from employee";
        DbConnect db = new DbConnect();
        ArrayList<Staff> emp = new ArrayList<Staff>();

        try{
            ResultSet result = db.connection().executeQuery(query);

            while(result.next()){
                String name = result.getString("name");
                String code = result.getString("code");
                String designation = result.getString("designation");
                int salary = Integer.parseInt(result.getString("salary"));

                Staff sf = new Staff(name, code, designation, salary);
                emp.add(sf);
//                System.out.println(name+" "+ code+" "+ designation+ " "+ salary+ " ");
//                System.out.println("...");

            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }

        Object [][]data = new Object[emp.size()][column.length];

        for(int i=0; i<emp.size(); i++){
            data[i][0] = emp.get(i).name;
            data[i][1] = emp.get(i).code;
            data[i][2] = emp.get(i).designation;
            data[i][3] = emp.get(i).salary;

        }

        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        screen.add(sp);
        sp.setBounds(10, 60, 750, 400);
        jt.setFont(new Font("Poppins", Font.BOLD,14));

        JButton delete = new JButton("Delete");
        screen.add(delete);
        delete.setBounds(70, 466, 90, 25);
        delete.setFont(new Font("Poppins", Font.PLAIN,12));

        JButton update = new JButton("Update");
        screen.add(update);
        update.setBounds(170, 466, 90, 25);
        update.setFont(new Font("Poppins", Font.PLAIN,12));

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = jt.getSelectedRow();

                System.out.println(row);

                if (row >= 0) {
                    TableModel model = jt.getModel();

                    String code = (String) model.getValueAt(row, 1);
                    String dquery = "delete from employee where code = '"+code+"'";

//                    System.out.println(dquery);

                    try {

                        int dresult = db.connection().executeUpdate(dquery);
//                        System.out.println(dresult);
//
                        if(dresult == 1){
                            JOptionPane.showMessageDialog(screen, "Personnel data removed.");
                            screen.dispose();
                            new ViewEmployee();
                        }

                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }

                    System.out.println(code);

                }
                else{
                    JOptionPane.showMessageDialog(screen, "Please select a data to delete.");
                }
            }
        });


        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = jt.getSelectedRow();
                if (row >= 0) {

                    screen.setSize(780, 690);

                    JLabel lname = new JLabel("Name:");
                    screen.add(lname);
                    lname.setBounds(440, 466, 60, 25);
                    lname.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JTextField tfname = new JTextField();
                    screen.add(tfname);
                    tfname.setBounds(550, 464, 150, 25);
                    tfname.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JLabel lcode = new JLabel("Code:");
                    screen.add(lcode);
                    lcode.setBounds(440, 500, 60, 25);
                    lcode.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JTextField tfcode = new JTextField();
                    screen.add(tfcode);
                    tfcode.setBounds(550, 500, 150, 25);
                    tfcode.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JLabel ldesig = new JLabel("Designation:");
                    screen.add(ldesig);
                    ldesig.setBounds(440, 536, 80, 25);
                    ldesig.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JTextField tfdesig = new JTextField();
                    screen.add(tfdesig);
                    tfdesig.setBounds(550, 536, 150, 25);
                    tfdesig.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JLabel lsalary = new JLabel("Salary:");
                    screen.add(lsalary);
                    lsalary.setBounds(440, 570, 80, 25);
                    lsalary.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JTextField tfsalary = new JTextField();
                    screen.add(tfsalary);
                    tfsalary.setBounds(550, 570, 150, 25);
                    tfsalary.setFont(new Font("Poppins", Font.PLAIN, 13));

                    JButton save;
                    save = new JButton("Save");
                    screen.add(save);
                    save.setBounds(630, 612, 65, 22);
                    save.setFont(new Font("poppins", Font.PLAIN, 12));

                    TableModel model = jt.getModel();
                    String name = (String) model.getValueAt(row, 0);
                    String code = (String) model.getValueAt(row, 1);
                    String designation = (String) model.getValueAt(row, 2);
                    int salary = (int) model.getValueAt(row, 3);

                    tfname.setText(name);
                    tfcode.setText(code);
                    tfdesig.setText(designation);
                    tfsalary.setText(Integer.toString(salary));


                    save.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String name = tfname.getText();
                            String designation = tfdesig.getText();
                            String salary = tfsalary.getText();

                            int row = jt.getSelectedRow();


                            System.out.println(row);

                            if (row >= 0) {
                                TableModel model = jt.getModel();

                                String code = (String) model.getValueAt(row, 1);
                                String uquery = "update employee set name = '"+name+"', code = '"+code+"', designation ='"+designation+"', salary ='"+salary+"' where code = '"+code+"'";
                                System.out.println(uquery);

//                    System.out.println(dquery);

                                try {

                                    int dresult = db.connection().executeUpdate(uquery);
//                        System.out.println(dresult);
//
                                    if(dresult == 1){
                                        JOptionPane.showMessageDialog(screen, "Personnel data updated.");
                                        screen.dispose();
                                        new ViewEmployee();
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }

                                System.out.println(code);

                            }
                            else{
                                JOptionPane.showMessageDialog(screen, "Please select a data to delete.");
                            }
                        }
                    });

                }
                else{
                    JOptionPane.showMessageDialog(screen, "Select a data to update.");
                }
            }
        });

        screen.setLayout(null);
        screen.setSize(780,550);
        screen.setVisible(true);
    }

}
