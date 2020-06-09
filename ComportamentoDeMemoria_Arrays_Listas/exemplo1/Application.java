package exemplo1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Location[] rent = new Location[10];

		System.out.println("Quantos estudantes?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.printf("Insira o nome do aluno: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Insira o email do aluno: ");
			String email = sc.nextLine();
			
			System.out.print("Insira o quarto do aluno: ");
			int room = sc.nextInt();

			rent[room] = new Location(name, email);
		}

		for (int j = 0; j < 10; j++) {

			if (rent[j] != null) {
				System.out.println(rent[j]);
			}
		}

		sc.close();
	}

}
