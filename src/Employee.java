
import java.util.*;

/**
 * Class which contains properties and methods for employees
 * @author Arda YILDIZ
 * @version 23.04.2021
*/
public class Employee 
{
    // Declare properties
    private String name;
    private String profession;
    private String education;
    private String salary;
    private String relevantInformation;
    private int age;
    private ArrayList<String> currentPatients;
    
    /**
     * Constructor which initializes the properties of Employee class
     * @param name is a String type parameter which denotes the name of the employee
     * @param profession is a String type parameter which denotes the profession of the employee
     * @param education is a String type parameter which denotes the institute of the employee which he/she took education
     * @param age is an int type parameter which denotes the age of the employee
    */
    public Employee( String name, String profession, String education, int age)
    {
        this.name = name;
        this.profession = profession;
        this.education = education;
        this.age = age;
    }
    
    /**
     * Method which shows the current patients of an employee
     * @param employee is an Employee type parameter which denotes the target employee to take his/her current patients list
     * @return employee.currentPatients int the ArrayList<String> type  
    */
    public ArrayList<String> viewCurrentPatients( Employee employee) 
    {
        return employee.currentPatients;
    }

    /**
     * Method which updates the information of an employee
     * @param employee is an Employee type parameter which denotes the target employee to update his/her information
    */
    public void updateInformation( Employee employee)
    {
    }
}
