package exercicio2;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Employee employee = new Employee();
		
		System.out.println("Digite o nome do Funcionário");
		employee.name = sc.nextLine();
		
		System.out.println("Digite o valor do seu salário");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Digite o valor do imposto");
		employee.tax = sc.nextDouble();
		
		System.out.println ("employee: " + employee);
		
		System.out.println("insira a porcentagem de acrescimo:");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println ("employee: " + employee);
		
		
		sc.close();
	}

}
