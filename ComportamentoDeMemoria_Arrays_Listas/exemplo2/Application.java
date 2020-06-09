package exemplo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char op;

		List<Employee> list = new ArrayList<>();

		System.out.printf("Define the quantity of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.printf("What is the name of the Employee number " + n + "?: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.printf("What is the ID of the Employee number " + n + "?: ");
			int id = sc.nextInt();

			System.out.printf("What is the Salary of the Employee number " + n + "?: ");
			double salary = sc.nextDouble();

			list.add(new Employee(name, id, salary));

		}

		System.out.printf("");
		System.out.println("-----------Increasing Salary---------");

		do {

			System.out.printf("What is the Employees's ID: ");
			int id = sc.nextInt();

			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

			if (emp == null) {
				System.out.println("Employee not found / Aborting program");
				break;
			} else {

				System.out.printf("Define how much will increase in his salary: ");
				double perc = sc.nextDouble();
				emp.calculator(perc);
			}

			System.out.printf("Do you want to change another salary? ");
			op = sc.next().charAt(0);

			System.out.printf("");

		} while (op == 'S' || op == 's');

		System.out.println("list of Employees:");

		for (int i = 1; i <= list.size(); i++) {
			System.out.println(list);
		}

		for (Employee x : list) {
			System.out.println(x);
		}

		sc.close();
	}
}
