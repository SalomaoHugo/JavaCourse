package estrutura_sequencial;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double A, B, C;
		
		
		System.out.println("Insira os Valores de A, B, C");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("Triangulo: %.3f%n", A*B/2);
		System.out.printf("Circulo: %.3f%n",  3.14159 * Math.pow(C, 2) );
		System.out.printf("Trapézio: %.3f%n", ((A+B)*C)/2);
		System.out.printf("Quadrado: %.3f%n", Math.pow(B, 2));
		System.out.printf("Retangulo: %.3f%n", A*B);
		
		sc.close();
	}

}
