package estrutura_repetitiva_for;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner (System.in)) {
			int n, i;
			
			System.out.println("Defina o valor para N");
			n = sc.nextInt();
			
			if (n == 0) {
				
				System.out.println("Fatorial de 0 é 1");
				
				System.exit(0);
			}
			
			for(i=n; i>1; i--) {
				
				n = n * (i-1);
				
			}
			
			System.out.println(n);
			
		}
	}


}
