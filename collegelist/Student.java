/*
 * this extends the person class and adds two data fields major and gpa, it also overrides persons two methods
 */
package collegelist;

import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class Student extends Person{
    
    //declare variables
    protected String major;
    protected float gpa;
    
    //store the data
    void setValues(){
        firstName = JOptionPane.showInputDialog(null, "Enter the person's First Name:");
        lastName = JOptionPane.showInputDialog(null, "Enter the person's Last Name:");
        streetAddress = JOptionPane.showInputDialog(null, "Enter the person's Street Address:");
        String tmp = JOptionPane.showInputDialog(null, "Enter the person's Zipcode:");
        zipcode = Integer.parseInt(tmp);
        tmp = JOptionPane.showInputDialog(null, "Enter the person's Phone Number:");
        phoneNumber = Integer.parseInt(tmp);
        major = JOptionPane.showInputDialog(null, "Enter the student's major field of study:");
        tmp = JOptionPane.showInputDialog(null, "Enter the student's GPA:");
        gpa = Float.parseFloat(tmp);
        
    }
    
    //display the data
    void displayData(){
        System.out.println("Name: " + firstName + " " + lastName + ", Street Address: " + streetAddress + ", Zipcode: " + zipcode + ", Phone number: " + phoneNumber
        + ", Major area of study: " + major + ", GPA: " + gpa);
    }
}
