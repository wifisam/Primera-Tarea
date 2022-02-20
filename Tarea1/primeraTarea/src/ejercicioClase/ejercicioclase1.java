/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioClase;


import java.util.Scanner;
    
public class ejercicioclase1 {

    public static void main(String[] args) {
        int a,b,c,d ;
        Scanner scanner = new Scanner(System.in); // capturo datos 
        System.out.println("write the first number");
        a = scanner.nextInt(); // guardo datos 
         if (a > 0)  // si el primero numero es mayor a 0 
        System.out.println("write the second number");
        b = scanner.nextInt(); // guardo datos 
        System.out.println("write the third number");
        c = scanner.nextInt(); // guardo datos 
        System.out.println("write the quarter number");
        d = scanner.nextInt(); // guardo datos 
        
        if (a > 0)  // si el primero numero es mayor a 0 
         
        
        
        if ((a >= 6.50) && (a <= 6.99)) { // rango del estudiante para poder hacer recuperacion
            System.out.println("you can recover note whit a test");
        } else {
            System.out.println("Reprobate"); // estudiantes abajo de 6.50 reprobados 
        }

    }

}


