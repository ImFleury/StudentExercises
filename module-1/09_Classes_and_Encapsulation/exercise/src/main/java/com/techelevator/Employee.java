package com.techelevator;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private double annualSalary;

    public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
        this.fullName = lastName + ", " + firstName;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }

    public String  getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void raiseSalary(double percent){
        this.annualSalary = this.annualSalary * (1 + percent/100);
    }
}
