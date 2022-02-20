//Al ingresar la nota de un alumno, se desea saber si este aprobó o no una materia
//en el colegio. Para aprobar se necesita una nota mayor o igual a 7.0. Diseñe una
//aplicación en Java que al ingresar la nota muestre con un mensaje en el cual
//indique si el alumno aprobó o no. Además, si la nota está entre 6.50 y 6.99, tiene la
//posibilidad de realizar un examen de suficiencia para aprobar.
// string = letra 
package primerEjercicio;

import java.util.Scanner;

public class PrimeraTarea {

    public static void main(String[] args) {
        double score ;
        Scanner scanner = new Scanner(System.in); // capturo datos 
        System.out.println("write the student score");
        score = scanner.nextDouble(); // guardo datos 

        if (score >= 7.0) { // si el estudiante tiene mas de 7.00 esta aprovado 
            System.out.println("approved student");
        }
        if ((score >= 6.50) && (score <= 6.99)) { // rango del estudiante para poder hacer recuperacion
            System.out.println("you can recover note whit a test");
        } else {
            System.out.println("Reprobate"); // estudiantes abajo de 6.50 reprobados 
        }

    }

}
