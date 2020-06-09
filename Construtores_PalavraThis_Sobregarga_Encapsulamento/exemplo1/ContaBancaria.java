package exemplo1;

public class ContaBancaria {

	private int numConta;
	private String nomeTitu;
	private double caixa;
	private static double TAXA = 5.00;

	public ContaBancaria(String nomeTitu, int numConta, double DepIni) {
		this.nomeTitu = nomeTitu;
		this.numConta = numConta;
		deposito(DepIni);
	}

	public ContaBancaria(String nomeTitu, int numConta) {
		this.nomeTitu = nomeTitu;
		this.numConta = numConta;
	}

	// GET COLOCADO, MAS N�O UTILIZADO
	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitu() {
		return nomeTitu;
	}

	public double getCaixa() {
		return caixa;
	}

	// SET COLOCADO SOMENTE NO NOME, POIS � O �NICO QUE PODE SER ALTERADO POSTERIORMENTE,
	// MAS N�O FOI UTILIZADO
	public void setNomeTitu(String nomeTitu) {
		this.nomeTitu = nomeTitu;
	}

	// OPERA��ES DE SAQUE E DEPOSITO
	public void deposito(double valor) {
		caixa = caixa + valor;
	}

	public void saque(double valor) {
		caixa -= valor + TAXA;

	}

	public String toString() {
		return "conta: " + numConta + ", Titular: " + nomeTitu + ", Valor em caixa: R$" + caixa;
	}

}
