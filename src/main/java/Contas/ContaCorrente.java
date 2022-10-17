package Contas;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, int senha) {
		super(cliente, senha);
	}

	@Override
	public void imprimirExtrato(Conta conta) {
		System.out.println("*** Conta Corrente");
		super.imprimirExtrato(conta);
	}

	
	

}
