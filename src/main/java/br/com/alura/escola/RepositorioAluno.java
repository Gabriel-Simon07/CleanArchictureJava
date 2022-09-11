package br.com.alura.escola;

import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;

public interface RepositorioAluno {

	void matricular(Aluno aluno);

	Aluno buscarPorCpf(Cpf cpf) throws Exception;
	
	List<Aluno> listarTodosAlunosMatriculados();
}
