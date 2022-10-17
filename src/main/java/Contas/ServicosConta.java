package Contas;

public interface ServicosConta {
	void sacar(double valor);
	void transferir(double valor,Conta conta);
	void imprimirExtrato(Conta conta);
	void depositar(double valor);
}
