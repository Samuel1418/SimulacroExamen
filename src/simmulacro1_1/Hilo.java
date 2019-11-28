/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simmulacro1_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class Hilo extends Thread{
    public Hilo(String str){
    super(str);
    }
    public void run()   {
    for(int i=0;i<8;i++){
      Thread.yield(); //Para el apartado c es esto, no se puede hacer con el math random porque si no. Al ser un tiempo aleatorio de espera pueden salir dos iguales por eso
     System.out.println(i+" "+getName());
        try {                   
            Thread.sleep((long) (3000)); //Thread.sleep((long) (1000*Math.random()));
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }                 
 }
}}