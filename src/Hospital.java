
import java.util.*;

/**
 * Class which contains properties and methods for hospitals
 * @author Arda YILDIZ
 * @version 23.04.2021
*/
public class Hospital extends Account
{
    // Declare properties
    private String hospitalName;
    private String hospitalLocation;
    private ArrayList<Employee> doctors;
    private ArrayList<Employee> nurses;
    private ArrayList<Employee> secretaries;
    private ArrayList<Employee> otherEmployees;
    private ArrayList<String> hospitalRecords;
    private ArrayList<String> availableResources;
    private ArrayList<String> currentPatients;
    private ArrayList<String> laboratories;

    
    /**
     * Constructor which initializes the properties of Hospital class
     * @param hosptialName is a String type parameter which denotes the name of the hospital
     * @param hosptialNaLocation is a String type parameter which denotes the location of the hospital
    */
    public Hospital( String username, String password, String mail, String hospitalName, String hospitalLocation)
    {
        super(username, password, mail);
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        doctors = new ArrayList<Employee>();
        nurses = new ArrayList<Employee>();
        secretaries = new ArrayList<Employee>();
        otherEmployees = new ArrayList<Employee>();
        hospitalRecords = new ArrayList<String>();
        availableResources = new ArrayList<String>();
        currentPatients = new ArrayList<String>();
        laboratories = new ArrayList<String>();
    }
    
    /**
     * Method which makes an appointment with an available doctor at an available branch
    */
    public void makeAppointment()
    {   
    }
    
     /**
     * Method which saves an appointment with an available doctor at an available branch
    */
    public void saveAppointment()
    {   
    }   
    
    @Override
    public String toString()
    {
    	return hospitalName;
    }
    
}
