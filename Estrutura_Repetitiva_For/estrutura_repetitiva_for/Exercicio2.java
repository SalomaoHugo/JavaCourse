package estrutura_repetitiva_for;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int i, x = 0, n, in=0, out=0;

			System.out.println("Defina a quantidade de valores ");
			n = sc.nextInt();

			for (i = 0; i < n; i++) {
				System.out.println(i + 1 + "º valor");
				x = sc.nextInt();
				
				if (x >= 10 && x <= 20) {
					in ++;
				} else {
					out++;
				}
			}
			
			System.out.println("in:"+in+"\nout:"+out);

			sc.close();
		}
	}

}
