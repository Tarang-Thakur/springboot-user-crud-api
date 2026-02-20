package com.example.demo.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UserRequest {

    @NotBlank(message = "Name must not be empty")
    private String name;

    @Min(value = 1, message = "Age must be greater than 0")
    @Max(value = 120, message = "Age must be less than or equal to 120")
    private int age;

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
