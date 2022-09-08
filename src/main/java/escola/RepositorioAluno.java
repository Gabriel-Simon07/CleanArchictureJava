package escola;

import java.util.List;

public interface RepositorioAluno {

	void matricular(Aluno aluno);

	Aluno buscarPorCpf(Cpf cpf) throws Exception;
	
	List<Aluno> listarTodosAlunosMatriculados();
}
