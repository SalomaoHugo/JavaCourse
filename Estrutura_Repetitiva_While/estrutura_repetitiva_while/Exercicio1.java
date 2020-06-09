package estrutura_repetitiva_while;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int senha = 2002, tent;
		
		tent = sc.nextInt();
		
		while (tent != senha) {
			
			System.out.println("tente novamente:");
			tent = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		sc.close();
	}

}
