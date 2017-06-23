/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;

/**
 *
 * @author SavethequeeN
 */
public class Receipt {
    
    private double totalPrice;
    private double discount;
    private double currPoint;
    double newTotalPrice;
    double disc;
    

    
    public double getTotalPrice() {
        return totalPrice;
    }

    
    public void calcBookPrice(Book[] bk, int book){
        for(int i=0; i<book; i++){
        totalPrice = bk[i].getPrice() + totalPrice;
        System.out.println("");
        }
    }
    
    public void caclMemberPoint(double totalPrice){
        
        currPoint = 0.04 * totalPrice;
        
    }
    
    public void calcDiscount(double totalPrice){
       
        if(totalPrice <= 59.99){
            
            newTotalPrice = totalPrice - (0.01 * totalPrice);
            disc = 0.01 * totalPrice;
            
        }else
            
            if( totalPrice >= 60.00 && totalPrice <= 100.99){
                
                newTotalPrice = totalPrice - (0.02 * totalPrice);
                disc = 0.01 * totalPrice;
                
            }else
        
                if( totalPrice > 101.00){
                
                    newTotalPrice = totalPrice - (0.05 * totalPrice);
                    disc = 0.01 * totalPrice;
            }
    }
    
    public void displayReceiptInfo(Customer cust, Book[] bk, int book){
        
        System.out.println("Member No: " + cust.getMemberNo());
        System.out.println("Customer Name: " + cust.getName());
        System.out.println("Customer Address: " + cust.getAddress());
        System.out.println("Customer ContactNo: " + cust.getContactNo());
        System.out.println("Member Point: " + cust.getMemberPoint());
        
        for(int i=0; i<book; i++){
        System.out.println("Book ISBN: " + bk[i].getIsbn());
        System.out.println("Book Title: " + bk[i].getTitle());
        System.out.println("Book Price: RM" + bk[i].getPrice());
        System.out.println("Book Genre: " + bk[i].getGenre());
        
    }
        
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount: RM" + disc);
        System.out.println("New Total Price: RM" + newTotalPrice);
        System.out.println("Member Point: " + (cust.getMemberPoint() + currPoint));
        
  }
    
}
