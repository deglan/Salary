package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
public class Employee {

    private String name;
    private String surname;
    private BigDecimal employeeSalary;

    public String getAllData() {
        return "Salary for " + name + " " + surname + " is " + employeeSalary;
    }
}
