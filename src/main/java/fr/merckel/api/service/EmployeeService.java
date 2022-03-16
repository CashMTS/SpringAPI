package fr.merckel.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.merckel.api.model.Employee;
import fr.merckel.api.repository.EmployeeRepository;

public class EmployeeService {

	@Autowired
	private EmployeeRepository er;

	public Optional<Employee> getEmployee(final Long id) {
		return er.findById(id);
	}

	public Iterable<Employee> getEmployees() {
		return er.findAll();
	}

	public void deleteEmployee(final Long id) {
		er.deleteById(id);
	}

	public Employee saveEmployee(Employee e) {
		Employee savedEmployee = er.save(e);
		return savedEmployee;
	}

}
