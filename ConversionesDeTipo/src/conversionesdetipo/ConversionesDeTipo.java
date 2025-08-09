/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionesdetipo;

import java.util.Scanner;

public class ConversionesDeTipo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2; 
        double division;
        
        System.out.println("Ingrese un número entero");
        num1 = Integer.parseInt(input.nextLine()); 
        System.out.println("Ingrese otro número entero");
        num2 = Integer.parseInt(input.nextLine());
        
        division = ((double)num1 / num2);
        
        System.out.println("La división es: " + division );
    }
    
}
