package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class CompanyService {

    public BigDecimal calculateTotalSalary(Company company) {
        return company.getEmployees().stream()
                .map(Employee::getEmployeeSalary)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void displayAllEmployeeData(Company company) {
        company.getEmployees().stream()
                .map(Employee::getAllData)
                .forEach(System.out::println);
    }

    public void addEmployee(Company company) {
        System.out.println(Messages.EMPLOYEE_DETAILS.getMessage());
        System.out.println(Messages.EMPLOYEE_NAME.getMessage());
        String name = readText();
        System.out.println(Messages.EMPLOYEE_SURNAME.getMessage());
        String surname = readText();
        System.out.println(Messages.EMPLOYEE_SALARY.getMessage());
        BigDecimal newSalary = readSalary();
        Employee employee = new Employee(name, surname, newSalary);
        company.getEmployees().add(employee);
        System.out.println(Messages.EMPLOYEE_ADDED.getMessage());
    }

    private String readText() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (EmployeeValidation.isInvalidNameOrSurname(text)) {
            System.out.println(Messages.TEXT_WRONG.getMessage());
            return readText();
        }
        return text;
    }

    private BigDecimal readSalary() {
        Scanner scanner = new Scanner(System.in);
        try {
            BigDecimal newSalary = new BigDecimal(scanner.nextLine());
            if (EmployeeValidation.isInvalidSalary(newSalary)) {
                System.out.println(Messages.SALARY_WRONG.getMessage());
                return readSalary();
            }
            return newSalary;
        } catch (NumberFormatException e) {
            System.out.println(Messages.SALARY_WRONG.getMessage());
            return readSalary();
        }
    }
}
