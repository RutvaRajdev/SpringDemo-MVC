package com.HandsOn.SpringDemo.MVC;

//import com.sun.istack.internal.NotNull;

import javax.validation.constraints.*;

public class Customer {

    @Pattern(regexp = "[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String zipCode;

    @NotNull(message = "Is required")
    @Size(min=1, message="Is required")
    private String firstName;

    private String lastName;

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    @Min(value = 0, message = "Must be greater or equal to 0")
    @Max(value=10, message = "Maximum 10 allowed")
    private int passes;

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
