package com.employee.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.app.entity.Employee;
import com.employee.app.service.EmployeeService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;



@RequestMapping("/employee")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<Employee> create(@RequestBody final Employee employee) {
		return new ResponseEntity<>(employeeService.create(employee), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> update(@PathVariable final long id, @RequestBody final Employee employee) {
		return new ResponseEntity<>(employeeService.update(id, employee), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getById(@PathVariable final long id) {
		return new ResponseEntity<>(employeeService.fetchById(id), HttpStatus.OK);
	}

	@GetMapping(value = "/all",produces = {"application/json"})
	public ResponseEntity<List<Employee>> getAll(HttpServletResponse response) {
		response.addCookie(new Cookie("test-cookie","test-cookie"));
		return new ResponseEntity<>(employeeService.fetchAll(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removeById(@PathVariable final long id) {
		employeeService.removeById(id);
		return ResponseEntity.ok().build();
	}
}
