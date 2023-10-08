package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public BigDecimal calculateTotalSalary() {
        BigDecimal totalSalary = BigDecimal.valueOf(0);
        for (Employee employee : employees) {
            totalSalary = totalSalary.add(employee.getEmployeeSalary());
        }
        return totalSalary;
    }

    public void displayAllEmployeeData() {
        for (Employee employee : employees) {
            System.out.println(employee.getAllData());
        }
    }

    public void addEmployee(Company company, Scanner scanner) {
        System.out.println(Messages.EMPLOYEE_DETAILS.getMessage());
        System.out.println(Messages.EMPLOYEE_NAME.getMessage());
        String name = scanner.nextLine();
        if (!EmployeeValidation.isValidNameAndSurname(name)) {
            System.out.println(Messages.NAME_WRONG.getMessage());
            return;
        }

        System.out.println(Messages.EMPLOYEE_SURNAME.getMessage());
        String surname = scanner.nextLine();
        if (!EmployeeValidation.isValidNameAndSurname(surname)) {
            System.out.println(Messages.SURNAME_WRONG.getMessage());
            return;
        }

        System.out.println(Messages.EMPLOYEE_SALARY.getMessage());

        BigDecimal newSalary = BigDecimal.ZERO;
        try {
            newSalary = BigDecimal.valueOf(scanner.nextFloat());
        } catch (Exception e) {
            System.out.println(Messages.INVALID_INPUT.getMessage());
            scanner.close();
        }

        if (!EmployeeValidation.isValidSalary(newSalary)) {
            System.out.println(Messages.SALARY_WRONG.getMessage());
            return;
        }

        Employee employee = new Employee(name, surname, newSalary);
        company.addEmployee(employee);
        System.out.println(Messages.EMPLOYEE_ADDED.getMessage());
    }
}
