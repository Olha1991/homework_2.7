package com.example.demo.model;

import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;
    private String middleName;
    private String passport;

    public Employee(String lastName, String firstName, String middleName, String passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.passport =passport;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() { return middleName; }
    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + this.lastName
                + " " + this.firstName
                + " " + this.middleName
                + " " + this.passport;
    }
    public  String getKey(){
        return this.passport;
    }

}