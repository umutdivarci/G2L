
import java.util.ArrayList;

class Patient extends Account {

    //Variables specific to patient class
    int identityNumber;
    MedicalRecord medicalRecords;
    String currentCity;
    String name;
    String surname;
    ArrayList <Date> calendar;

    Patient( String userName, String password, String mail, int identityNumber,  MedicalRecord medicalRecords,
    String currentCity, String name, String surname, ArrayList <Date> calendar){

        super(userName, password, mail);
        this.identityNumber = identityNumber;
        this.medicalRecords = medicalRecords;
        this.currentCity = currentCity;
        this.name = name;
        this.surname = surname;
        this.calendar = calendar;

    }

    protected void setName(String newName){
        name = newName;
    }

    protected void setMedicalRecord(MedicalRecord newMedicalRecord){
        medicalRecords = newMedicalRecord;
    }

    protected Integer getIdentityNo(){
        return identityNumber;
    }

    protected MedicalRecord getMedicalRecord(){
        return medicalRecords;
    } 

    protected void setCurrentCity(String newCity){
        currentCity = newCity;
    }

}
