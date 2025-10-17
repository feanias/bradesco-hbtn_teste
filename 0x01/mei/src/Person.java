import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    private double tetoMEI = 130000.00;
    
    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }
    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }
    public boolean isPensioner() {
        return pensioner;
    }
    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }
    public boolean isPublicServer() {
        return publicServer;
    }
    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return this.salary = this.salary * 12;
    }
    
    public String fullName() {
        return this.name + " " + this.surname;
    }
    
    public int calculateAge() {
        Date currentDate = new Date();
        int age = currentDate.getYear() - this.birthDate.getYear();
        return age;
    }

    public Boolean isMEI(){
        if(((this.salary * 12) < tetoMEI) || this.anotherCompanyOwner || this.pensioner || this.publicServer || this.calculateAge() < 18){
            return false;
        } else {
            return true;
        }
    }


}
