package co.simplon.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
