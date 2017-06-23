/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registractionsubject;

/**
 *
 * @author FSK4
 */
public class Student {
    private String name;
    private String metric;
    private int totalCredit;

    public Student(String name, String metric) {
        this.name = name;
        this.metric = metric;
        this.totalCredit=0;
    }

    public String getMetric() {
        return metric;
    }

    public String getName() {
        return name;
    }
    
    public int getTotalCredit() {
        return totalCredit;
    }
    
    public void calculatTotalCredit(int credit){
        totalCredit+=credit;
    } 
     public void display(Subject sub[],int j){
         System.out.println("****OUTPUT******");
         System.out.println("Name:"+getName());
         System.out.println("Metric:"+getMetric());
         for(j=0;j<2;j++){
             System.out.println("Subject Name:"+sub[j].getSubName());
             System.out.println("Credit:"+sub[j].getCredit());
             calculatTotalCredit(sub[j].getCredit());
         }
         System.out.println("Total Credit:"+getTotalCredit());
   }
    
}
