package exerc�cio4;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Defina a qtd de dolares que voc� ir� comprar:");
		double qtd = sc.nextDouble();

		//No m�todo de Vari�vel est�tica n�o se Instancia, mas � se cria uma vari�vel como abaixo:
		double c = Conversao.calculo(qtd);
		
		System.out.printf("Voc� ir� comprar: %.2f", c);
		
		sc.close();
	}

}
