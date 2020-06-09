package estrutura_repetitiva_for;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		try( Scanner sc = new Scanner(System.in)){
			
			int n, i;
			
			System.out.println("Insira o valor de N");
			n = sc.nextInt();
			
			for(i=1; i<=n; i++) {
				
				System.out.println(i +" " + (int)Math.pow(i,2) +" "+ (int)Math.pow(i, 3));
				
			}

		}
		
	}

}
