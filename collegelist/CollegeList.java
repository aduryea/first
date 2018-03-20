/**
 * This program uses the person class and its subclasses CollegeEmployee and its subclass Faculty, and another class student which is a subclass of person
 * we first create arrays for the classes CollegeEmployee, Faculty, and student, next we run a loop to ask the user which type of object they would like to
 * store data in, and then we go to that data type object, if the user tries to enter an additional object when the array is already full we inform him of the error,
 * if the user decides to quit he can enter in Q, we then proceed to displaying the data objects, if an array is empty we inform the user that no information was entered
 * for that data object array
 */
package collegelist;
import javax.swing.JOptionPane;
/**
 *
 * @author Adam
 */
public class CollegeList {

    
    public static void main(String[] args) {
        //declare variables
        CollegeEmployee [] myemployees = new CollegeEmployee[4];
        Faculty [] myfacultys = new Faculty[3];
        Student [] mystudents = new Student[7];
        //these are the counters for each array of classes
        int c = 0, f = 0, s = 0;
        
        //letter is used to decide what kind of data the user wants to enter, if its Q then they quit
        char letter;
        while(true){
            //get the users answer to decide which type of object to use
            String tmp2 = JOptionPane.showInputDialog(null, "Which type of person would you like to insert in next? (C = CollegeEmployee, F = Faculty, S = Student, Q = quit)");
            String tmp = tmp2.toUpperCase();
            letter = tmp.charAt(0);

            //if the user enters Q they quit and exit the loop
            if(letter == 'Q')
                break;
            
            //if one of the counters is bigger than the array size then display an error
            if(c > 3 || f > 2 || s > 6)
                JOptionPane.showMessageDialog(null, "Error, maximum number of college employees is 4, faculty is 3, and students is 7");
            else{
                //otherwise go the approiate data object
            switch(letter){
                case 'C':
                    CollegeEmployee obj = new CollegeEmployee();
                    obj.setValues();
                    myemployees[c] = obj;
                    ++c;
                    break;
                case 'F':
                    Faculty teacher = new Faculty();
                    teacher.setValues();
                    myfacultys[f] = teacher;
                    ++f;
                    break;
                case 'S':
                    Student stu = new Student();
                    stu.setValues();
                    mystudents[s] = stu;
                    ++s;
                    break;
            }
            }
        }
        //print the college employees data
        System.out.println("Printing data for College Employees:");
        if(c == 0)
            System.out.println("No College Employees have been entered");
        for(int i = 0; i < c; ++i)
            myemployees[i].displayData();
        
        //print the faculty data
        System.out.println("Printing data for Faculty:");
        if(f == 0)
            System.out.println("No Faculty was entered");
        for(int i = 0; i < f; ++i)
            myfacultys[i].displayData();
        
        //print the student data
        System.out.println("Printing data for Students:");
        if(s == 0)
            System.out.println("No students were entered");
        for(int i = 0; i < s; ++i)
            mystudents[i].displayData();
        
}
    
}
