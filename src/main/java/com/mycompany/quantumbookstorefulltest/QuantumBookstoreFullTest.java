/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantumbookstorefulltest;

/**
 *
 * @author Engy
 */
public class QuantumBookstoreFullTest {

    public static void main(String[] args) {
        StoreManager store = new StoreManager();
        store.addBook(new PaperBook("967756","east of eden","John Steinbeck","1999","fantacy",10,140.0));
        store.addBook(new EBook("9673423","The Curious Incident of the Dog in the Night-Time ","John Steinbeck","1999","fantacy",10,140.0,"pdf"));
        store.addBook(new DemoBook("4757697979","Pride and Prejudice ","John Steinbeck","1999","fantacy",10));
        store.removeOutdateBooks(2023, 5);
        
        try{
            store.buyBook("967756", 1, "engy@vdui.com", "october");
            store.buyBook("9673423", 2, "engy@vdui.com", "tagmo3");
            store.buyBook("4757697979", 1, "engy@vdui.com", "madent nasr");
            
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
