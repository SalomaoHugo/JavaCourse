package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r;
		double area, pi = 3.14159;

		System.out.println("Insira o valor do raio do circulo:");
		r = sc.nextDouble();

		area = (pi) * (Math.pow(r, 2));

		System.out.printf("O valor da área é de: %.4f%n", area);

		sc.close();
	}

}
