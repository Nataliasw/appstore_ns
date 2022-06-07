package com.company.appstore.People;

import com.company.appstore.workitems.Project;

import java.util.LinkedList;

public class Customer {
    public String companyName;
    public String contactPerson;
    private final LinkedList<Project> listOfProjects;
    private LinkedList<Project> cancelledProjects;
    private LinkedList<Project> ongoingProjects;


    public Customer(String companyName, String contactPerson) {
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.listOfProjects = new LinkedList<Project>();
    }
    public LinkedList<Project> getListOfProjects(){
        return this.listOfProjects;
    }
    public LinkedList<Project> getListOfOngoingProjects(){
        return this.ongoingProjects;
    }
    public LinkedList<Project> getListOfCancelledProjects(){
        return this.cancelledProjects;
    }

    public void addOngoingProject(Project project){
        if(!listOfProjects.contains(project) && !ongoingProjects.contains(project)){
            listOfProjects.add(project);
            project.projectOwner_Company = companyName;
            System.out.println("Project " + project.name + " added to the customer " + this.companyName + " successfully.");
        }

    }
    public void cancelProject(Project project){
        if(!cancelledProjects.contains(project)) {
            cancelledProjects.add(project);
            ongoingProjects.remove(project);
            project.cancelProject();
            System.out.println("Project is now cancelled.");
        }

    }
}
