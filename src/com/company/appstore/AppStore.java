package com.company.appstore;

import com.company.appstore.People.Developer;
import com.company.appstore.People.Employee;
import com.company.appstore.People.Roles;
import com.company.appstore.workitems.Project;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AppStore {
    public static void main(String[] args) {
        LinkedList<String> jobs = new LinkedList<>();
        jobs.add("Junior Java Developer");
        jobs.add("Junior React Developer");
        jobs.add("Java Developer");
        jobs.add("Senior Java Developer");
        jobs.add("React Developer");
        jobs.add("DevOps");
        jobs.add("TA Specialist");
        jobs.add("CEO");
        jobs.add("CFO");
        Roles listOfJobTitles = new Roles(jobs);
            Employee marta = new Employee("Marta","Nowak","Junior React Developer", new Date(),6000.0, listOfJobTitles);
//Set new salary
            //marta.setSalary();
            //System.out.println(marta.salary);

        Developer marek = new Developer("Marek","Markowski","Junior Java Developer",new Date(), 7000.0, listOfJobTitles);
        Project calendar= new Project("Calendar",new Date(), new Date());

    }

}
