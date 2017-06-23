/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package umpsalarysystem;

import java.util.Scanner;
public class Salary {
    
    private double basicSalary;
    private double ITKA = 300.00;
    private double bantuanSaraHidup = 200.00;               
    private double ITP;
    private double cukaiPendapatan;
    private double zakatPendapatan;
    private double pinjamanPerumahan;       
    private double pinjamanKereta;       
    private double insurance;
    private double KKDSS;
    private double elaunKeraian;
    double nettSalary;
    Scanner input = new Scanner(System.in);
    
    public Salary(double basicSalary,double pinjamanPerumahan,double pinjamanKereta, double insurance){
        this.basicSalary = basicSalary;
    }

    public double getITKA() {
        return ITKA;
    }

    public double getITP() {
        return ITP;
    }

    public double getKKDSS() {
        return KKDSS;
    }

    public double getBantuanSaraHidup() {
        return bantuanSaraHidup;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getCukaiPendapatan() {
        return cukaiPendapatan;
    }

    public double getInsurance() {
        return insurance;
    }

    public double getPinjamanPerumahan() {
        return pinjamanPerumahan;
    }

    public double getPinkamanKereta() {
        return pinjamanKereta;
    }

    public double getZakatPendapatan() {
        return zakatPendapatan;
    }

    public double getElaunKeraian() {
        return elaunKeraian;
    }
    
    
    
    public void salaryInput(){
        System.out.println("Enter Staff Basic Salary: ");
        basicSalary= input.nextDouble();
        System.out.println("Enter Staff Insurance: ");
        insurance= input.nextDouble();
        System.out.println("Enter Staff House Loan: ");
        pinjamanPerumahan= input.nextDouble();
        System.out.println("Enter Staff Car Loan: ");
        pinjamanKereta= input.nextDouble();
        System.out.println("\t");
    }
    
    public void income(String grade){
        switch (grade) {
            case "N45":
                elaunKeraian = 300.00;
                break;
            case "N48":
                elaunKeraian = 600.00;
                break;
            case "N52":
                elaunKeraian = 900.00;
                break;
            case "N54":
                elaunKeraian = 1200.00;
                break;
        }
      
        if(grade.compareTo("N48") < 0){
            ITP = 700.00;
        }else
        
        if(grade.compareTo("N48") >= 0){
            ITP = 1000.00;
        }
        
        bantuanSaraHidup = 200.00;
        ITKA = 300.00;
    }
    
    public void deduction(){
        zakatPendapatan = 0.25 * this.basicSalary;
        
        if (this.basicSalary > 2500.00){
            cukaiPendapatan = 0.5 * this.basicSalary;
        }
        
        KKDSS = 3.00;
    }
    
    public void nettSalary(){
        
        nettSalary = (this.basicSalary + elaunKeraian + ITP +bantuanSaraHidup + ITKA)   -
                     (zakatPendapatan + cukaiPendapatan + KKDSS + pinjamanPerumahan + pinjamanKereta);
    }
    
    public void display(Employee emp){
        System.out.println("Staff ID: " + emp.getStaffID());
        System.out.println("Staff Name: " + emp.getStaffName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Bank Acc No: " + emp.getBankAccNo());
        System.out.println("Salary Credit Date: " + emp.getSalaryCreditDate());
        System.out.println("Tax: " + cukaiPendapatan);
        
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("INCOME");
      
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Imbuhan Tetap Khidmat Awam(ITKA): " + ITKA);
        System.out.println("Imbuhan Tetap Perumahan: " + ITP);
        System.out.println("Elaun Sara Hidup: " + bantuanSaraHidup);
        
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("DEDUCTION");
        
        System.out.println("Cukai Pendapatan: " + cukaiPendapatan);
        System.out.println("Insurance: " + insurance);
        System.out.println("Zakat Pendapatan: " + zakatPendapatan);
        System.out.println("Pinjaman Perumahan: " + pinjamanPerumahan);
        System.out.println("Pinjaman Kenderaan: " + pinjamanKereta);
        System.out.println("KKDSS: " + KKDSS);
        System.out.println("Nett Salary: " + nettSalary);
   
    }
}   
