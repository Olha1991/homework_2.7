package com.example.demo.employeeController;

import com.example.demo.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.EmployeeService;

import java.util.Map;

@RequiredArgsConstructor
@RequestMapping("/employee")
@RestController
public class EmployeeController {

    public final EmployeeService employeeService;

    @GetMapping(path = "/all")
    public Map<String, Employee> allEmployee(){
        return employeeService.printAllEmployee();
    }
    @GetMapping(path = "/add")
    public String addEmployee (@RequestParam("lastName") String lastName,
                             @RequestParam("firstName") String firstName,
                             @RequestParam("middleName") String middleName,
                             @RequestParam("passport") String passport) {
        Employee employee = new Employee(
                lastName,
                firstName,
                middleName,
                passport
        );
        employeeService.addEmployee(employee);
        return "Employee added";
    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("lastName") String lastName,
                                   @RequestParam("firstName") String firstName,
                                   @RequestParam("middleName") String middleName,
                                   @RequestParam("passport") String passport){
        return employeeService.removeEmployee(lastName, firstName, middleName, passport);
    }

    @GetMapping(path = "/find")
    public String findEmployee(@RequestParam(name = "passport", required = false) String passport){
        return employeeService.findEmployee(passport);
    }
}

