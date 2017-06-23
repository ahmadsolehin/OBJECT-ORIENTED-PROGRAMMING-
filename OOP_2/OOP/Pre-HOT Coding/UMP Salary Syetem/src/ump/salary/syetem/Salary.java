/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ump.salary.syetem;


/**
 *
 * @author FSK4
 */
public class Salary {
    
    private double basicSalary;
    private double ITKA;
    private double bantuanSaraHidup;
    private double ITP;
    private double cukaiPendapatan;
    private double zakatPendapatan;
    private double pinjamanPerumahan;
    private double pinjamanKenderaan;
    private double insuran;
    private double KKDSS;

    public Salary(double b, double i, double s, double t, double c, double z, double p, double pi, double in, double k) {
        basicSalary = b;
        ITKA = i;
        bantuanSaraHidup = s;
        ITP = t;
        cukaiPendapatan = c;
        zakatPendapatan = z;
        pinjamanPerumahan = p;
        pinjamanKenderaan = pi;
        insuran = in;
        KKDSS = k;
    }

    public double getITKA() {
        return ITKA;
    }

    public double getITP() {
        return ITP;
    }

    public double getKKDDS() {
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

    public double getInsuran() {
        return insuran;
    }

    public double getPinjamanKenderaan() {
        return pinjamanKenderaan;
    }

    public double getPinjamanPerumahan() {
        return pinjamanPerumahan;
    }

    public double getZakatPendapatan(double basicSalary) {
        zakatPendapatan = basicSalary * 0.25;
        return zakatPendapatan;
        
    }
    
    public double income(){
        double total;
        total = basicSalary + ITKA + ITP + bantuanSaraHidup ;
        return total;
                
    }

    public double deduction(){
        double deduct;
        deduct = cukaiPendapatan + insuran + zakatPendapatan + pinjamanPerumahan + pinjamanKenderaan + KKDSS ;
        return deduct;
    }
    
    public double nettSalary(){
        double nett;
        nett = income()- deduction();
        return nett;
    }
  

    
    }
    
    
   
    
    
   

