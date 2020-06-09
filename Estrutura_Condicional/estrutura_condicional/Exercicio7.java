package estrutura_condicional;
import java.util.Scanner;



public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x, y;
		
		System.out.println("Defina os valores de x e y respectivamente?");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x==0 && y==0) {
		
			System.out.println("Origem");
			
		}else if (x == 0.0) {
			
			System.out.println("Eixo Y");
				
		}else if (y == 0.0) {
				
			System.out.println("Eixo X");
			
		}else if(x>=0 && y>=0) {
			
			System.out.println("1º quadrante");
			
		}else if(x<0 && y>=0) {
		
			System.out.println("2º quadrante");
			
		}else if(x>=0 && y<0) {
			
			System.out.println("4º quadrante");
			
		}else if(x<0 && y<0) {
			
			System.out.println("3º quadrante");
			
		}
		
		sc.close();
	}

}
