/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasillo;

/**
 *
 * @author Albert
 */
public class Repasillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //String array se inicializa en null
        String[][] matrizStrings = new String[3][3];
        //Otra manera inicializar Array 2d
        String[][] matrizStrings2 = {{"1","","3"},{"4","5","6"},{"7","8","9"}};
         for(int i=0; i<matrizStrings.length; i++)
         {
            for(int j=0; j<matrizStrings[0].length; j++){
                System.out.print(matrizStrings[i][j]+" ");
                
            }
             System.out.println("");
        }
// Hay que inicializar primero el array de Strings, con otro tipo de dato no pasa.
//        if(matrizStrings[0][0].equals("hola")){
//            
//        }

    

        for(int i=0; i<matrizStrings.length; i++)
        {
            for(int j=0; j<matrizStrings[0].length; j++){
                matrizStrings[i][j]="a"+i+j;
            }
        }
        
         for(int i=0; i<matrizStrings.length; i++)
         {
            for(int j=0; j<matrizStrings[0].length; j++){
                System.out.print(matrizStrings[i][j]+" ");
                
            }
             System.out.println("");
        }
        
            matrizStrings2[0][1]="hola";
     for(int i=0; i<matrizStrings2.length; i++)
         {
            for(int j=0; j<matrizStrings2[0].length; j++){
                System.out.print(matrizStrings2[i][j]+" ");
                
            }
             System.out.println("");
        }
        
     int[][] numeros = new int[2][2];
     
     for(int i =0; i<numeros.length;i++)
     {
         for(int j=0; j<numeros[0].length;j++)
             System.out.print(numeros[i][j]+" ");
         System.out.println("");
     }
    }
    
}
