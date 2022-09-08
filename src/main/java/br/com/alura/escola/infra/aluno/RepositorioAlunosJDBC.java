package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.naming.PartialResultException;

import escola.Aluno;
import escola.Cpf;
import escola.RepositorioAluno;
import escola.Telefone;

public class RepositorioAlunosJDBC implements RepositorioAluno {

	private final Connection connection;

	public RepositorioAlunosJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void matricular(Aluno aluno) {
		String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, aluno.getCpf());
			prepareStatement.setString(2, aluno.getNome());
			prepareStatement.setString(3, aluno.getEmail());
			prepareStatement.execute();

			sql = "INSERT INTO TELEFONE VALUES(?, ?)";
			prepareStatement = connection.prepareStatement(sql);

			for (Telefone telefone : aluno.getTelefones()) {
				prepareStatement.setString(1, telefone.getDdd());
				prepareStatement.setString(2, telefone.getNumero());
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Aluno buscarPorCpf(Cpf cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
