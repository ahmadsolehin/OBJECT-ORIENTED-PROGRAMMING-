/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ump;


public class Salary {
    private double basicSalary;
    private double ITKA;
    private double bantuanSaraHidup;
    private double IPT;
    private  double cukaiPendapatan;
    private double zakatPendapatan;
    private double pinjamanPerumahan;
    private double pinjamanKereta;
    private double insuran;
    private double KKDSS;
    private double Sarahidup;
    private double gd;

    public Salary(double basicSalary,double insuran,double pinjamanPerumahan,double pinjamanKereta,double gd) {
        this.basicSalary = basicSalary;
        this.ITKA = ITKA;
        this.bantuanSaraHidup = bantuanSaraHidup;
        this.IPT = IPT;
        this.cukaiPendapatan = cukaiPendapatan;
        this.zakatPendapatan = zakatPendapatan;
        this.pinjamanPerumahan = pinjamanPerumahan;
        this.pinjamanKereta = pinjamanKereta;
        this.insuran = insuran;
        this.KKDSS = KKDSS;
        this.Sarahidup = Sarahidup;
        this.gd=gd;
    }

    Salary() {
   }

    public double getIPT() {
        return IPT;
    }

    public double getITKA() {
        return ITKA=300.00;
    }
    public double getSarahidup(){
      return Sarahidup=200.00;  
    }
    public double getKKDSS() {
        return KKDSS+3.00;
    }
    public double getBantuanSaraHidup() {
        return bantuanSaraHidup;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public double getCukaiPendapatan() {
        cukaiPendapatan=basicSalary*5/100;
        return cukaiPendapatan;
    }
    public double getInsuran() {
        return insuran;
    }
    public double getPinjamanKereta() {
        return pinjamanKereta;
    }
    public double getPinjamanPerumahan() {
        return pinjamanPerumahan;
    }
   public double getZakatPendapatan() {
        return zakatPendapatan;
    }
   public double getGd() {
        return gd;
    }
    
    
    public double calculatElaunKeraian(){
        double EK = 0;
       if(gd==45){
           EK=300.00;
      }
       else if(gd==48){
           EK=600.00;
      }
       else if(gd==52){
           EK=900.00;
       }
       else if(gd==54){
            EK=1200.00;
       }
       return EK;
    }
    
    public double calculatITP(){
      double itp=0;
      if(gd==45){
          itp=700.00;
      }
       else if(gd==48){
           itp=1000.00;
      }
       else if(gd==52){
           itp=1000.00;
       }
       else if(gd==54){
            itp=1000.00;
       }
       return itp;
    }
    public double calculatINCOME(){
      double total;
      total=basicSalary+getBasicSalary()+getITKA()+calculatITP()+getSarahidup()+calculatElaunKeraian();
        return total;  
    }
    public double calculatZakatpendapatan(){
        double zkt;
        zkt=calculatINCOME()*24/100;
        return zkt;
    }
    
    public double calculatTAX(){
        double tx=0;
        if(calculatINCOME()>2500){
            tx=calculatINCOME()*5/100;
        }
        else{
            tx=calculatINCOME();
        }
        return tx;
    }
    
    public double calculatDeducation(){
        double de;
        de=getCukaiPendapatan()+getInsuran()+calculatZakatpendapatan()+getPinjamanPerumahan()+getPinjamanKereta()+getKKDSS()+calculatTAX();
       return de; 
    }
    
    public double calculatNetSaLLAry(){
        double n;
        n=calculatINCOME()-calculatDeducation();
        return n;
    }
public void display(Employee e,Salary sa){
        
       
       System.out.println("*******receipt**********");
       System.out.println("Staff ID                                             :"+e.getStaffID());
       System.out.println("Staff Name                                           :"+e.getStaffName());
       System.out.println("Department                                           :"+e.getDepartment());
       System.out.println("Bank Acc                                             :"+e.getBankAcc());
       System.out.println("Salary Credit DAte                                   :"+e.getSallaryCreditDate());
       System.out.println("Gread                                                :"+e.getGrade());
       
       System.out.println("*******INCOME**********");
       System.out.println("Basic Salary                                         :"+sa.getBasicSalary());
       System.out.println("Imbuhan Tetap Khidmat Awam                           :"+sa.getITKA());
       System.out.println("Imbuhan Tetap Perumahan                              :"+sa.calculatITP());
       System.out.println("Elaun Sara Hidup                                     :"+sa.getSarahidup());
       System.out.println("Elaun Keraian                                        :"+sa.calculatElaunKeraian());
       System.out.println("INCOME                                                                :"+sa.calculatINCOME());
       
       System.out.println("*******DEDUCATION**********");  
       System.out.println("Cukai Pendapatan                                     :"+sa.getCukaiPendapatan());
       System.out.println("Insuran                                              :"+sa.getInsuran());
       System.out.println("Zakat PEndapatan                                     :"+sa.calculatZakatpendapatan());
       System.out.println("Pinjaman Perumahan                                   :"+sa.getPinjamanPerumahan());
       System.out.println("Pinjaman Kereta                                      :"+sa.getPinjamanKereta());
       System.out.println("KKDS                                                 :"+sa.getKKDSS());
       System.out.println("TAX                                                  :"+sa.calculatTAX());
       System.out.println("DEDUCATION                                                            :"+sa.calculatDeducation()); 
       System.out.println("NET SALARY                                                            :"+sa.calculatNetSaLLAry());

}
  
}
