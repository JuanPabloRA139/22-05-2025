import javax.swing.JOptionPane;

import java.util.Scanner;

public class JOption{

    public static int obtenerNumero(String mensaje) {
        int numeroTemporal = 0;
        while(numeroTemporal <= 0){
            String input = JOptionPane.showInputDialog(mensaje + ": ");
            numeroTemporal = Integer.parseInt(input);
        } 
        return numeroTemporal;
    }

    public static void main(String[] args) {
        int numero = obtenerNumero("Ingresa un número");
        int numero2 = obtenerNumero("Ingresa otro número");
        System.out.println("El resultado es: "+ (numero/numero2));
    }
}
