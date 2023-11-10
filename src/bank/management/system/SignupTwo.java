
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    //long random;
    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, qualification, occupation;
    String formno;
    
    SignupTwo(String formno){

        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel cReligion = new JLabel("Religion:");
        cReligion.setFont(new Font("Raleway", Font.BOLD, 20));
        cReligion.setBounds(100, 140, 100, 30);
        add(cReligion);
        
        String valReligion[] = {"","HINDU", "MUSLIM", "SIKH", "CHRISTIAN", "OTHERS"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        JLabel cCategory = new JLabel("Category:");
        cCategory.setFont(new Font("Raleway", Font.BOLD, 20));
        cCategory.setBounds(100, 190, 200, 30);
        add(cCategory);
        
        String valCategory[] = {"","GEN", "OBC-A", "OBC-B", "SC", "ST", "Others"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel cIncome = new JLabel("Income:");
        cIncome.setFont(new Font("Raleway", Font.BOLD, 20));
        cIncome.setBounds(100, 240, 200, 30);
        add(cIncome);
        
        String valIncome[] = {"", "Below 1 Lakh", "1 Lakh to 3 Lakh", "3 Lakh to 5 Lakh", "5 Lakh to 7 Lakh", "More Than 7 Lakh"};
        income = new JComboBox(valIncome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel cEducational = new JLabel("Educational");
        cEducational.setFont(new Font("Raleway", Font.BOLD, 20));
        cEducational.setBounds(100, 290, 200, 30);
        add(cEducational);

        JLabel cQualification = new JLabel("Qualification:");
        cQualification.setFont(new Font("Raleway", Font.BOLD, 20));
        cQualification.setBounds(100, 315, 200, 30);
        add(cQualification);
        
        String valQualification[] = {"", "Non-Graduate", "Graduate", "Post-Graduate", "Doctorate"};
        qualification = new JComboBox(valQualification);
        qualification.setBounds(300, 315, 400, 30);
        qualification.setBackground(Color.WHITE);
        add(qualification);

        JLabel cOccupation = new JLabel("Occupation:");
        cOccupation.setFont(new Font("Raleway", Font.BOLD, 20));
        cOccupation.setBounds(100, 390, 200, 30);
        add(cOccupation);
        
        String valOccupation[] = {"", "Student", "Farmer", "Teacher", "Employee", "Businessman", "Others"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel cPan = new JLabel("PAN No:");
        cPan.setFont(new Font("Raleway", Font.BOLD, 20));
        cPan.setBounds(100, 440, 200, 30);
        add(cPan);

        pan=new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel cAadhar = new JLabel("Aadhar No:");
        cAadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        cAadhar.setBounds(100, 490, 200, 30);
        add(cAadhar);

        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);

        JLabel cSenior = new JLabel("Senior Citizen:");
        cSenior.setFont(new Font("Raleway", Font.BOLD, 20));
        cSenior.setBounds(100, 540, 200, 30);
        add(cSenior);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup Sci = new ButtonGroup();
        Sci.add(syes);
        Sci.add(sno);

        JLabel cExitac = new JLabel("Exiting Account:");
        cExitac.setFont(new Font("Raleway", Font.BOLD, 20));
        cExitac.setBounds(100, 590, 200, 30);
        add(cExitac);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup Ea = new ButtonGroup();
        Ea.add(eyes);
        Ea.add(eno);

        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);

        setSize (850, 800);
        setLocation (350, 10);
        setVisible (true);
    }
    
    public void actionPerformed(ActionEvent ae) {
    //String formno = "" + random;
    String Religion = (String)religion.getSelectedItem();
    String Category = (String)category.getSelectedItem();
    String Income = (String)income.getSelectedItem();
    String Qualification = (String)qualification.getSelectedItem();
    String Occupation = (String)occupation.getSelectedItem();
    String Pan_no = pan.getText();
    String Aadhar_no = aadhar.getText();

    String Senior_citizen = null;
    if(syes.isSelected()){
        Senior_citizen = "Yes";
    } else if(sno.isSelected()){
        Senior_citizen = "No";
    }
    
    String Exiting_AC = null;
    if(eyes.isSelected()){
        Exiting_AC = "Yes";
    } else if(eno.isSelected()){
        Exiting_AC = "No";
    }


    try {
        
            Conn c = new Conn();
            String query = "INSERT INTO signupTwo VALUES('" + formno + "','" + Religion + "','" + Category + "','" + Income + "','" + Qualification + "','" + Occupation + "','" + Pan_no + "','" + Aadhar_no + "','" + Senior_citizen + "','" + Exiting_AC + "')";
            int rowsInserted = c.s.executeUpdate(query);

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Data inserted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert data.");
            }

            c.s.close(); // Close the statement.
            // Close the database connection.
        

    } catch (Exception e) {
        System.out.println(e);
    }
}
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}
