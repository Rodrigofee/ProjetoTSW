import labLoja.ClasseBasicaLoja;
import labPedido.ClasseBasicaPedido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import labCliente.ClasseBasicaCliente;

public class TestePedido {
	@Test
	void cadastrarPedido() {
		  
		ClasseBasicaLoja loja = new ClasseBasicaLoja(); 
		loja.setCnpjLoja("asdasdasd");
		loja.setCodigoLoja(12);
		loja.setEnderecoLoja("asdasd");
		loja.setNomeLoja("asdasdasd");
		loja.setTelefoneLoja("12312312312");
		ClasseBasicaCliente cliente = new ClasseBasicaCliente();
		
		ClasseBasicaPedido pedido = new ClasseBasicaPedido();
		pedido.setClasseBasicaLoja(loja);
		pedido.setDioptria_OD_Cil(12.2f);
		pedido.setDioptria_OD_Esf(13.4f);
		pedido.setDioptria_OE_Cil(15.2f);
		pedido.setDioptria_OE_Esf(17.5f);
		pedido.setNumeroPedido(00001);
		
		assertEquals(12, loja.getCodigoLoja());
		
		
		assertEquals(12.2f, pedido.getDioptria_OD_Cil());
		assertEquals(13.4f,pedido.getDioptria_OD_Esf());
		assertEquals(15.2f, pedido.getDioptria_OE_Cil());
		assertEquals(17.5f,pedido.getDioptria_OE_Esf());
		assertEquals(loja,pedido.getClasseBasicaLoja());
		
	}

}
