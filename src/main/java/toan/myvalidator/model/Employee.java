package toan.myvalidator.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import toan.myvalidator.validator.ContactNumberConstraint;
import toan.myvalidator.validator.NameConstraint;

public class Employee {

    @NameConstraint
    private String firstName;

    @NameConstraint
    private String lastName;

    @ContactNumberConstraint
    private String contactNumber;

    @Min(18)
    private int age;

    @NotBlank
    @Email
    private String email;

    public Employee() {
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
