package com.learn.inheritence;

import java.util.List;

public class Bank {

    private String name;
    private List<Employee> employeeList;

    public Bank(String name, List<Employee> employees) {
        this.name = name;
        this.employeeList = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
