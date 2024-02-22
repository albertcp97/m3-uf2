/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasillo;

import java.util.ArrayList;

/**
 *
 * @author Albert
 */
public class Listas {
     public static void main(String[] args) {
    // inicializar arraylist (entre "<>" poner el tipo variable de la lista )
    
    ArrayList<String> listaAlumnos = new ArrayList<>();
    
    //Añadir variables a la lista
     listaAlumnos.add("Juan");
     listaAlumnos.add("Juan");
     listaAlumnos.add("Juan Caballo");
     listaAlumnos.add("Pedrito");
     
     //Elimiar elemento
     listaAlumnos.remove("Juan");
     listaAlumnos.remove(0);
     
     //Vaciar lista
     listaAlumnos.clear();
     
     //Modificar lista
     listaAlumnos.set(2,"Pedrito me electrocutaste");
     
     //Buscar posicion elemento
         System.out.println(listaAlumnos.indexOf("Juan Caballo"));
     //si no exite el elemento devuelve -1
     listaAlumnos.indexOf("Hola");
         System.out.println("");
     //Podemos preguntarle a la lista si esta vacia
         System.out.println(listaAlumnos.isEmpty());
         
         System.out.println("");
     
         
     
     //Podemos preguntarle a la lista si tiene un elemento en concreto
         System.out.println(listaAlumnos.contains("Pedrito me electrocutaste"));
         
         System.out.println("");
         //Saber dimension lista
         System.out.println(listaAlumnos.size());
         
         System.out.println("");
         //Recorrer lista
         for(int i = 0; i < listaAlumnos.size();i++){
             System.out.println(listaAlumnos.get(i));
         }
         //Otra manera, mediante iteración
         
         System.out.println("");
         for(String s : listaAlumnos)
             System.out.println(s);
         
         //Vaciar lista
         listaAlumnos.clear();
     
     
     
     }
    
    
    
}
