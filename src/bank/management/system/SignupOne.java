
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,dobTextField, emailTextField,addressTextField, cityTextField,stateTextField,pincodeTextField,phnumberTextField;
    JButton next;
    JRadioButton male,female,others,married,unmarried,other;
    JDateChooser dateChooser;
    SignupOne(){

        setTitle("Application Form");
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details ");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);

        others = new JRadioButton("Other");
        others.setBounds(600, 290, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);

        ButtonGroup gendergr = new ButtonGroup();
        gendergr.add(male);
        gendergr.add(female);
        gendergr.add(others);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 120, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 120, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup marielst = new ButtonGroup();
        marielst.add(married);
        marielst.add(unmarried);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);
        
        JLabel phnumber = new JLabel("Phone Number:");
        phnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        phnumber.setBounds(100, 640, 200, 30);
        add(phnumber);
        
        phnumberTextField=new JTextField();
        phnumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        phnumberTextField.setBounds(300, 640, 400, 30);
        add(phnumberTextField);

        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 700, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);

        setSize (850, 800);
        setLocation (350, 10);
        setVisible (true);
    }
    
    public void actionPerformed(ActionEvent ae) {
    String formno = "" + random; // Use a different variable name for form number
    String name = nameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if (male.isSelected()) {
        gender = "Male";
    } else if (female.isSelected()) {
        gender = "Female";
    } else if (other.isSelected()) {
        gender = "Other";
    }

    String email = emailTextField.getText();
    String marital = null;
    if (married.isSelected()) {
        marital = "married";
    } else if (unmarried.isSelected()) {
        marital = "unmarried";
    } else if (other.isSelected()) {
        marital = "other";
    }

    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pincode = pincodeTextField.getText();
    String phonenumber = phnumberTextField.getText();

    try {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Required");
        } else {
            Conn c = new Conn();
            String query = "INSERT INTO signupOne VALUES('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + state + "','" + pincode + "', '" + phonenumber + "')";
            int rowsInserted = c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Data inserted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert data.");
            }

            c.s.close(); // Close the statement.
            // Close the database connection.
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}

    
    public static void main(String args[]){
        new SignupOne();
    }
}

