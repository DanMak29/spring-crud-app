package com.example.demo_project_spring_crud.repository;

import com.example.demo_project_spring_crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
