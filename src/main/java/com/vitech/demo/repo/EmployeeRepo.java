package com.vitech.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitech.demo.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
