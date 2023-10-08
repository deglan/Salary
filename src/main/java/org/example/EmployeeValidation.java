package org.example;

import java.math.BigDecimal;
import java.util.regex.*;

public class EmployeeValidation {

    public static boolean isValidNameAndSurname(String name) {
        String regex = "^[A-Za-z]\\w{3,29}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
    public static boolean isValidSalary(BigDecimal salary) {
        int comparisonResult = salary.compareTo(BigDecimal.ZERO);
        if (comparisonResult == 0) {
            return false;
        }
        return comparisonResult > 0;
    }
}
