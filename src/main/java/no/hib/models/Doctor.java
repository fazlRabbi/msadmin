package no.hib.models;

public class Doctor {
    private String ssn;
    private String uuid;
    private String firstName;
    private String lastName;
    private String specialization;

    public Doctor(String ssn, String firstName, String lastName, String specialization) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

    public Doctor(String ssn, String uuid, String firstName, String lastName, String specialization) {
        this.ssn = ssn;
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

    public Doctor() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
