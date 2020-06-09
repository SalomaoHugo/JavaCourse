package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			double x1, x2, x3, media;
			int n, i;
			System.out.println("Qntd de casos:");
			n = sc.nextInt();
			
			for(i=0; i<n; i++) {
				
				System.out.println("digite o 1º valor");
				x1 = sc.nextDouble();
				
				System.out.println("digite o 2º valor");
				x2 = sc.nextDouble();
				
				System.out.println("digite o 3º valor");
				x3 = sc.nextDouble();
				
				media = ((x1*2) + (x2*3) + (x3*5)) / 10;
				
				System.out.println("A media ponderada é:"+ media);
			}
			
			sc.close();
		}

	}

}
