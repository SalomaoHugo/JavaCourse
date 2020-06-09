package exercício1;

public class Retangulo {

	public double altura, largura;
	
	public double calcArea() {
		
		return altura * largura;
		
	}
	
	public double calcPeri() {
		
		return (altura * 2) + (largura * 2);
		
	}
	
	public double calcDiagonal() {
		
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2) );
		
	}
	
}
