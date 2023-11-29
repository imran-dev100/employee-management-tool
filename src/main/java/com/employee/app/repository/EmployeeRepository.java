package com.employee.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.app.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

  //TODO: Add findByName

}
