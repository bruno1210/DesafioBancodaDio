package Contas;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TesteBanco{

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Cliente cliente2=new Cliente("ana", "23272443212", "araçatuba-sp");
		Conta conta2=new ContaCorrente(cliente2,1210);
		
		System.out.println("Seja Bem vindo");
		System.out.println("Vamos criar sua conta.Primeiro precisamos saber seu nome:");
		String nomeCliente=entrada.next();
		System.out.println("Muito bem senhor(a) " + nomeCliente + ".Agora precisamos que voce digite seu CPF.");
		String cpfCliente=entrada.next();
		System.out.println("Agora só falta a cidade onde voce mora:");
		String enderecoCliente=entrada.next();
		
		Cliente cliente1=new Cliente(nomeCliente, cpfCliente, enderecoCliente);
		
		System.out.println("Estamos quase la.Agora precisamos de uma senha para sua conta.Escolha uma senha de 4 digitos:");
		int senhaConta=entrada.nextInt();
		
		System.out.println("Precisamos saber qual o tipo de conta que voce deseja criar.");
		System.out.println("Digite 1 para conta corrente ou 2 para conta poupança.");
		int tipoConta=entrada.nextInt();
		Conta conta1 = null;
		if(tipoConta==1) {
			Conta cc=new ContaCorrente(cliente1,senhaConta);
			conta1=cc;
		}
		if(tipoConta==2) {
			Conta cp=new ContaPoupanca(cliente1,senhaConta);
			conta1=cp;
		}
		else {
			System.out.println("Por favor digite uma alternativa valida");
		}
		
		System.out.println("Parabens " + cliente1.getNome().toUpperCase() + " sua conta foi criada com sucesso");
		conta1.depositar(200);
		conta1.imprimirExtrato(conta1);
		conta1.sacar(100);
		conta2.depositar(500);
		conta2.transferir(200, conta1);
		
		conta1.imprimirExtrato(conta1);
		conta2.imprimirExtrato(conta2);
		
		System.out.println("_________________");
		
		Banco banco1=new Banco("Santander");
		banco1.setContaClientes(conta1);
		banco1.setContaClientes(conta2);
		
		banco1.getContaClientes();
		
		
	}
}
