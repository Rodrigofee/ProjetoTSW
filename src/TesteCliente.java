import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import labCliente.ClasseBasicaCliente;
import labCliente.DadosCliente;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

class TesteCliente {
	ArrayList<ClasseBasicaCliente> listaCliente = new ArrayList<ClasseBasicaCliente>();
	ClasseBasicaCliente cliente = new ClasseBasicaCliente();
	@Test
	void setup() {
		ArrayList<ClasseBasicaCliente> listaClienteArray = new ArrayList<ClasseBasicaCliente>();
		cliente.setCodigoCliente(1);
		cliente.setEmailCliente("raul@email.com");
		cliente.setNomeCliente("Raul");
		cliente.setTelefoneCliente("(81)91235-6555");
		listaClienteArray.add(cliente);
		try {
			DadosCliente daoFalsoCliente = mock(DadosCliente.class);
		
			when(daoFalsoCliente.buscarCliente(cliente)).thenReturn(true);
			assertEquals(true,daoFalsoCliente.buscarCliente(cliente));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void cadastrarClienteTeste() {
		ClasseBasicaCliente cliente = new ClasseBasicaCliente();
		ClasseBasicaCliente cliente2 = new ClasseBasicaCliente();
		
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
		assertEquals("819865465454", telefone);
		
		ArrayList<ClasseBasicaCliente> listaClienteArray2 = new ArrayList<ClasseBasicaCliente>();
		cliente2.setCodigoCliente(1);
		cliente2.setEmailCliente("raul@email.com");
		cliente2.setNomeCliente("Raul");
		cliente2.setTelefoneCliente("(81)91235-6555");
		listaClienteArray2.add(cliente2);
		
	}

}
