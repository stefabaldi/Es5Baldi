package com.mycompany.es5baldi;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefa
 */

public class Buffer {
    
     public Buffer(){}
     
    public static ArrayList<Integer> bufferDati = new ArrayList<Integer>(); 
   
   
   public void AggiungiDati(int dati)     
   {
       bufferDati.add(dati);
   }
   
   public int LeggiDati(int i)        
   {
       int DatoLetto = 0;
       
       DatoLetto = bufferDati.get(i);
       bufferDati.remove(i);
       
       return DatoLetto;
   }
   
   public int Size()                
   {
       return bufferDati.size();
   }
   
   public boolean Pieno()              
   {
       boolean valore = false;
       
       if(Size() == 10)
           valore = true;
       
       return valore;
   }
   
   public boolean Vuoto()         
   {
       return bufferDati.isEmpty();
   }  
   
}
