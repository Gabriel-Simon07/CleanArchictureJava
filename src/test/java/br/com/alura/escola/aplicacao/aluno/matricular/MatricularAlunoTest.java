package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.infra.aluno.RepositorioAlunosMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() throws Exception {
		RepositorioAlunosMemoria alunoEmMemoria = new RepositorioAlunosMemoria();
		MatricularAluno aluno = new MatricularAluno(alunoEmMemoria);
		MatricularAlunoDTO alunoDTO = new MatricularAlunoDTO("fulano", "123.123.123-23", "admin@com.com.br");
		aluno.matricular(alunoDTO);

		Aluno buscarPorCpf = alunoEmMemoria.buscarPorCpf(new Cpf("123.123.123-23"));
		
		assertEquals("fulano", buscarPorCpf.getNome());
		assertEquals("123.123.123-23", buscarPorCpf.getCpf());
	}
}
