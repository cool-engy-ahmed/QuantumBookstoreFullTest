/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstorefulltest;

/**
 *
 * @author Engy
 */
import java.util.*;
public class StoreManager {
    private List<Book>inventory= new ArrayList<>();
    public void addBook(Book book){
        inventory.add(book);
        System.out.println("Book added succesfully "+book.getTitel());
    }
    public void removeOutdateBooks(int currentYear, int oldYear) {
        inventory.removeIf(book->currentYear-Integer.parseInt(book.getYear())>oldYear);
        System.out.println("Outdated books are removed");
    }
    public double buyBook(String isbn,int quantity,String email,String address){
        for (Book book :inventory){
            if (book.gertIsbn().equals(isbn)){
                if (!book.IsAvailable()){
                throw new IllegalStateException("Sorry but the book is not available");    
            }
                book.purchase(quantity,email,address);
                double total = book.getPrice()*quantity;
                System.out.println("paid amount is : "+total);
                return total;
                
        }
    }
        throw  new IllegalArgumentException("sorry the book is not found");
    }
    
}

