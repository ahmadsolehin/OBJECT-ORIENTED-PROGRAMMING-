/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umpsalarysystem;

import java.util.Scanner;
public class Employee {
    
    private String staffID;
    private String staffName;
    private String department;
    private String bankAccNo;
    private String salaryCreditDate;
    private String status;
    private String grade;
    private double tax;
    Scanner input = new Scanner(System.in);
    
    public void setStaffID(String staff){
        
    } 
    public void setStaffName(String name){
        
    }
    public void setDepartment(String department){
        
    }
    public void setBankAccNo(String bankAcc){
        
    }
    public void setSalaryCreditDate(String SalaryCreditDate){
        
    }
    public void setStatus(String status){
        
    }
    public void setGrade(String grade){
        
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public String getDepartment() {
        return department;
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

    public double getTax() {
        return tax;
    }
    
    public void employeeInput(){
        System.out.println("Enter Staff ID: ");
        staffID = input.next();
        System.out.println("Enter Staff Name: ");
        staffName= input.next();
        System.out.println("Enter Staff Department: ");
        department = input.next();
        System.out.println("Enter Staff Bank Acc No: ");
        bankAccNo = input.next();
        System.out.println("Enter Staff Salary Credit Date: ");
        salaryCreditDate = input.next();
        System.out.println("Enter Staff Grade: ");
        grade = input.next();
        
    }
}
