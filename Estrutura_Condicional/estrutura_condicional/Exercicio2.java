package estrutura_condicional;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x;
		
		System.out.println("Insira o n�mero desejado: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			
			System.out.println("O n�mero � PAR");
		} else {
			
			System.out.println("O n�meor � �MPAR");
		}
		
		sc.close();
	}

}
