package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        CompanyService companyService = new CompanyService();
        boolean endOfProgram = false;
        int choice;

        System.out.println(Messages.WELCOME.getMessage());

        do {
            printMenu();
            choice = readChoice(scanner.nextLine());
            switch (choice) {
                case 1:
                    BigDecimal totalSalary = companyService.calculateTotalSalary(company);
                    System.out.println(Messages.TOTAL_SALARY.getMessage() + totalSalary);
                    break;
                case 2:
                    companyService.displayAllEmployeeData(company);
                    break;
                case 3:
                    companyService.addEmployee(company);
                    break;
                case 4:
                    System.out.println(Messages.EXIT.getMessage());
                    endOfProgram = true;
                    break;
                default:
                    System.out.println(Messages.INVALID_OPTION.getMessage());
            }
        } while (!endOfProgram);

    }

    private static void printMenu() {
        System.out.println(Messages.MENU.getMessage());
        System.out.println(Messages.SALARY_SUM.getMessage());
        System.out.println(Messages.EMPLOYEE_DATA.getMessage());
        System.out.println(Messages.ADD_EMPLOYEE.getMessage());
        System.out.println(Messages.END_PROGRAM.getMessage());
    }

    private static int readChoice(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}