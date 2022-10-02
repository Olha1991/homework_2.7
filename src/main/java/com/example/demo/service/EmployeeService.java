package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    public  Map<String, Employee> printAllEmployee();

    public void addEmployee(Employee employee);
    Employee removeEmployee(String lastName, String firstName, String middleName, String passport);
    public String findEmployee(String passport);


}
