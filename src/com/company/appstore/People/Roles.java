package com.company.appstore.People;

import java.util.LinkedList;


public class Roles {
    public LinkedList<String> listOfJobTitles;

    public Roles(LinkedList<String> listOfJobTitles) {
        this.listOfJobTitles = listOfJobTitles;
    }

    public boolean checkIfHasJobTitle(String jobTitle){
        return listOfJobTitles.contains(jobTitle);
    }

}
