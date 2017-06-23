/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package registractionsubject;

import java.util.Scanner;

/**
 *
 * @author FSK4
 */
public class Tester {

   private static Student [] std=new Student[3];
   private static Subject[]sub=new Subject[2];
  
    public static void main(String[] args) {
        String name,metric,subName;
        int i,j,credit;
        for(i=0;i<3;i++){
            System.out.println(i);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter name :");
            name=s.next();
            System.out.println("Enter Metric :");
            metric=s.next();
            std[i]=new Student(name,metric);
            System.out.println(std[i]);
            for(j=0;j<2;j++){
                System.out.println("Subject Name :");
                subName=s.next();
                System.out.println("Credit :");
                credit=s.nextInt();
                sub[j]=new Subject(subName,credit);
            }
            std[i].display(sub, j);
        }
        
    }
}
