import java.util.*;

/**
 * Class which contains properties and methods for hospitals
 * @author Arda YILDIZ
 * @version 23.04.2021
*/
public class Hospital
{
    // Declare properties
    private String hospitalName;
    private String hospitalLocation;
    private ArrayList<String> doctors;
    private ArrayList<String> nurses;
    private ArrayList<String> secretaries;
    private ArrayList<String> otherEmployees;
    private ArrayList<String> hospitalRecords;
    private ArrayList<String> availableResources;
    private ArrayList<String> currentPatients;
    private String[] labratories;

    
    /**
     * Constructor which initializes the properties of Hospital class
     * @param hosptialName is a String type parameter which denotes the name of the hospital
     * @param hosptialNaLocation is a String type parameter which denotes the location of the hospital
    */
    public Hospital( String hospitalName, String hospitalLocation)
    {
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
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
}