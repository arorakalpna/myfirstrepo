package com.aexp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    String emp_name;
    String emp_dept;
    String emp_Salary;
    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_dept() {
        return emp_dept;
    }

    public String getEmp_Salary() {
        return emp_Salary;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public void setEmp_Salary(String emp_Salary) {
        this.emp_Salary = emp_Salary;
    }



}
