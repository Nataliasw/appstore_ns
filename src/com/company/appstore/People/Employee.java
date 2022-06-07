package com.company.appstore.People;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    static final int DEFAULT_DAYS_GRANTED = 6;
    static final int DEFAULT_HOLIDAYS_USED = 0;
    static final int DEFAULT_HOLIDAYS_TO_USE = 6;
    public String firstname;
    public String lastname;
    public String jobTitle;
    public Date employmentDate;
    public int holidayDaysGranted;
    public int holidayDaysUsed;
    public int holidayDaysToUse;
    private Double salary;

    public Employee(String firstname, String lastname, String jobTitle, Date employmentDate, Double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.jobTitle = jobTitle;
        this.employmentDate = employmentDate;
        this.holidayDaysGranted = DEFAULT_DAYS_GRANTED;
        this.holidayDaysUsed = DEFAULT_HOLIDAYS_USED;
        this.holidayDaysToUse = DEFAULT_HOLIDAYS_TO_USE;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employmentDate=" + employmentDate +
                ", holidayDaysGranted=" + holidayDaysGranted +
                ", holidayDaysUsed=" + holidayDaysUsed +
                ", holidayDaysToUse=" + holidayDaysToUse +
                ", salary=" + salary +
                '}';
    }

    public void getName(){
        System.out.println(this.firstname + " " + this.lastname);

    }

    public void setSalary(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Instert new Salary: ");
        this.salary  = Double.parseDouble(myObj.nextLine());
        System.out.println("New Salary has been set. The new salary of employee "+ this.firstname + " " + this.lastname
                            + " is " + this.salary);

    }

    public void grantHolidays(int holidays){
        if(holidays < 27){
            this.holidayDaysGranted = holidays;
            this.holidayDaysToUse = holidays;
        }
    }

    public void addHolidays(int days){
        if(days + holidayDaysGranted > 26){
            System.out.println("You cannot add more than 26 days off");
        }
        this.holidayDaysGranted += days;
        this.holidayDaysToUse += days;
    }

    public void useHolidays(int days) throws Exception{
        if(days > 26){
            throw new Exception("Incorrect number provided. You cannot take more than 26 days off.");
        }
        if(this.holidayDaysToUse - days < 0){
            throw new Exception("You don't have enough days to use");
        }
        this.holidayDaysToUse -= days;
        this.holidayDaysUsed = days;
        System.out.println("Holidays have been updated");

    }

    public void changeJobTitle(String newJobTitle, Roles roles){

        if(!roles.listOfJobTitles.contains(newJobTitle)){
            System.out.println("We don't have this job title in the Database.");
        }
    }




}
