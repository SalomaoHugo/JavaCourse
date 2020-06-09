package estrutura_sequencial;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		double sal, val, hr;
		
		System.out.println("Digite o código do funcionário: ");
		n = sc.nextInt();
		System.out.println("Digite as horas trabalhadas do funcionário: ");
		hr = sc.nextInt();	
		System.out.println("Digite o valor que ele recebe por hora");
		val = sc.nextDouble();
		
		sal = val * hr;
		
		System.out.printf("O salário do funcionário: %d é de %.2f%n", n, sal);
		
		sc.close();
	}

}
