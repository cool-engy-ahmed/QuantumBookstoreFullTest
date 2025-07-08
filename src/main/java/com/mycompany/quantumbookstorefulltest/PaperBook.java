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
public class PaperBook extends Book{
    private int stock;
    public PaperBook(String isbn, String titel, String author,String year, String type ,int stock,double price ){
         super(isbn,titel , author, year , type, price);
         this.stock = stock;
    }
        @Override
        public boolean IsAvailable(){
            return stock>0;
        }
        @Override
        public  void purchase(int quantity,String email, String address){
            if (quantity>stock){
                throw new IllegalArgumentException("sorry there is no enogh stock for Isbn "+isbn);
            }
            stock-=quantity;
            System.out.println("the book will be shipped to "+address);
        }
    
    
}
