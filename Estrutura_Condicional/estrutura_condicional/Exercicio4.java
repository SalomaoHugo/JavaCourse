package estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h1, h2, result;

		System.out.println("Insira que horas o jogo começou:");
		h1 = sc.nextInt();

		System.out.println("Insira que horas o jogo terminou:");
		h2 = sc.nextInt();

		if (h1 >= h2) {

			result = 24 - h1 + h2;

		} else {

			result = h2 - h1;

		}

		System.out.println("O jogo durou:" + result);

		sc.close();
	}

}
