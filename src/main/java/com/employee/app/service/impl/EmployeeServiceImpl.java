package com.employee.app.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.app.entity.Employee;
import com.employee.app.exception.EmployeeNotFoundException;
import com.employee.app.repository.EmployeeRepository;
import com.employee.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee create(final Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee update(final long id, final Employee employee) {
		final Employee savedEmployee = employeeRepository.findById(id).orElseThrow(EmployeeNotFoundException::new);
		savedEmployee.setAge(!Objects.equals(employee.getAge(), savedEmployee.getAge()) ? employee.getAge()
				: savedEmployee.getAge());
		savedEmployee.setName(!Objects.equals(employee.getName(), savedEmployee.getName()) ? employee.getName()
				: savedEmployee.getName());
		return employeeRepository.save(savedEmployee);
	}

	@Override
	public Employee fetchById(final long id) {
		return employeeRepository.findById(id).orElseThrow(EmployeeNotFoundException::new);
	}

	@Override
	public List<Employee> fetchAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void removeById(final long id) {
		employeeRepository.deleteById(id);
	}

}
