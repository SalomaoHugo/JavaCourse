//Exemplo com MEMBRO ESTÁTICO
package exercício4;

public class Conversao {

	public static double DOLAR = 3.10;
	public static final double IOF = 0.06;
	
	
	public static double calculo(double qtd){
		
		return qtd * ((0.06 * DOLAR) + DOLAR);
		
	}
	
}
