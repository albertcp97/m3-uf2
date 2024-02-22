/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasillo;

import newpackage.utilitis;

/**
 *
 * @author Albert
 */
public class Funciones {
    
     public static void main(String[] args) {
         printarPorPantalla();
         printarPorPantalla2("Caracola");
         
         double d=utilitis.calcular(1.5, 1);
         
         System.out.println("La suma es:"+d);
         
     }
     
     public static void printarPorPantalla(){
         System.out.println("Hola");
     }
     
     public static void printarPorPantalla2(String string){
         System.out.println("El string es: "+string);
     }
     
   
    
}
