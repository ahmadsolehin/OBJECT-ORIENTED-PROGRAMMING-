/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;

import java.util.Scanner;
public class ProgramTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int book;
        Customer cust = new Customer("", "", "", "");
        Receipt rc = new Receipt();
        Book[] bk = new Book[5];
        Scanner input = new Scanner(System.in);
        
        
        cust.customerInput();
        System.out.println("How many book you want to buy?: ");
        book = input.nextInt();
        for(int i=0; i<book; i++){
        bk[i] = new Book();    
        bk[i].bookInput();
        bk[i].setBookInfo(bk[i].getIsbn());
        }
        rc.calcBookPrice(bk, book);
        rc.calcDiscount(rc.getTotalPrice());
        rc.caclMemberPoint(rc.getTotalPrice());
        
        rc.displayReceiptInfo(cust, bk, book);
        
        
        
 
    }
}
