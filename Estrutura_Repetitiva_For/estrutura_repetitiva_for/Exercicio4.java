package estrutura_repetitiva_for;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int qtd, x1, x2, i;
			
			System.out.println("Insira a quantidade de pares:");
			qtd = sc.nextInt();
			
			for (i=0; i<qtd; i++ ) {
				
				System.out.printf("insira o 1� valor do %do par", i+1);
				x1 = sc.nextInt();
				
				System.out.printf("insira o 2� valor do %do par", i+1);
				x2 = sc.nextInt();
				
				if (x2==0) {
					
					System.out.println("divis�o imposs�vel");
					
				}else {
					
					System.out.println("o valor da divis�o de "+ x1 +" por " + x2 + " �: " + (double) x1/x2 + "\n");
					
				}
				
			}
			
			sc.close();
		}

	}

}
