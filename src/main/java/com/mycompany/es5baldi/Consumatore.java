package com.mycompany.es5baldi;


import com.mycompany.es5baldi.Semaforo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefa
 */
public class Consumatore extends Thread{
      Semaforo pieno;
    Semaforo vuoto;
    
    public Consumatore(Semaforo semaforo1, Semaforo semaforo2)
    {
        pieno = semaforo1;
        vuoto = semaforo2;
    }
    
    synchronized public void run()
    {
        int i = 0;
        
        Buffer leggiDati = new Buffer();   
        
        while(main.STOP)                   
        {
                pieno.P();
                
                if(main.STOP)            
                    
                System.out.println("Il Dato Letto Da " + Thread.currentThread().getName() +" è: " + leggiDati.LeggiDati(i)); 
                
                vuoto.V();                 
                
        }
        
        System.out.println("Il Consumatore è terminato");
    }
}
