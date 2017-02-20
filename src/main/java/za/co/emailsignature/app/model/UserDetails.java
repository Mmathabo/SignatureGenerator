package za.co.emailsignature.app.model;

public class UserDetails {

    private String name;
    private String surname;
    private String role;
    private String addressLine1;
    private String surburb;
    private String cellNumber;
    private String officeNumber;
    private String companyLink;

    public UserDetails(String name, String surname, String role, String cellNumber) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.cellNumber = cellNumber;
        addressLine1 = "54 The Valley Road";
        surburb = "Johannesburg";
        companyLink  = "http://punk.digital";
        officeNumber = "+27 11 215 0000";

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getSurburb() {
        return surburb;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getCompanyLink() {
        return companyLink;
    }

    public String formatNameAndSurname(){
        return  name + " " + surname;
    }
}
