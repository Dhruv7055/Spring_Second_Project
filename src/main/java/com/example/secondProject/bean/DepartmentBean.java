package com.example.secondProject.bean;

import org.springframework.stereotype.Component;
@Component
public class DepartmentBean {
    private String departmentName="IT department";

    public String getDepartmentName() {
        return departmentName;
    }
}
