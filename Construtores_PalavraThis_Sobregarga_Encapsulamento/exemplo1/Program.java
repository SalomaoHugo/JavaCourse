package exemplo1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char op;
		ContaBancaria conta;
		
		do {

			System.out.printf("Insira o número da conta: ");
			int contaNum = sc.nextInt();

			System.out.printf("Digite o Nome do titular da Conta: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.printf("Deseja iniciar com um depósito? ");
			char dp = sc.next().charAt(0);

			if (dp == 's' || dp == 'S') {
				System.out.printf("Quanto deseja Inserir? ");
				double inicDep = sc.nextDouble();
				conta = new ContaBancaria(name, contaNum, inicDep);
			} else {
				conta = new ContaBancaria(name, contaNum);
			}

			
			System.out.println("Atualização da conta:");
			System.out.println(conta);

			System.out.printf("Insira o valor do depósito? ");
			double depValor = sc.nextDouble();
			conta.deposito(depValor);

			System.out.println("Atualização da conta:");
			System.out.println(conta);
			
			System.out.printf("Insira o valor do Saque? ");
			double saqueValor = sc.nextDouble();
			conta.saque(saqueValor);
			
			System.out.printf("Atualização da conta:");
			System.out.println(conta);

			System.out.println("Você quer repetir?");
			op = sc.next().charAt(0);

		} while (op == 's' || op == 'S');

		sc.close();
	}
}
