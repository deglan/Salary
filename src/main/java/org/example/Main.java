package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Company company = new Company();
        boolean endOfProgram = false;
        int choice;

        System.out.println(Messages.WELCOME.getMessage());

        while (!endOfProgram) {
            System.out.println(Messages.MENU.getMessage());
            System.out.println(Messages.SALARY_SUM.getMessage());
            System.out.println(Messages.EMPLOYEE_DATA.getMessage());
            System.out.println(Messages.ADD_EMPLOYEE.getMessage());
            System.out.println(Messages.END_PROGRAM.getMessage());
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            scanner.nextLine();
            switch (choice) {
                case 1:
                    BigDecimal totalSalary = company.calculateTotalSalary();
                    System.out.println(Messages.TOTAL_SALARY.getMessage() + totalSalary);
                    break;
                case 2:
                    company.displayAllEmployeeData();
                    break;
                case 3:
                    company.addEmployee(company, scanner);
                    break;
                case 4:
                    System.out.println(Messages.EXIT.getMessage());
                    endOfProgram = true;
                    break;
                default:
                    System.out.println(Messages.INVALID_OPTION.getMessage());
            }
        }

    }
}