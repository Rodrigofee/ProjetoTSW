import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import labLoja.ClasseBasicaLoja;
import labLoja.DadosLoja;

public class TesteLoja {
	
	ClasseBasicaLoja loja1;
	ArrayList<ClasseBasicaLoja> lojas = new ArrayList<ClasseBasicaLoja>();
	
	@Test
	public void cadastrarloja() {
		
		ClasseBasicaLoja loja = new ClasseBasicaLoja();
		loja.setCodigoLoja(12);
		loja.setNomeLoja("TESTE LOJA01");
		loja.setEnderecoLoja("RUA UNIBRATEC SL 01");
		loja.setTelefoneLoja("32412525");
		loja.setCnpjLoja("02.025.0001.12");
		
		int codigo = loja.getCodigoLoja();
		assertEquals(12, codigo);
		
		String nome = loja.getNomeLoja();
		assertEquals("TESTE LOJA01", nome);
		
		String endereco = loja.getEnderecoLoja();
		assertEquals("RUA UNIBRATEC SL 01", endereco);
		
		String telefone = loja.getTelefoneLoja();
		assertEquals ( "32412525", telefone);
		
		String cnpj = loja.getCnpjLoja();
		assertEquals("02.025.0001.12",cnpj);
				
	}
	
	@Test
	public void metodos() {
		DadosLoja daoFalsoLoja = mock(DadosLoja.class);
		lojas.add(loja1);
		
		try {
			when(daoFalsoLoja.listarLoja(loja1)).thenReturn(lojas);
			assertEquals(lojas,daoFalsoLoja.listarLoja(loja1));
			
			when(daoFalsoLoja.removerLoja(loja1)).thenReturn(true);
			assertEquals(true,daoFalsoLoja.removerLoja(loja1));
			
			when(daoFalsoLoja.atualizarLoja(loja1)).thenReturn(true);
			assertEquals(true,daoFalsoLoja.atualizarLoja(loja1));
			
			when(daoFalsoLoja.cadastrarLoja(loja1)).thenReturn(true);
			assertEquals(true,daoFalsoLoja.cadastrarLoja(loja1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	}
	
}
