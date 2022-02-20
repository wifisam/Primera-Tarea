//Desarrollar un programa que solicite al usuario cuantos números desea ingresar,
//luego determinar
//-Cual es el mayor
//-Cual es el menor
//-Cuantos son pares
//*no se aceptan números negativos.
package primerEjercicio;

import javax.swing.*;

public class ejercicio4 {

    public static void main(String[] args) {
        String number;

        int num, mayor = 0, menor = 10000;
        int i = 1, contador = 0, total, contadorpares = 0;

        number = JOptionPane.showInputDialog("cuantos numeros desea ingresar?: ");
        total = Integer.parseInt(number);
        while (i <= total) {
            do {
                number = JOptionPane.showInputDialog("Ingrese el Numero: " + i);
                num = Integer.parseInt(number);

                if (num < 0) {
                    JOptionPane.showMessageDialog(null, "El numero no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (num < 0);
            if (num > 0) {
                contador = contador + 1;
            }
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
            i = i + 1;

            if (num % 2 == 0) {
                contadorpares = contadorpares + 1;
            }

        }
        JOptionPane.showMessageDialog(null, " El numero mayor es: " + mayor
                + "\nEl numero Menor es de : " + menor
                + "\n" + contadorpares + " son numeros pares");
    }
}
