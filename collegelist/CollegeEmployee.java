/**
 * this class extends the class person by adding more data variables like ssn, salary, and department, it also overrides the parent's class methods by adding the new variables
 */
package collegelist;

import javax.swing.JOptionPane;

/**
 *
 * @author Adam
 */
public class CollegeEmployee extends Person{
    //declare variables
    protected int ssn, salary;
    protected String department;
    
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
    }
    
    //print the data
    void displayData(){
        System.out.println("Name: " + firstName + " " + lastName + ", Street Address: " + streetAddress + ", Zipcode: " + zipcode + ", Phone number: " + phoneNumber
        + ", Social Security Number: " + ssn + ", Salary: $" + salary + ", Department: " + department);
    }
    
}
