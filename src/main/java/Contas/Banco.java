package Contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contasClientes=new ArrayList<Conta>();

	public Banco(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setContaClientes(Conta conta) {
		contasClientes.add(conta);
	}
	public List<Conta> getContaClientes() {
		return this.contasClientes;
		
	}
	
}
