

import java.util.ArrayList;

public class Pharmacy extends Account {

    // Properties
    final String name;
    String city;
    ArrayList<Employee> employees;
    ArrayList<Medicine> medicalStock;

    // Constructors
    Pharmacy ( String userName, String password, String mail, String name, String city, ArrayList<Employee> employees,
    ArrayList<Medicine> medicalStock) 
    {
        super ( userName, password, mail);
        this.name = name;
        this.city = city;
        this.employees = employees;
        this.medicalStock = medicalStock;
    }

    // Methods

    protected String getName()
    {
        return name;
    }
    
    protected String getCity()
    {
        return city;
    }

    protected ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    protected ArrayList<Medicine> getMedicalStock()
    {
        return medicalStock;
    }

    protected void addEmployee ( Employee newEmployee)
    {
        employees.add( newEmployee);
    }

    protected void removeEmployee ( Employee currentEmployee)
    {
        employees.remove( currentEmployee);
    }

    protected void addMedicine ( Medicine newMedicine)
    {
        medicalStock.add( newMedicine);
    }

    protected void removeMedicine ( Medicine currentMedicine)
    {
        medicalStock.remove( currentMedicine);
    }
}
