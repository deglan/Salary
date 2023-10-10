package org.example;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeValidation {

    private static final String REGEX = "^[A-Za-z]\\w{3,29}$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public static boolean isInvalidNameOrSurname(String name) {
        if (name == null) {
            return true;
        }
        Matcher m = PATTERN.matcher(name);
        return !m.matches();
    }

    public static boolean isInvalidSalary(BigDecimal salary) {
        int comparisonResult = salary.compareTo(BigDecimal.ZERO);
        return comparisonResult <= 0;
    }
}
