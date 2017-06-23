/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;

import java.util.Scanner;
public class Customer {
    
    private String name;
    private String address;
    private String contactNo;
    private String memberNo;       
    private double memberPoint;
    Scanner input = new Scanner(System.in);
    
    public Customer(String name, String address, String contactNo, String memberNo){
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.memberNo = memberNo;   
    }
    
    public void setMemberPoint(double memberPoint){
        
    }

    public String getAddress() {
        return address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public String getName() {
        return name;
    }

    public double getMemberPoint() {
        return memberPoint;
    }
    
    
    
    public void customerInput(){
        System.out.println("Enter Customer MemberNo: ");
        memberNo = input.next();
        System.out.println("Enter Customer Name: ");
        name = input.next();
        System.out.println("Enter Customer Address : ");
        address = input.next();
        System.out.println("Enter Customer ContactNo : ");
        contactNo = input.next();
        System.out.println("Enter Customer MemberPoint ");
        memberPoint = input.nextDouble();
    }
}
