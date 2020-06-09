package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int x, cont;

			System.out.println("Insira o valor de X");
			x = sc.nextInt();

			if (x > 0 && x <= 1000) {
				for (cont = 0; cont < x; cont++) {
					if (cont%2!=0) {
						System.out.println(cont);
					}
				
				}
			}
			
			sc.close();
		}

	}

}
