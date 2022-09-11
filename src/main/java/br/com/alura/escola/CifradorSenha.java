package br.com.alura.escola;

public interface CifradorSenha {
	
	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
