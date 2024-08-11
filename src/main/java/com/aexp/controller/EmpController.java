package com.aexp.controller;

import com.aexp.entity.Employee;
import com.aexp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpController {

        @Autowired
        public EmployeeRepo employeeRepo;

        @GetMapping("/all")
        public List<Employee> findAllEmployees() {
            // Implement
            List<Employee> emp = new ArrayList<>();
            employeeRepo.findAll().forEach(emp::add);
            return emp;
        }

    @GetMapping("/{sal_value}")
    public Employee findHighestPaidEmployees(int sal_value) {
        // Implement
        //List<Employee> emp = new ArrayList<>();
        return employeeRepo.findHighestPaidEmployees( sal_value);
        //return emp;

    }


    }

