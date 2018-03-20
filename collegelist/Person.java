/**
 * This class stores data for a persons first name, last name, street address, zipcode, and phone number, and then it has two methods,
 * one method stores the data into the variables, and the other method prints the data that is stored
 */
package collegelist;
import javax.swing.JOptionPane;
/**
 *
 * @author Adam
 */
public class Person {
    //declare variables
    protected String firstName, lastName, streetAddress;
    protected int zipcode, phoneNumber;
    
    
    //store the data
    void setValues(){
        firstName = JOptionPane.showInputDialog(null, "Enter the person's First Name:");
        lastName = JOptionPane.showInputDialog(null, "Enter the person's Last Name:");
        streetAddress = JOptionPane.showInputDialog(null, "Enter the person's Street Address:");
        String tmp = JOptionPane.showInputDialog(null, "Enter the person's Zipcode:");
        zipcode = Integer.parseInt(tmp);
        tmp = JOptionPane.showInputDialog(null, "Enter the person's Phone Number:");
        phoneNumber = Integer.parseInt(tmp);
        
    }
    
    //display the data
    void displayData(){
        System.out.println("Name: " + firstName + " " + lastName + ", Street Address: " + streetAddress + ", Zipcode: " + zipcode + ", Phone number: " + phoneNumber);
    }
}
