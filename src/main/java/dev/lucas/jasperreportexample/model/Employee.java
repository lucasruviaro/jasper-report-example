package dev.lucas.jasperreportexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "EMPLOYEE_TB")
@RequiredArgsConstructor
public class Employee {
    @Id
    private int id;
    private String name;
    private String designation;
    private double salary;
    private String doj;
}
