package exemplo2;

public class Employee {

	private String name;
	private double salary;
	private int id;

	// Construtores
	public Employee() {
	}

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Stters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void calculator(double percentage) {
		this.salary = salary * percentage / 100;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

	
}
