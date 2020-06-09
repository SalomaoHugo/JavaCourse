package estrutura_repetitiva_for;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner (System.in)){
			
			double n, i;
			
			System.out.println("insira o valor desejado:");
			n = sc.nextInt();
			
			for (i=1; i<=n; i++) {
				
				if (n%i==0) {
					
					System.out.println(i);
				
			}
			
			}
		}
	}
}
