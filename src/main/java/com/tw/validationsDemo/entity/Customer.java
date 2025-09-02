package com.tw.validationsDemo.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Customer {

    @NotNull(message = "valid first name is required")
//    @Size(min = 1, message = "valid first name is required")
    private String firstName;

    private String lastName;

    @Min(value = 1, message = "must be greater than 0")
    @Max(value = 10, message = "must be less than or equal to 10")
    private int freePasses;

    public Customer() {

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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }
}
