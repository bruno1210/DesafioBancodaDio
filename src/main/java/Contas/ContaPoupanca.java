package Contas;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente, int senha) {
		super(cliente, senha);
	}

	@Override
	public void imprimirExtrato(Conta conta) {
		System.out.println("*** Conta Poupança ***");
		super.imprimirExtrato(conta);
	}
	
	
}
