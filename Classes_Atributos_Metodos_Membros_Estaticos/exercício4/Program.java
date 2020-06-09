package exercício4;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Defina a qtd de dolares que você irá comprar:");
		double qtd = sc.nextDouble();

		//No método de Variável estática não se Instancia, mas é se cria uma variável como abaixo:
		double c = Conversao.calculo(qtd);
		
		System.out.printf("Você irá comprar: %.2f", c);
		
		sc.close();
	}

}
