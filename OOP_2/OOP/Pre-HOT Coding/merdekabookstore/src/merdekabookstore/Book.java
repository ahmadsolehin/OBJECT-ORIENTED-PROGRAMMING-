/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merdekabookstore;


public class Book {
    private int isbn;
    private String title;
    private double price;
    private String genre;

    public Book(int isbn, String title,double price, String genre) {
        this.isbn = isbn;
        this.price=price;
        this.title = title;
        this.genre = genre;
    }

    Book() {
        
    }

    public String getGenre() {
        return genre;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(){
        return price;
    }


}

