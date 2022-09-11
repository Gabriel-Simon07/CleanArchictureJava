package br.com.alura.escola.dominio.aluno;

public class FabricaAluno {
	private Aluno aluno;
	
	public FabricaAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(nome, new Cpf(cpf), new Email(email));
		return this;
	}
	
	public FabricaAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criarAluno() {
		return this.aluno;
	}
	
	public static void main(String[] args) {
		FabricaAluno aluno = new FabricaAluno();
		aluno.comNomeCPFEmail("", "", "").comTelefone("", "").comTelefone("", "").criarAluno();
	}
}
