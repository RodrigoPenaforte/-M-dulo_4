package model;

import java.util.List;

public class login_cadastro {
	
	private int id;
	private String nome;
	private String cpf;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "login_cadastro [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	public void add(List<login_cadastro> login) {
		// TODO Auto-generated method stub
		
	}
	
	

}
