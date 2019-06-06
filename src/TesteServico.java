import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import static org.mockito.Mockito.*;
import org.junit.Test;

import labPedido.ClasseBasicaPedido;
import labServico.ClasseBasicaServico;
import labServico.DadosServico;


 public class TesteServico {
	
	 ArrayList<ClasseBasicaServico> listaServicos = new ArrayList<ClasseBasicaServico>();
	 ClasseBasicaServico servico;
	 
	@Test
	public void cadastrarServico() {
		ClasseBasicaPedido pedido = new ClasseBasicaPedido();
		pedido.setNumeroPedido(123456);
		pedido.setDioptria_OD_Cil(12.2f);
		pedido.setDioptria_OD_Esf(13.3f);
		pedido.setDioptria_OE_Cil(14.7f);
		pedido.setDioptria_OE_Esf(6.25f);
		pedido.setNumeroPedido(123456);
	
		
		ClasseBasicaServico servico = new ClasseBasicaServico();
		servico.setCodigoServico(123654);
		servico.setDataEntrada("05/06/2019");
		servico.setDataSaida("13/06/2019");
		servico.setStatusServico("Aberto");
		servico.setValorServico(100.00f);
		
		//assertEquals(pedido, servico.getClasseBasicaPedido());
		assertEquals(123654, servico.getCodigoServico());
		assertEquals("05/06/2019", servico.getDataEntrada());
		assertEquals("13/06/2019", servico.getDataSaida());
		assertEquals("Aberto", servico.getStatusServico());
		assertEquals(100.00f, servico.getValorServico());
		
	}
	
	@Test
	public void metodos(){
		DadosServico daoFalsoServico = mock(DadosServico.class);
		listaServicos.add(servico);
		try {
			when(daoFalsoServico.listarServico(servico)).thenReturn(listaServicos);
			assertEquals(listaServicos,daoFalsoServico.listarServico(servico));
			
			when(daoFalsoServico.removerServico(servico)).thenReturn(true);
			assertEquals(true,daoFalsoServico.removerServico(servico));
			
			when(daoFalsoServico.atualizarServico(servico)).thenReturn(true);
			assertEquals(true,daoFalsoServico.atualizarServico(servico));
			
			when(daoFalsoServico.cadastrarServico(servico)).thenReturn(true);
			assertEquals(true,daoFalsoServico.cadastrarServico(servico));
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

}
