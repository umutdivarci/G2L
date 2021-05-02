
import java.util.ArrayList;

class Doctor extends Account{

    // Properties
    final String name;
    final long identityNumber;
    ArrayList<String> patients;
    Date schedule;
    Hospital currentHospital;
    double salary;

    // Constructors
    Doctor ( String userName, String password, String mail, String name, long identityNumber,
     Hospital currentHospital)
    {
        super ( userName, password, mail);
        schedule = new Date();
        this.name = name;
        this.identityNumber = identityNumber;
        this.currentHospital = currentHospital;
        salary = 0.0;
        patients = new ArrayList<String>();
    }

    // Methods
    protected void setSalary ( double newSalary)
    {
        salary = newSalary;
    }

    protected void setCurrentHospital ( Hospital newHospital)
    {
        currentHospital = newHospital;
    }

    protected void setAppointment ( int i)
    {
        schedule.getDay(i).setAvailabilityFalse();
        schedule.getDay(i).setNote(0);
    }

    protected boolean getAvailability(int i){

        return schedule.getDay(i).getAvailability();
    }
    
    protected Date getSchedule(){

        return schedule;
    }

    protected long getIdentityNumber()
    {
        return identityNumber;
    }

    protected Date getDate(){

        return schedule;
    }

    protected ArrayList<String> getCurrentPatients()
    {
        return patients;
    }

    protected double getSalary()
    {
        return salary;
    }

    protected String getName()
    {
        return name;
    }

}
    
