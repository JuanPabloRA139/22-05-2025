import java.util.Scanner;

public class main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Type the numer of the month");
        int Valor1 = scanner.nextInt();

        switch(Valor1){
            case 2:
            case 3:
            case 4:
            System.out.println("Spring");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("Winter");
            break;
            case 5:
            case 6:
            case 7:
            case 8:
            System.out.println("Automn");
            break;
            case 1:
            case 12:
            System.out.println("Summer");
            break;

        }
	}
}
