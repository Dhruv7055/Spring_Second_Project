package com.example.secondProject.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String employeeName="Dhruv Agarwal";

    @Autowired
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee: "+employeeName+", Department: "+department.getDepartmentName();
    }
}
