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
public class DemoBook extends Book {
     public DemoBook (String isbn, String titel, String author,String year, String type ,double price){
         super(isbn, titel, author, year, "demo", 0.0);
     }
     @Override
       public boolean IsAvailable(){
      return false;
  }
   @Override
   public void purchase(int quantity, String email,String address){
       throw new IllegalArgumentException("sorry , you cant buy this Demo book are not for sale ");
  }
       
     
         
     
    
}
