package entities.concretes;

import entities.abstracts.Users;

import java.time.LocalDate;

public class Customers extends Users {

    private String tcNo;
    private LocalDate birthDate;
    private LocalDate driverLicenceDate;

    public Customers() {
    }

    public Customers(String tcNo,  String id, String firstName, String lastName,LocalDate birthDate,LocalDate driverLicenceDate) {
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.driverLicenceDate=driverLicenceDate;
        super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDriverLicenceDate() {
        return driverLicenceDate;
    }

    public void setDriverLicenceDate(LocalDate driverLicenceDate) {
        this.driverLicenceDate = driverLicenceDate;
    }

    @Override
    public String toString() {
        return  "ID: "+getId() +
                ", Name: " + getFirstName() +
                ", Surname: " + getLastName() +
                ", BirthDate: "+ getBirthDate() +
                ", DriverLicenceDate: "+ getDriverLicenceDate() +
                ", T.C NO: "+getTcNo();
    }
}