package com.tw.validationsDemo.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull(message="first name cannot be null")
    @Size(min=1, message="first name cannot be single character")
    private String firstName;

    private String lastName;
}
