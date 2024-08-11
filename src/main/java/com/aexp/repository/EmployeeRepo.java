package com.aexp.repository;

import com.aexp.entity.Employee;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



    @Repository
    //public interface EmployeeRepo extends CrudRepository<Employee, Long> {

    public interface EmployeeRepo extends JpaRepository<Employee, Long> {

        //this is custom query using JPA in Spring boot
        @Query(value = "SELECT * FROM employee WHERE emp_salary = ?1", nativeQuery = true)
        Employee findHighestPaidEmployees(int salary);
    }

