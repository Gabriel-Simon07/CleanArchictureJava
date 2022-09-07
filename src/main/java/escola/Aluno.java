package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private Cpf cpf;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	
	public Aluno(String nome, Cpf cpf, Email email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String telefone) {
		if(ddd == null || telefone == null) {
			throw new IllegalArgumentException("DDD e telefone são obrigatórios");
		}
		if(!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD inválido");
		}
		if(telefone.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Número inválido");
		}
		
		 this.telefones.add(new Telefone(ddd, telefone));
	}
}
