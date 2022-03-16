package fr.merckel.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.merckel.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}
