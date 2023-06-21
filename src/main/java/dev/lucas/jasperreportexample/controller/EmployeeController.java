package dev.lucas.jasperreportexample.controller;

import dev.lucas.jasperreportexample.model.Employee;
import dev.lucas.jasperreportexample.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public ResponseEntity<List<Employee>> findAll(){
        List<Employee> employees = employeeService.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/report/{format}")
    public ResponseEntity<String> generateReport(@PathVariable String format) throws JRException, FileNotFoundException {
       String report = employeeService.exportReport(format);
       return new ResponseEntity<>(report, HttpStatus.OK);
    }
}
