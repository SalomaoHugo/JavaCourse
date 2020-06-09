package estrutura_sequencial;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cod1, qnt1, cod2, qnt2;
		double valor1, valor2, calculo;
		
		System.out.println("Informe o código, qnt e valor da peça 1 (Respectivamente):");
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		System.out.println("Informe o código, qnt e valor da peça 2 (Respectivamente):");
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		calculo = (qnt1 * valor1) + (qnt2 * valor2);
		
		System.out.printf("O valor a ser pago nos produtos %d e %d é de: %.2f%n", cod1, cod2, calculo);
		
		sc.close();
	}

}
