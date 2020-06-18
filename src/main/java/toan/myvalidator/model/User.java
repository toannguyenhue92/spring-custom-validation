package toan.myvalidator.model;

import javax.validation.constraints.NotBlank;
import toan.myvalidator.validator.ContactNumberConstraint;

public class User {

    @NotBlank
    private String username;

    @ContactNumberConstraint
    private String contactNumber;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
