package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.RepositorioAluno;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;

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
