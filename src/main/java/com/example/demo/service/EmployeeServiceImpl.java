package com.example.demo.service;

import com.example.demo.exceptions.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<String, Employee>  employees = new HashMap<>(Map.of(
            "012", new Employee ("Ivanov","Ivan", "Ivanovich", "012"),
            "123", new Employee("Petrovova","Mariya", "Petrovna", "123"),
            "234", new Employee("Romanuk","Yan", "Igorevich", "234"),
            "345", new Employee("Tarasov","Egor", "Tarasovich", "345"),
            "456", new Employee("Shevchenko","Olga", "Ivanovna", "456"),
            "567", new Employee("Pechkin","Roman", "Aleksandrovich", "567"),
            "678", new Employee("Belkina","Vera", "Petrovna", "678"),
            "789", new Employee("Matvienko","Larisa", "Zaharovna", "789"),
            "890", new Employee("Prokopenko","Yana", "Sidorovna", "890"),
            "901", new Employee("Bashmakov","Igor", "Fedorovich", "901")
    ));



    @Override
    public  Map<String, Employee> printAllEmployee() {
        return employees;
    }
    @Override
     public void addEmployee(Employee employee){
        employees.put(employee.getKey(), employee);
        }


        @Override
    public Employee removeEmployee(String lastName, String firstName, String middleName, String passport) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getLastName().equals(lastName)
                    && employees.get(i).getFirstName().equals(firstName)
                    && employees.get(i).getMiddleName().equals(middleName)
                    && employees.get(i).getPassport().equals(passport)) {
                return employees.remove(i);
            }
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public String findEmployee(String passport) {
        final Employee employee = employees.get(passport);
        if(employee == null){
            throw new EmployeeNotFoundException("Employee not found");
        }
        final String employeeDescription = ""
                + employee.getLastName() + " "
                + employee.getFirstName() + " "
                + employee.getMiddleName() + " "
                + employee.getPassport();
        return employeeDescription;
    }


}

