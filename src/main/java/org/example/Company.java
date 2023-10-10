package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Company {
    private final List<Employee> employees = new ArrayList<>();
}
