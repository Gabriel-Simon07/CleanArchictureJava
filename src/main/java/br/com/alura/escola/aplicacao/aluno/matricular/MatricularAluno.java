package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.RepositorioAluno;
import br.com.alura.escola.dominio.aluno.Aluno;

public class MatricularAluno {

	private final RepositorioAluno aluno;

	public MatricularAluno(RepositorioAluno aluno) {
		this.aluno = aluno;
	}
	
	public void matricular(MatricularAlunoDTO matricular) {
		Aluno aluno = matricular.criarAluno();
		this.aluno.matricular(aluno);
	}
}
