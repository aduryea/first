/**
 * This class extends the parent class CollegeEmployee by adding another data variable called tenured, it also overrides the parent
 * classes methods so that it can include the new variable
 */
package collegelist;

import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class Faculty extends CollegeEmployee{
    //declare variables
    protected boolean tenured;
    
    //store the data
    void setValues(){
        firstName = JOptionPane.showInputDialog(null, "Enter the person's First Name:");
        lastName = JOptionPane.showInputDialog(null, "Enter the person's Last Name:");
        streetAddress = JOptionPane.showInputDialog(null, "Enter the person's Street Address:");
        String tmp = JOptionPane.showInputDialog(null, "Enter the person's Zipcode:");
        zipcode = Integer.parseInt(tmp);
        tmp = JOptionPane.showInputDialog(null, "Enter the person's Phone Number:");
        phoneNumber = Integer.parseInt(tmp);
        tmp = JOptionPane.showInputDialog(null, "Enter the employee's Social Security Number:");
        ssn = Integer.parseInt(tmp);
        tmp = JOptionPane.showInputDialog(null, "Enter the employee's Salary: $");
        salary = Integer.parseInt(tmp);
        department = JOptionPane.showInputDialog(null, "Enter the employee's Department:");
        int num = JOptionPane.showConfirmDialog(null, "Is the Faculty member tenured?", "please select", JOptionPane.YES_NO_OPTION);
        if(num == JOptionPane.YES_OPTION)
            tenured = true;
        else
            tenured = false;
    }
    
    //print out the data
    void displayData(){
        System.out.println("Name: " + firstName + " " + lastName + ", Street Address: " + streetAddress + ", Zipcode: " + zipcode + ", Phone number: " + phoneNumber
        + ", Social Security Number: " + ssn + ", Salary: $" + salary + ", Department: " + department + ", Tenured: " + tenured);
    }
}
