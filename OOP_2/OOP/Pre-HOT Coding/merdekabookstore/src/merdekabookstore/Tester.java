/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;

import java.util.Scanner;


public class Tester {

 
    public static void main(String[] args) {
         String name,address,contact,memberNo,
               genre,title;
       int isbn,i,j;
       double memberPoint,price,totalPrice,discount,currPoint;
       
       Book [] bk=new Book[5];
       Customer c=new Customer();
       Receipt re=new Receipt();
       Scanner sc=new Scanner(System.in);
       
      for(j=0;j<2;j++){
        System.out.println("                 ");  
        System.out.println("****INPUT*****");  
        System.out.println("NAME            :");
        name=sc.next();
        System.out.println("Address         :");
        address=sc.next();
        System.out.println("Contact NO       :");
        contact=sc.next();
        System.out.println("Member No       :");
        memberNo=sc.next();
        System.out.println("Member Point     :");
        memberPoint=sc.nextDouble();
        c=new Customer(name,address,contact,memberNo,memberPoint);
       
        for(i=0;i<3;i++){
        System.out.println("ISBN            :");
        isbn=sc.nextInt();
        System.out.println("Title           :");
        title=sc.next();
        System.out.println("Price         RM:");
        price=sc.nextDouble();
        System.out.println("Genre           :");
        genre=sc.next();
        bk[i]=new Book(isbn,title,price,genre);
        }
      
        re.calBookPrice(bk);
        re.display(c,bk);
       
       
       
    }
       
    }
}
 




