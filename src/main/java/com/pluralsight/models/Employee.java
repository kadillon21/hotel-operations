package com.pluralsight.models;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void punchTimeCard(String type) {
        if (type.equalsIgnoreCase("in")){
            this.startTime = LocalDateTime.now();
        } else if (type.equalsIgnoreCase("out")){
            this.endTime = LocalDateTime.now();
        }
    }

    public void punchTimeCard(String type, int time) {
        if (type.equalsIgnoreCase("in")){
            this.startTime = this.startTime.withHour(time);
        } else if (type.equalsIgnoreCase("out")){
            this.endTime = this.startTime.withHour(time);
        }
    }
}
