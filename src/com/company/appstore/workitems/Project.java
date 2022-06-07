package com.company.appstore.workitems;

import java.util.Date;
import java.util.LinkedList;

public class Project {
    public String name;
    public Date startingDate;
    public Date estimatedEndDate;
    public Date endDate;
    private boolean isCancelled;
    private boolean isActive;
    public LinkedList<String> programmingStack;
    public LinkedList<String> peopleInvolvedInProject;
    public String projectOwner_Company;

    public Project(String name, Date startingDate, Date estimatedEndDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.estimatedEndDate = estimatedEndDate;
        this.programmingStack = new LinkedList<String>();
        this.peopleInvolvedInProject = new LinkedList<String>();

    }

    public void addProgrammingLanguages(LinkedList<String> programmingLanguages) {
        for (String lang : programmingLanguages) {
            if (!programmingStack.contains(lang)) {
                programmingStack.add(lang);
            }
        }
        System.out.println("Programming languages added to the project");
    }

    public void cancelProject(){
        isCancelled = true;
        isActive = false;

    }
    public void deactivateProject(){
        isActive = false;
    }

    public boolean checkIfActive(){
        return isActive;
    }
    public boolean checkIfCancelled(){
        return isCancelled;
    }
    public Date updateEndDate(Date end){
        this.endDate = end;
        return this.endDate;
    }

    public Date updateEstimatedEndDate(Date estimatedEnd){
        this.estimatedEndDate = estimatedEnd;
        return this.estimatedEndDate;
    }

    public void addHumanToProject(String human){
        if(!peopleInvolvedInProject.contains(human)){
            peopleInvolvedInProject.add(human);
        }
        System.out.println("Human " + human +  " added to the project " + this.name);
    }
}
