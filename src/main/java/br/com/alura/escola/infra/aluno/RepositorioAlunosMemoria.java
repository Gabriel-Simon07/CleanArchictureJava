package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import escola.Aluno;
import escola.Cpf;
import escola.RepositorioAluno;

public class RepositorioAlunosMemoria implements RepositorioAluno {

	private List<Aluno> matriculas = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		matriculas.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(Cpf cpf) throws Exception {
		return matriculas.stream()
				.filter(aluno -> aluno.getCpf() == cpf.getCpf())
				.findFirst()
				.orElseThrow(() -> new Exception("Aluno não encontrado"));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return matriculas;
	}

}
