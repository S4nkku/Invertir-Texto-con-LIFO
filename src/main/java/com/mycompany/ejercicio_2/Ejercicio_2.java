/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        
        System.out.println("Digite los caracteres: ");
        
        
        Scanner scl  = new Scanner (System.in);
        int longitud = scl.nextInt();
        
        
        String cadena = "";
        String cadenaInvertida = "";
        
        
        Invertir i1 = new Invertir(longitud);
                
         
        for (int i = 0;i < longitud; i++){
            System.out.println("Pila llena: " + i1.estaLlena());
            System.out.println("Digite el caracter: ");
            Scanner sc2 = new Scanner(System.in);
            i1.push(sc2.nextLine().charAt(0));
            cadena += i1.peek();            
        }                       
        
        for (int i = 0; i < longitud; i++){
            cadenaInvertida += i1.pop();         
        }
        System.out.println("Texto: " + cadena + "\nTexto Invertido: " + cadenaInvertida);
        
        
    }
}
