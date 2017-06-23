/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ump;


public class Employee {
    private String staffID;
    private String staffName;
    private String department;
    private String bankAcc;
    private String sallaryCreditDate;
    private double tax;
    private String status;
    private String grade;

    public Employee(String staffID, String staffName, String department,String bankAcc, String sallaryCreditDate, String status, String grade) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.department = department;
        this.bankAcc = bankAcc;
        this.sallaryCreditDate = sallaryCreditDate;
        this.tax = tax;
        this.status = status;
        this.grade = grade;
    }

    Employee() {
    }

    public String getDepartment() {
        return department;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public String getGrade() {
        return grade;
    }

    public String getSallaryCreditDate() {
        return sallaryCreditDate;
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

    public double getTax() {
        return tax;
    }
    
    
    
    
}
