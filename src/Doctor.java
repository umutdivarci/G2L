
import java.util.ArrayList;

/**
* This is an account type that has specific properties for doctors.
* @author Umut Divarcı
* @date 23.04.2021  
*/

class Doctor extends Account{

    // Properties
    final String name;
    final long identityNumber;
    ArrayList<Patient> patients;
    ArrayList<Date> schedule;
    Hospital currentHospital;
    double salary;

    // Constructors
    Doctor ( String userName, String password, String mail, String name, long identityNumber, ArrayList<Patient> patients,
    ArrayList<Date> schedule, Hospital currentHospital, double salary)
    {
        super ( userName, password, mail);
        this.name = name;
        this.identityNumber = identityNumber;
        this.patients = patients;
        this.schedule = schedule;
        this.currentHospital = currentHospital;
        this.salary = salary;
    }

    // Methods
    
    /** 
     * Sets the salary to the given double. 
     * @param newSalary
     */

    protected void setSalary ( double newSalary)
    {
        salary = newSalary;
    }

    
    /** 
     * Updates the current hospital of the doctor.
     * @param newHospital
     */
    protected void setCurrentHospital ( Hospital newHospital)
    {
        currentHospital = newHospital;
    }

    
    /** 
     * Sets an appointment at the given date.
     * @param date
     */
    protected void setAppointment ( Date date)
    {
        date.available = false;
    }

    
    /** 
     * @return long
     */
    protected long getIdentityNumber()
    {
        return identityNumber;
    }

    
    /** 
     * @return ArrayList<Patient>
     */
    protected ArrayList<Patient> getCurrentPatients()
    {
        return patients;
    }

    
    /** 
     * @return double
     */
    protected double getSalary()
    {
        return salary;
    }

    
    /** 
     * @return String
     */
    protected String getName()
    {
        return name;
    }

}
    
