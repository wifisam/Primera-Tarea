

//Modificar el ejemplo 9 de tal forma que me permita leer el número de empleados de
//los cuales voy a ingresar el sueldo, ademas el programa no permitirá leer datos
//negativos, así que al ingresar un dato negativo me dará un error y me pedirá de
//nuevo el dato, si el dato sigue siendo negativo no me permitirá ingresar el sueldo
//de otro empleado hasta que se ingrese el valor positivo del sueldo.
package primerEjercicio;

import javax.swing.*;

public class ejercicio3 {
public static void main(String[] args)
{
        String leer;
        double sueldo, mayor = 0, menor = 10000;
        int i = 1, contador = 0, empleados;

        leer = JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ");
        empleados = Integer.parseInt(leer);
        while (i <= empleados) {
            do {
                leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);
                sueldo = Double.parseDouble(leer);

                if (sueldo < 0) {
                    JOptionPane.showMessageDialog(null, "El salario no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (sueldo < 0);

            if (sueldo > 300) {
                contador = contador + 1;
            }
            if (sueldo > mayor) {
                mayor = sueldo;
            }
            if (sueldo < menor) {
                menor = sueldo;
            }
            i = i + 1;

        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor
                + "\nEl sueldo Menor es de $: " + menor
                + "\n" + contador + " Empleados tienen un sueldo mayor de $300");
    }
}
