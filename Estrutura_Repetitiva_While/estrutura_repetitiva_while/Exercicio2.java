package estrutura_repetitiva_while;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x, y;
		
		System.out.println("Insira as coordenadas X e Y respectivamente");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x!=0 && y!=0) {
			
			if(x>=0 && y>=0) {
				
				System.out.println("1� quadrante");
				
			}else if(x<0 && y>=0) {
			
				System.out.println("2� quadrante");
				
			}else if(x>=0 && y<0) {
				
				System.out.println("4� quadrante");
				
			}else if(x<0 && y<0) {
				
				System.out.println("3� quadrante");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
	}

}
