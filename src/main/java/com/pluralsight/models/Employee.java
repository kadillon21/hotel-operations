package com.pluralsight.models;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;
    private int endTime;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay(){
        return (getOvertimeHours() * (payRate * 1.5)) + (getRegularHours() * payRate);
    }

    public double getRegularHours() {
        if (this.hoursWorked > 40){
            return 40;
        }
        return this.hoursWorked;
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        return 0;
    }

    public void punchTimeCard(String type, int time) {
        if (type.equalsIgnoreCase("in")){
            this.startTime = time;
        } else if (type.equalsIgnoreCase("out")){
            this.endTime = time;
        }
    }
}
