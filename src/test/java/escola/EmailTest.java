package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailComEnderecoNulo() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
	}

	@Test
	void naoDeveriaCriarEmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email("admin2021.com.br"));
	}
	
	@Test
	void naoDeveriaCriarEmailComEnderecoEmBranco() {
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
	}
}
