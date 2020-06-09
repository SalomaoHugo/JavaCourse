package exercicio3;

public class Aluno {

	String name;
	double nota1, nota2, nota3;
	
	public double calcNota() {
		double nota;
		
		nota = ((nota1 *30) + (nota2 *35) + (nota3 *35)) / 100;
		
		return nota;
	}
	
	public double analise() {
		
		return 6 - calcNota();
	
	}
	
}
