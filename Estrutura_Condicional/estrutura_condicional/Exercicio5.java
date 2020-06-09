package estrutura_condicional;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cod, qtd;
		
		System.out.println("Código / Especificação /  Preço  ");
		System.out.println(" 1     / Cachorro qu.  /  R$4,00  ");
		System.out.println(" 2     / X-Salada      /  R$4,50  ");
		System.out.println(" 3     / X-Bacon       /  R$5,00  ");
		System.out.println(" 4     / Torrada Simp. /  R$2,00  ");
		System.out.println(" 5     / Refrigerante  /  R$1,50  ");
		
		System.out.println("Digite o código do produto: ");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade ");
		qtd = sc.nextInt();
		
		if (cod == 1) {
			
			System.out.println("O valor total é de:" + 4 * qtd);
			
		}else if(cod == 2) {
			
			System.out.println("O valor total é de:" + 4.5 * qtd);
			
		}else if(cod == 3) {
			
			System.out.println("O valor total é de:" + 5 * qtd);
			
		}else if(cod == 4) {
		
			System.out.println("O valor total é de:" + 2 * qtd);
			
		}else if(cod == 5) {
			
			System.out.println("O valor total é de:" + 1.5 * qtd);
			
		}else {
			
			System.out.println("Código inválido *Saindo do programa*");
			
		}
		
		sc.close();
	}

}
