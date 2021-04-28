/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es5baldi;
/**
 *
 * @author stefa
 */
public class main {

   public static boolean STOP = true;
    
    public static void main(String[] args) throws InterruptedException
    {
    
        Semaforo pieno = new Semaforo(0); 
        
        Semaforo vuoto = new Semaforo(10);
        
        Produttore produttore = new Produttore(pieno, vuoto);
        
        
        Consumatore consumatore1 = new Consumatore(pieno, vuoto);
        
        Consumatore consumatore2 = new Consumatore(pieno, vuoto);
        
        Consumatore consumatore3 = new Consumatore(pieno, vuoto);
        
        Consumatore consumatore4 = new Consumatore(pieno, vuoto);
        
        Consumatore consumatore5 = new Consumatore(pieno, vuoto);
        
        Consumatore consumatore6 = new Consumatore(pieno, vuoto);
        
       
        produttore.setName("Produttore");
        
        
        consumatore1.setName("Consumatore1");
        consumatore2.setName("Consumatore2");
        consumatore3.setName("Consumatore3");
        consumatore4.setName("Consumatore4");
        consumatore5.setName("Consumatore5");
        consumatore6.setName("Consumatore6");
        
        produttore.start();
        consumatore1.start();
        consumatore2.start();
        consumatore3.start();
        consumatore4.start();
        consumatore5.start();
        consumatore6.start();
        
        
        Thread.sleep(20000);    
        STOP = false;      
        
        System.out.println("Main terminato");
    }      
    
}
