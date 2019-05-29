import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import labCliente.ClasseBasicaCliente;

class TesteCliente {

	@Test
	void cadastrarClienteTeste() {
		ClasseBasicaCliente cliente = new ClasseBasicaCliente();
		
		cliente.setCodigoCliente(4);
		cliente.setEmailCliente("mail@mail.com");
		cliente.setNomeCliente("Nome");
		cliente.setTelefoneCliente("819865465454");
		
		String nome = cliente.getNomeCliente();
		assertEquals("Nome", nome);
		
		int codigo = cliente.getCodigoCliente();
		assertEquals(4, codigo);
		
		String email = cliente.getEmailCliente();
		assertEquals("mail@mail.com", email);
		
		String telefone = cliente.getTelefoneCliente();
		assertEquals("Nome", telefone);
		
	}

}
