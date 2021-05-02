
import java.util.ArrayList;
import java.util.Date;

/**
 * Implementing the medical record class for patients
 * 
 * @author Faaiz Khan
 * @version 23/04/2021
 */
public class MedicalRecord {

    //instance variables
    int age;
    double weight;
    double height;
    Day dateOfBirth;
    ArrayList<String> currentMedicines;
    ArrayList<String> medicalConditions;
    ArrayList<Date> scheduledAppointments;
    
    //constructor
    public MedicalRecord (int currentAge, double currentWeight, double currentHeight, Day currentDateOfBirth) {
        age = currentAge;
        weight = currentWeight;
        height = currentHeight;
        dateOfBirth = currentDateOfBirth;
        currentMedicines = new ArrayList<String>();
        medicalConditions = new ArrayList<String>();
        scheduledAppointments = new ArrayList<Date>();
    }

    //methods

    /**
     * This method sets the age of the patient
     */
    public void setAge (int newAge) {
        age = newAge;
    }

    /**
     * This method sets the weight of the patient
     */
    public void setWeight (double newWeight) {
        weight = newWeight;
    }

    /**
     * This method sets the height of the patient
     */
    public void setHeight (double newHeight) {
        height = newHeight;
    }

    /**
     * This method sets the date of birth of the patient
     */
    public void setDateOfBirth (Day newDateOfBirth) {
        dateOfBirth = newDateOfBirth;
    }

    /**
     * This method adds a medicine to the list of current medicines
     */
    public void addMedicine (String newMedicine) {
        currentMedicines.add(newMedicine);
    }

    /**
     * This method adds a medical condition to the list of medical conditions
     */
    public void addCondition (String newCondition) {
        medicalConditions.add(newCondition);
    }

    /**
     * This method adds an appointment to the list of scheduled appointments
     */
    public void addappointment (Date newAppointment) {
        scheduledAppointments.add(newAppointment);
    }

    /**
     * This method removes a certain medicine from the list of current medicines
     */
    public void removeMedicine (int index) {
        currentMedicines.remove(index);
    }

    /**
     * This method removes a certain medical condition from the list of medical conditions
     */
    public void removeCondition (int index) {
        medicalConditions.remove(index);
    }

    /**
     * This method removes a certain appointment from the list of scheduled appointments
     */
    public void removeAppointment (int index) {
        scheduledAppointments.remove(index);
    }
}
