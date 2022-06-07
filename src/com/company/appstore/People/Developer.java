package com.company.appstore.People;

import com.company.appstore.workitems.Project;


import java.util.Date;
import java.util.LinkedList;


public class Developer extends Employee{
    public LinkedList<Project> projects;


    public Developer(String firstname, String lastname, String jobTitle, Date employmentDate, Double salary) {
        super(firstname, lastname, jobTitle, employmentDate, salary);
    }
}
