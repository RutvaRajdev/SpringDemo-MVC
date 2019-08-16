package com.HandsOn.SpringDemo.MVC;

//import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

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
}
