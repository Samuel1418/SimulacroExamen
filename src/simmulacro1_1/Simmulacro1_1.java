/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simmulacro1_1;

/**
 *
 * @author Samuel
 */
public class Simmulacro1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Hilo h1 = new Hilo("Pepe");
        Hilo h2 = new Hilo("Julian");
        Hilo h3 = new Hilo("Francisco");
        h1.start();
        h2.start();
        h3.start();
        h1.join(); //Hacen fakta los join para que se ejecute de ultimo el sout de que ya acabo el programa
        h2.join();
        h3.join();
        System.out.println("El programa ha acabado");

//          h3.start();  //Segunda parte
//          h3.join();
//          h2.start();
//          h2.join();
//          h1.start();
//          h1.join();


           
           
    }

}
