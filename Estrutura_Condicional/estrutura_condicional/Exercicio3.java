package estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A, B;

		System.out.println("Insira o valor A e B respectivamente:");
		A = sc.nextInt();
		B = sc.nextInt();

		if (A > B) {
			if (A % B == 0) {
				System.out.println("São Multiplos");
			} else {
				System.out.println("Não são multiplos");
			}
		} else {
			if (B % A == 0) {
				System.out.println("São Multiplos");
			} else {
				System.out.println("Não são Multiplos");
			}
		}

		sc.close();
	}

}
