package com.company.appstore.workitems;

import java.util.Date;

public class Project {
    public String name;
    public Date startingDate;
    public Date estimatedEndDate;
    public Date endDate;
    private boolean isCancelled;
    private boolean isActive;

    public Project(String name, Date startingDate, Date estimatedEndDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.estimatedEndDate = estimatedEndDate;
    }
}
