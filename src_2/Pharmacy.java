

import java.util.ArrayList;

/**
* This is an account type that contains related pharmacy data.
* @author Umut Divarcı
* @date 23.04.2021  
*/

public class Pharmacy extends Account {

    // Properties
    final String name;
    String city;
    ArrayList<Employee> employees;
    ArrayList<Medicine> medicalStock;

    // Constructors
    Pharmacy ( String userName, String password, String mail, String name, String city) 
    {
        super ( userName, password, mail);
        this.name = name;
        this.city = city;
        this.employees = new ArrayList<Employee>();
        this.medicalStock = new ArrayList<Medicine>();
    }

    // Methods

    /** 
     * @return String
     */

    protected String getName()
    {
        return name;
    }
    
    
    /** 
     * @return String
     */
    protected String getCity()
    {
        return city;
    }

    
    /** 
     * @return ArrayList<Employee>
     */
    protected ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    
    /** 
     * @return ArrayList<Medicine>
     */
    protected ArrayList<Medicine> getMedicalStock()
    {
        return medicalStock;
    }

    
    /** 
     * Adds a new employee to the pharmacy.
     * @param newEmployee
     */
    protected void addEmployee ( Employee newEmployee)
    {
        employees.add( newEmployee);
    }

    
    /** 
     * Removes an employee from pharmacy.
     * @param currentEmployee
     */
    protected void removeEmployee ( Employee currentEmployee)
    {
        employees.remove( currentEmployee);
    }

    
    /** 
     * Adds a new medicine type to the medical stocks.
     * @param newMedicine
     */
    protected void addMedicine ( Medicine newMedicine)
    {
        medicalStock.add( newMedicine);
    }

    
    /** 
     * Removes a medicine type from stocks.
     * @param currentMedicine
     */
    protected void removeMedicine ( Medicine currentMedicine)
    {
        medicalStock.remove( currentMedicine);
    }
}
