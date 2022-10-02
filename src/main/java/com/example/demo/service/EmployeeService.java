package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.Map;

public interface EmployeeService {

    Map<String, Employee> printAllEmployee();

    void addEmployee(Employee employee);
    Employee removeEmployee(String lastName, String firstName, String middleName, String passport);
    public String findEmployee(String passport);


}
