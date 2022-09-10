package br.com.alura.escola.infra.aluno;

import escola.CifradorSenha;

public class CifradorSenhaMD5 implements CifradorSenha {

	@Override
	public String cifrarSenha(String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
		return senhaCifrada.equals(cifrarSenha(senha));
	}

}
