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
public class Book {
    public String isbn;
    public String titel;
    public String author;
    public String year;
    public String type;
    public double price; 
    
public Book (String isbn, String titel, String author,String year, String type ,double price){
    this.isbn=isbn;
    this.titel=titel;
    this.author=author;
    this.year=year;
    this.type=type;
    this.price=price;
}  

public String gertIsbn(){
    return isbn;
}
public void setISBN(String isbn){
    this.isbn=isbn;
}
public String getTitel(){
    return titel;
}
public void setTitel(String titel){
    this.titel=titel;
}
public String getAouther(String author){
    return author;
    
}
public void setAouther(String author){
    this.author=author;
}
public String getYear(){
    return year;
}
public void setYear(String year){
    this.year=year;
}
public String getType(){
    return type;
}
public void setType(){
    this.type=type;
}
  public double getPrice() {
        return price;
    }
  public void setprice(double price){
    this.price=price;
}
  public boolean IsAvailable(){
      return false;
  }
  public void purchase(int quantity, String email,String address){
      System.out.println("sorry you cant buy this ");
  }
  

   

}
