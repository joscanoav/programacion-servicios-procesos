/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repaso.java;

/**
 *
 * @author josca
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Declaraciones arrays, falta asignar el tamaño
        int intArray[];
        int[] intArray2;
    // otros tipos de arrays
        byte byteArray[];
        short shortArray[];
        boolean booleanArray[];
        long longArray[];
        float floatArray[];
        double doubleArray[];
        char charArray[];//primitivo char
        String stringArray[];//objeto
        
        // asignamos tamaño
            intArray= new int[5];
            int[] otroarray=new int[5];
        // asignamos datros al array
        
        intArray[0]=3;
        intArray[1]=8;
        intArray[2]=2;
        intArray[3]=1;
        intArray[4]=6;
        
        System.out.println("Elemento en el indice 2 es " +intArray[2]);
        
        // Mostramos el array completo
            for (int i = 0; i < intArray.length; i++) {
                System.out.println("Elemento ene el indice " + i + " : " + intArray[i]);
            
        // Mostramos elementos
        }
    
    
    }
    
}
