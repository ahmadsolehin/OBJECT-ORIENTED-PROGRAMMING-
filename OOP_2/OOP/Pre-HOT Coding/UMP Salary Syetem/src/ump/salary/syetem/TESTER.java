
package ump.salary.syetem;

import java.util.*;

public class TESTER {
    
    private static Employee [] em = new Employee[3];
    private static Salary sl = new Salary();

    
    public static void main(String[] args) {
        
        String staffID,name,department,accNo,creditDate,status,grade;
        double tax;
        int i;
        
        Scanner sc=new Scanner(System.in);
        for(i=0;i<1;i++){
        System.out.println("Staff ID                    :");
        staffID=sc.next();
        System.out.println("Staff Name                  :");
        name=sc.next();
        System.out.println("Department                  :");
        department=sc.next();
        System.out.println("Account Number              :");
        accNo=sc.next();
        System.out.println("Salary Credit Date          :");
        creditDate=sc.next();
        System.out.println("Tax                         :");
        tax=sc.nextDouble();
        System.out.println("Status                      :");
        status=sc.next();
        System.out.println("Grade                       :");
        grade=sc.next();
        
        em[i] = new Employee (staffID,name,department,accNo,creditDate,tax,status,grade);
        
        
        double basicSalary,ITKA,saraHidup,ITP,cukai,zakat,perumahan,kenderaan,insuran,KKDSS;
                
                
        System.out.println("Gaji Asas               :");
        basicSalary = sc.nextDouble(); 
        System.out.println("ITKA                    :");
        ITKA=sc.nextDouble();
        System.out.println("Bantuan Sara Hidup      :");
        saraHidup=sc.nextDouble();
        System.out.println("ITP                     :");
        ITP=sc.nextDouble();
        System.out.println("Cukai Pendapatan        :");
        cukai=sc.nextDouble();
        System.out.println("Zakat Pendapatan        :");
        zakat=sc.nextDouble();
        System.out.println("Pinjaman Perumahan      :");
        perumahan=sc.nextDouble();
        System.out.println("Pinjaman Kenderaan      :");
        kenderaan=sc.nextDouble();
        System.out.println("Insurans                :");
        insuran=sc.nextDouble();
        System.out.println("KKDSS                   :");
        KKDSS=sc.nextDouble();
        
        sl = new Salary (basicSalary,ITKA,saraHidup,ITP,cukai,zakat,perumahan,kenderaan,insuran,KKDSS);
                
        
    }
    sl.display(em);
    }
}
