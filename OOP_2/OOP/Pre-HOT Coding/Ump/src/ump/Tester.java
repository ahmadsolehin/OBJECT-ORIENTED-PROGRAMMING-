/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ump;

import java.util.*;

/**
 *
 * @author FSK4
 */
public class Tester {

    
    public static void main(String[] args) {
       String staffID,staffName,department,bankAcc,sallaryCreditDate,status,grade;
       double basicSalary,itka,bantuanSaraHidup,itp,cukaiPendapatan,zakatPendapatan,pinjamanPerumahan,
               pinjamanKereta,insuran,kkdss,gd;
       int j,i;
       
       Employee  e =new Employee();
       Salary sa =new Salary();
       Scanner sc =new Scanner(System.in);
       
       
        System.out.println("ID            :");
        staffID=sc.next();
        System.out.println("Name         :");
        staffName=sc.next();
        System.out.println("Department       :");
        department=sc.next();
        System.out.println("Bank Acc   :");
        bankAcc=sc.next();
        System.out.println("Sallary Credit Date  :");
        sallaryCreditDate=sc.next();
        System.out.println("Status :");
        status=sc.next();
        System.out.println("Grade N45,N48,N52,N54:");
        grade=sc.next();
        e=new Employee(staffID,staffName,department,bankAcc,sallaryCreditDate,status,grade);
        
        
        System.out.println("Basic Salary :");
        basicSalary=sc.nextDouble();
        System.out.println("Insuran :");
        insuran=sc.nextDouble();
        System.out.println("Pinjaman PErumahan :");
        pinjamanPerumahan=sc.nextDouble();
        System.out.println("Pinjaman Kenderan :");
        pinjamanKereta=sc.nextDouble();
        System.out.println("GRADE :N");
        gd=sc.nextDouble();
        sa= new Salary(basicSalary,insuran,pinjamanPerumahan,pinjamanKereta,gd);
        
        sa.display(e,sa);
    }
}

