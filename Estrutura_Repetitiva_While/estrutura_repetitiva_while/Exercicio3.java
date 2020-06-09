package estrutura_repetitiva_while;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod, alc = 0, gas = 0, die = 0;

		System.out.println("Informe o código desejado");
		cod = sc.nextInt();

		while (cod != 4) {
			switch (cod) {
			case 1:
				cod = 1;
				alc++;
				break;
			case 2:
				cod = 2;
				gas++;
				break;
			case 3:
				cod = 3;
				die++;
				break;
			default:
				System.out.println("Código digitado inválido");
				break;
			}
			System.out.println("Informe o código desejado");
			cod = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO %nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alc, gas, die);
		sc.close();
	}
}
