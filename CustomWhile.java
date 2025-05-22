import java.util.Scanner;

public class CustomWhile{
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje) {
        int numeroTemporal = 0;
        while(numeroTemporal <= 0){
            System.out.println(mensaje + ": ");
            numeroTemporal = scanner.nextInt();
        }
            return numeroTemporal;
    
    }

    public static void main(String[] args) {
        int numero = obtenerNumero("Ingresa un número");
        int numero2 = obtenerNumero("Ingresa otro número");
        System.out.println("El resultado es: "+ (numero/numero2));
    }
}
