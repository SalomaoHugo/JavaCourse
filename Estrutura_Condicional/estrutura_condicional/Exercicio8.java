package estrutura_condicional;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		double salario, imposto = 0;
		
		System.out.println("Insira o valor do salário");
		salario = sc.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}else if (salario > 2000 && salario <=3000) {
			
			imposto = (salario - 2000) * 0.08;
			
		}else if (salario > 3000 && salario <= 4500) {
	
			imposto = (salario - 3000) * 0.18 + (1000 * 0.08);	
			
		}else {
			
			imposto = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
			
		}
		
		System.out.printf("O imposto será de: %.2f%n", imposto);	
			
		sc.close();
	}

}
