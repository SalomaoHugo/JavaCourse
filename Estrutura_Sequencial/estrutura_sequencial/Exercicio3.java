package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D;
		int dif;

		System.out.println("Insira os valores de A, B, C, D Respectivamente");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		dif = (A * B) - (C * D);

		System.out.println("A diferença dos produtos é:" + dif);

		sc.close();

	}

}
