package escola;

public class Telefone {
	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {
		if(ddd == null || !ddd.matches("\\d{3}") && (numero == null || numero.matches("\\d{9}"))) {
			throw new IllegalArgumentException("Número inválido!");
		}
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
