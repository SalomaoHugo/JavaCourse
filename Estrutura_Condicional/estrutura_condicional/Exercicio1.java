package estrutura_condicional;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x;
		
		System.out.println("Insira o número desejado: ");
		x = sc.nextInt();
		
		if (x < 0) {
			
			System.out.println("O número é NEGATIVO");
		} else {
			
			System.out.println("O númeor é POSITIVO");
		}
		
		sc.close();
	}

}
