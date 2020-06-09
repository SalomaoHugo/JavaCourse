package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int total;

		System.out.println("Insira o valor de X:");
		x = sc.nextInt();

		System.out.println("Insira o valor de Y:");
		y = sc.nextInt();

		total = x + y;

		System.out.println(x + "+" + y + "=" + total);

		sc.close();
	}
}
