package dev.lucas.jasperreportexample.service;

import dev.lucas.jasperreportexample.model.Employee;
import dev.lucas.jasperreportexample.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
       return employeeRepository.findAll();
    }
}
