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
public class EBook extends Book {
    private String fileType;
    
     public EBook(String isbn, String titel, String author,String year, String type ,int stock,double price,String fileType ){
         super(isbn,titel , author, year , type, price);
         this.fileType=fileType; 
     }
     @Override
     public boolean IsAvailable(){
      return true;
  }
     @Override
     public  void purchase(int quantity,String email, String address){
         System.out.println("Ebook will be sent to "+email );
     }
     
     
}
