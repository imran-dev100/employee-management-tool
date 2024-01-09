package com.employee.app.service;

import java.util.List;
import com.employee.app.entity.Employee;

public interface EmployeeService {

	public Employee create(final Employee employee);

	public Employee update(final long id,final  Employee employee);

	public Employee fetchById(final long id);

	public List<Employee> fetchAll();

	public void removeById(final long id);
}
