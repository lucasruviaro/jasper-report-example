package dev.lucas.jasperreportexample.repository;

import dev.lucas.jasperreportexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
