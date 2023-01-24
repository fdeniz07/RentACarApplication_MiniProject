package entities.concretes;

import entities.abstracts.Users;

public class Customers extends Users {

    private String tcNo;
    private int birthYear;

    public Customers() {
    }

    public Customers(String tcNo, int birthYear,String id,String firstName,String lastName) {
        this.tcNo = tcNo;
        this.birthYear = birthYear;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "tcNo='" + tcNo + '\'' +
                ", birthYear=" + birthYear;
    }
}
