//En una tienda se realizan diferentes descuentos a sus clientes al momento de
//cancelar en la caja. Cuando se dispone a cancelar tiene la oportunidad de sacar
//una bolita y dependiendo del color de la misma se le puede aplicar un determinado
//descuento. Si la bolita es roja, se le aplica un 10% de descuento sobre la compra;
//si la bola es verde, se le aplica un 5% de descuento y si la bolita es blanca, no
//tiene descuento y se le da las gracias por participar.
package primerEjercicio;

import javax.swing.*;

public class ejerciciodos{

    public static void main(String[] args) {
        String purchase, ball;
        double value;
        purchase = JOptionPane.showInputDialog("Enter the purchase value");
        value = Double.parseDouble(purchase); // capture el dato de la venta 
        purchase = JOptionPane.showInputDialog("Write ball color"); // escribe el usuario el color de la vola 
        ball = purchase;

        switch (ball) {
            case "red":
            case "RED":

                JOptionPane.showMessageDialog(null, (value - (value * 0.10)), "total value:", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "green":
            case "GREEN":
                JOptionPane.showMessageDialog(null, (value - (value * 0.05)), "total value:", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "white":
            case "WHITE":
                JOptionPane.showMessageDialog(null, value, "total value:", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error", "VALOR INVALIDO", JOptionPane.ERROR_MESSAGE);
                break;
                
              

        }

    }

}
