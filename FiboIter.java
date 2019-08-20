/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
 
/**
 *
 * @author estudiantes
 */
public class FiboIter {

 
    public static void main(String[] args) {
        System.out.println("SUCESION FIBONACCI ITERATIVO");
        int numero1 = 0;
        int numero2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de elementos deseados de la sucesión: ");
        int cantidad = sc.nextInt();  
        if(cantidad>0)
            System.out.print(numero1 + ", ");
        for(int i = 0; i<cantidad-1; i++){
            numero2 = numero1 + numero2;
            numero1 = numero2 - numero1;
            System.out.print(numero2 + ", ");
            
        }
    }
}
