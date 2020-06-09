package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Aluno aluno = new Aluno ();
		
		System.out.println("Insira o nome do aluno");
		aluno.name = sc.nextLine();
		
		System.out.println("Insira as tres notas dele do semestre");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		
		System.out.println("A nota final do aluno é: " + aluno.calcNota());

		if(aluno.calcNota() >= 6) {
			
			System.out.println("Aluno Aprovado");
			
		}else {
			
			System.out.printf("Aluno %s Reprovado. ", aluno.name);
			System.out.printf("Ele precisa de %.2f pra passar", aluno.analise());
		}
		sc.close();
	}

}
