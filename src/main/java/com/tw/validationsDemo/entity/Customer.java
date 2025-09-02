package com.tw.validationsDemo.entity;

import com.tw.validationsDemo.customAnnotations.CourseCode;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Customer {

    @NotNull(message = "valid first name is required")
//    @Size(min = 1, message = "valid first name is required")
    private String firstName;

    private String lastName;

    @NotNull
    @Min(value = 1, message = "must be greater than 0")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer freePasses = 0;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "length should 5 chars/digits")
    private String postCode;

    @CourseCode(value = "TEST", message = "Course should start with TEST")
    private String courseCode;

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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}
