import java.util.ArrayList;
class Patient extends Account {

    //Variables specific to patient class
    int identityNumber;
    MedicalRecord medicalRecords;
    String currentCity;
    String name;
    Date date;
    MedicalRecord dietPlan;

    Patient( String userName, String password, String mail, int identityNumber,
    String currentCity, String name){

        super(userName, password, mail);
        this.identityNumber = identityNumber;
        this.medicalRecords = medicalRecords;
        this.currentCity = currentCity;
        this.name = name;
        date = new Date();
        medicalRecords = null;
        dietPlan = null;
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

    protected String getName(){
        return name;
    }

    protected void generateDietaryProgram(MedicalRecord record){
        //to do
    }

    protected String displayDietaryPlan(){
        return diet.toString();
    }

    protected boolean getAppointment(int date, Doctor doctor){
        if (doctor.getAvailability(date) && getAvailabe(date)) {

            doctor.getSchedule().getDay(date).setAvailabilityFalse();
            doctor.setAppointment(date);
            this.date.getDay(date).setAvailabilityFalse();
            this.date.getDay(date).setNote(1);
            return true;
        }
        return false;
    }

    protected boolean getAvailabe(int i){

        return date.getDay(i).getAvailability();
    }
}
