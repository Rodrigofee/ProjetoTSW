import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import labLoja.ClasseBasicaLoja;
import labLoja.ClasseBasicaLoja.*;
import labLoja.DadosLoja;
import labLoja.NegocioLoja;


 class TesteLoja {
	 
	 ClasseBasicaLoja l;	
	 
	 @Before
		public void iniciarTeste() {

			l = new ClasseBasicaLoja();
		}
		
		@After
		public void afterTeste()
		{
			l = null;
		}
		
		@Test
		public void testCodigoOk() throws Exception {

			int codigo = 1;
			l.setCodigoLoja(codigo);

			assertEquals(codigo, l.getCodigoLoja());
		}
		public void testCodigoNull() throws Exception {

			int codigo = 0;
			

			try {
				l.setCodigoLoja(codigo);

			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null,e);
				
			}


		}
		
		@Test
		public void testNomeOk() throws Exception {

			String nome = "Loja Teste";
			l.setNomeLoja(nome);

			assertEquals(nome, l.getNomeLoja());

		}

		@Test
		public void testNomeNull() throws Exception {

			String nome = null;
			

			try {
				l.setNomeLoja(nome);

			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null,e);

			}


		}
		
		@Test
		public void testCNPJOk() throws Exception {

			String cnpj = "60.659.359/0001-05";
			l.setCnpjLoja(cnpj);

			assertEquals(cnpj, l.getCnpjLoja());

		}

		@Test
		public void testCNPJNull() throws Exception {

			String cnpj = null;
			

			try {
				l.setCnpjLoja(cnpj);

			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null,e);

			}


		}
		
		@Test
		public void testEnderecoOk() throws Exception {

			String endereco = "Rua Maria Testando";
			l.setEnderecoLoja(endereco);

			assertEquals(endereco, l.getEnderecoLoja());

		}

		@Test
		public void testEnderecoNull() throws Exception {

			String endereco = null;
			

			try {
				l.setEnderecoLoja(endereco);

			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null,e);

			}


		}
		
		@Test
		public void testTelefoneOk() throws Exception {

			String telefone = "81 97070-7575";
			l.setTelefoneLoja(telefone);

			assertEquals(telefone, l.getTelefoneLoja());

		}

		@Test
		public void testTelefoneNull() throws Exception {

			String telefone = null;
			

			try {
				l.setTelefoneLoja(telefone);

			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null,e);

			}


		}
		
		
		
		
		
		
		
	 @Test
	void cadastrarLoja() {
		 ClasseBasicaLoja loja = new ClasseBasicaLoja();
		 
		 loja.setCodigoLoja(1);
		 loja.setCnpjLoja("60.659.359/0001-05");
		 loja.setNomeLoja("Loja Teste");
		 loja.setEnderecoLoja("Rua Maria Testando");
		 loja.setTelefoneLoja("81 97070-7575");
		 
		 
	}

}
