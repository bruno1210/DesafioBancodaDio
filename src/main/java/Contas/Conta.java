package Contas;

public class Conta implements ServicosConta{
	
	private static int SEQUENCIAL=1;
	private static int AGENCIA=1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo=0;
	protected int senha;
	protected Cliente cliente;
	
	
	
	public Conta(Cliente cliente,int senha) {
		this.agencia =AGENCIA++;
		this.numeroConta =SEQUENCIAL++;
		this.senha = senha;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	

	@Override
	public String toString() {
		return "cliente: " + cliente.getNome() + 
				" Numero da Conta: " + this.numeroConta + 
				" Agencia Conta: " + this.agencia + " saldo: " + this.saldo 
				;
	}

	@Override
	public void sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			System.out.println("Saque efetuado com suceeso");
		}else {
			System.out.println("Seu saldo é insuficiente para sacar esse valor");
		}
	}

	@Override
	public void transferir(double valor, Conta conta) {
		if(this.saldo>=valor) {
			this.sacar(valor);
			conta.saldo+=valor;
			System.out.println("Transferencia feita com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void imprimirExtrato(Conta conta) {
		System.out.println(conta.toString());
	}

	@Override
	public void depositar(double valor) {
		this.saldo+=valor;
	}

	
	
}
