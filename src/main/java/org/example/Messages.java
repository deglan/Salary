package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Messages {

    WELCOME("Welcome in Payroll"),
    MENU("Menu"),
    SALARY_SUM("1 – Print sum of all employees salary"),
    EMPLOYEE_DATA("2 – Display all employees data"),
    ADD_EMPLOYEE("3 – Add new employee"),
    END_PROGRAM("4 – End program"),
    SALARY_WRONG("Please check if you putted correct employee salary"),
    NAME_WRONG("Please check if you putted correct employee name"),
    SURNAME_WRONG("Please check if you putted correct employee surname"),
    TOTAL_SALARY("Total salary of all employees: "),
    EMPLOYEE_DETAILS("Enter employee details:"),
    EMPLOYEE_NAME("First name: "),
    EMPLOYEE_SURNAME("Last name: "),
    EMPLOYEE_SALARY("Salary: "),
    EMPLOYEE_ADDED("Employee added successfully."),
    EXIT("Exiting program."),
    INVALID_OPTION("Invalid menu option. Please enter a valid choice."),
    INVALID_INPUT("Invalid input. Please enter a valid input");

    private final String message;
}
