package com.company.appstore.People;

import com.company.appstore.workitems.Project;



import java.util.Date;
import java.util.LinkedList;


public class Developer extends Employee{
    public LinkedList<Project> projects;


    public Developer(String firstname, String lastname, String jobTitle, Date employmentDate, Double salary, Roles roles) {
        super(firstname, lastname, jobTitle, employmentDate, salary, roles);
    }

    public void assignProject(Project project) throws Exception{
        if(projects.contains(project)){
            throw new Exception("This developer is already working on this project");
        }
        projects.add(project);
        project.addHumanToProject(this.firstname + " " + this.lastname);
        System.out.println("Project " + project.name +" added successfully");
    }
}
