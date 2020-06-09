package exerc�cio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		char resp;

		do {
			System.out.print("insira tamanho e altura do retangulo\n");

			retangulo.altura = sc.nextDouble();
			retangulo.largura = sc.nextDouble();

			
			System.out.printf("O valor da �rea �: " + retangulo);
			System.out.printf("\nO valor do per�metro �: " + retangulo.calcPeri());
			System.out.printf("\nO valor da diagonal �: " + retangulo.calcDiagonal());
			
			System.out.println("\nDo you want to continue?");
			resp = sc.next().charAt(0);
			
		} while (resp == 's' || resp == 'S');

		sc.close();
	}

}
