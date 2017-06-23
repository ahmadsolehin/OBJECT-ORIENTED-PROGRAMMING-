/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;

import java.util.Scanner;
public class Book {
    
    private int book;
    private int isbn;
    private String title;
    private double price;
    private String genre;
    Scanner input = new Scanner(System.in);
    
    public void setBookInfo(int isbn){
     
        if(isbn == 1112){
            
            title = "Object Oriented Programming";
            price = 89.99;
            genre = "Book";
        }else
        
        if(isbn == 1113){
            
            title = "Software Engineering";
            price = 70.80;
            genre = "Book";
        }else
        
        if(isbn == 1114){
            
            title = "C Programming";
            price = 50.50;
            genre = "Book";
        }else
        
        if(isbn == 2111){
            
            title = "Reader Digest";
            price = 33.39;
            genre = "Magazine";
        }else
        
        if(isbn == 2112){
            
            title = "Programmer Magazine";
            price = 45.50;
            genre = "Magazine";
        }
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }
    
    
    public void bookInput(){
        System.out.println("Enter Book ISBN: ");
        isbn = input.nextInt();   
    }
    
}
