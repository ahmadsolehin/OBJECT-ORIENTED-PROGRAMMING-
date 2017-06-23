/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ump.salary.syetem;

/**
 *
 * @author FSK4
 */
public class Employee {
    private String staffID;
    private String staffName;
    private String Department;
    private String bankAccNo;
    private String salaryCreditDate;
    private double tax;
    private String status;
    private String grade;

    public Employee(String staffID, String staffName, String Department, String bankAccNo, String salaryCreditDate, double tax, String status, String grade) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.Department = Department;
        this.bankAccNo = bankAccNo;
        this.salaryCreditDate = salaryCreditDate;
        this.tax = tax;
        this.status = status;
        this.grade = grade;
    }
    
    
    public Employee(){}

    public String getDepartment() {
        return Department;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public String getGrade() {
        return grade;
    }

    public String getSalaryCreditDate() {
        return salaryCreditDate;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStatus() {
        return status;
    }

    public double getTax(double basicSalary) {
        if(basicSalary>=2500){
            tax=basicSalary * 0.5;
        }
        else{
            tax=0;
        }
        
        return tax;
    }
    
        
    }
    
    
    


   