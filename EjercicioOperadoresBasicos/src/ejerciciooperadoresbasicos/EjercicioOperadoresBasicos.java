/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciooperadoresbasicos;

import java.util.Scanner;

public class EjercicioOperadoresBasicos {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        System.out.println("Ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());
                
        System.out.println("Ingrese otro número entero: ");
        num2 = Integer.parseInt(input.nextLine());
       
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        System.out.println("La suma es: " + suma + " ,la resta es: " + resta 
        + " ,la multiplicación es: " + multiplicacion + " y la división: " + division);
        
        
      
    }
    
}
