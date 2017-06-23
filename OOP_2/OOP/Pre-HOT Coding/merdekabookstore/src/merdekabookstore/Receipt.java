/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;


public class Receipt {
    private double totalPrice;
    private double discount;
    private double currPoint;

    public Receipt(double totalPrice, double discount, double currPoint) {
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.currPoint = currPoint;
    }

    Receipt() {
        
    }

    public double getCurrPoint() {
        return currPoint;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public double calBookPrice(Book [] bk){
        int j;
        double sum=0;
        for(j=0;j<3;j++){
         sum=sum+bk[j].getPrice();
          
        }
       return sum;
      
    }
    public double calDisc(Book [] bk){
         int j;
        double sum=0;
        for(j=0;j<3;j++){
         sum=sum+bk[j].getPrice();
          
        }   
        if(sum<59.99){
               sum=sum*0.01;
               
           }
          else if
             (sum>60&&sum<100.99){
                    sum=sum*0.02;
    }     
          else if
             (sum>101.00){
              sum=sum*0.05;
          }
          return sum;
    }
public double calmemberPoint(Customer m,Book [] bk){
     int j;
        double sum=0;
        double currPoint;
        double memberPoint=0;
        for(j=0;j<3;j++){
         sum=sum+bk[j].getPrice();
        } 
        currPoint=0.04*sum;
        memberPoint=memberPoint+m.getMemberPoint()+currPoint;
        return memberPoint;
  
} 
public double grandTotal(Book [] bk){
    int u;
    
        double total=0;
        for(u=0;u<3;u++){
         total=total+bk[u].getPrice();
          
        }
       int j;
        
        double sum=0;
        for(j=0;j<3;j++){
         sum=sum+bk[j].getPrice();
          
        }   
        if(sum<59.99){
               sum=sum*0.01;
               
           }
          else if
             (sum>60&&sum<100.99){
                    sum=sum*0.02;
    }     
          else if
             (sum>101.00){
              sum=sum*0.05;
          }
          return total-sum;
    }

   public void display(Customer m,Book [] bk){
        int j;
        int i;
       
       System.out.println("*******receipt**********");
       System.out.println("Member No:"+m.getMemberNo());
       System.out.println("Customer Name:"+m.getName());
       System.out.println("Address:"+m.getAddress());
       System.out.println("Contact:"+m.getContactNo());
      
     
        for(j=0;j<3;j++){
       System.out.println("ISBN:"+bk[j].getIsbn());
       System.out.println("Title:"+bk[j].getTitle());
       System.out.println("Genre:"+bk[j].getGenre());
       System.out.println("Price:"+bk[j].getPrice());
      
       
        }
       System.out.print("Total Price:"+calBookPrice(bk)); 
       System.out.println("    ");
       System.out.print("Discount:"+calDisc(bk));
       System.out.println("    ");
       System.out.println("New Total Price:"+grandTotal(bk));
       System.out.print("New Member point:"+calmemberPoint(m,bk));   
    }
    
    
}

         
  
