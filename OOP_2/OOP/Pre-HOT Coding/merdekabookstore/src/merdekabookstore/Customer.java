/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;


public class Customer {
    private String name;
    private String Address;
    private String contactNo;
    private String memberNo;
    private double memberPoint;

    public Customer(String name,String address, String contactNo, String memberNo, double memberPoint) {
        this.name = name;
        this.Address = address;
        this.contactNo = contactNo;
        this.memberNo = memberNo;
        this.memberPoint = memberPoint;
    }

    Customer() {
        
    }

    public String getAddress() {
        return Address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public double getMemberPoint() {
        return memberPoint;
    }

    public String getName() {
        return name;
    }

    
     
   
}
