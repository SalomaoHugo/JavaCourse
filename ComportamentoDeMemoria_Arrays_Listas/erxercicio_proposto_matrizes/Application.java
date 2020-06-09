package erxercicio_proposto_matrizes;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		char confirma;
		int cont = 0;
		
		System.out.print("Defina o valor da Linhas: ");
		int l = sc.nextInt();
		System.out.print("Defina o valor de Colunas: ");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for(l = 0; l<mat.length; l++) {
			for(c = 0; c<mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		do {
			
			System.out.printf("informe o número desejado da Matriz:");
			int x = sc.nextInt();
			
			for(l = 0; l<mat.length; l++) {
				for(c = 0; c<mat[l].length; c++) {
					if(x == mat[l][c]) {
						
						if(c != 0) {
						System.out.println("Número a esquerda: " + mat[l][c-1] + " ");
						}
						if(c < mat[l].length-1) {
						System.out.println("Número a direita: " + mat[l][c+1] + " ");
						}
						if(l != 0) {
						System.out.println("Número acima: " + mat[l-1][c] + " ");
						}
						if(l < mat[c].length-1) {
							System.out.println("Número abaixo: " + mat[l+1][c] + " ");
						}
						cont = cont+1;
					}		
				}
			}
			
			if(cont==0) {
				System.out.println("O número informado não existe na matriz");
			}
			
			
			System.out.print("Você quer tentar outro numero? ");
			confirma = sc.next().charAt(0);
			
		}while(confirma !='s' || confirma !='S');
		
		
		sc.close();
	}
}
