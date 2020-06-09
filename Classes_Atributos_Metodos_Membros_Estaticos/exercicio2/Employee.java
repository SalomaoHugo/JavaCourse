package exercicio2;

public class Employee {

	String name;
	double grossSalary, tax;

	public double netSalary() {

		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {

		this.grossSalary = percentage/100 * grossSalary + grossSalary;
		
	}
	
	public String toString() {
		
		return name + ", " + netSalary();
		
		}

}
