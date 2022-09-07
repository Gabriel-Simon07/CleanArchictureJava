package escola;

public class Cpf {
	private String cpf;

	public Cpf(String cpf) {
		if(cpf == null || !cpf.matches("\\\\d{3}\\\\.\\\\d{3}\\\\.\\\\d{3}\\\\-\\\\d{2}")) {
			throw new IllegalArgumentException("CPF inválido!");
		}
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
