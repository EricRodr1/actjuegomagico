/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juegomagico;

import java.util.Random;
import java.util.Scanner;
 
/**
 *
 * @author Eric Rodriguez
 */
public class Juegomagico {

    public static void main(String[] args) {
       Random x = new Random() ;
       int naleatorio=x.nextInt(5) ;
       Scanner entrada= new Scanner(System.in);
       int numero;
       
        System.out.println("Favor ingresar un numero del 0 al 5 ");
        numero= entrada.nextInt();
        
        while(naleatorio != numero){
            System.out.println("Ingrese otro numero");
            numero = entrada.nextInt();
            if (naleatorio > numero ){
                System.out.println("El numero es mayor:");
            }
            else{
                if (naleatorio == numero){
                    System.out.println("Felicidades adivinaste");
                }
                else{
                    System.out.println("El numero es menor: ");
                }
            }
        }
                
    }
}
