/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labPedido;

import java.util.ArrayList;

/**
 *
 * @author PedroCristovam
 */
public class NegocioPedido {

    DadosPedido dados = new DadosPedido();

    public void cadastrarPedido(ClasseBasicaPedido p) throws Exception {

        if (p == null) {
            throw new Exception("Por favor, informe os dados do pedido corretamente");
        }

        if (p.getClasseBasicaLoja() == null) {
            throw new Exception("Por favor, informe o código da loja");
        }

        if (p.getNumeroPedido() <= 0) {
            throw new Exception("Por favor, informe o número do pedido");
        }

        dados.cadastrarPedido(p);

    }

    public void removerPedido(ClasseBasicaPedido p) throws Exception {
        dados.removerPedido(p);
    }

    public void atualizarPedido(ClasseBasicaPedido p) throws Exception {
        if (p == null) {
            throw new Exception("Por favor, informe os dados do pedido corretamente");
        }

        if (p.getClasseBasicaLoja() == null) {
            throw new Exception("Por favor, informe o código da loja");
        }

        if (p.getNumeroPedido() <= 0) {
            throw new Exception("Por favor, informe o número do pedido");
        }
        dados.atualizarPedido(p);
    }

    public ArrayList<ClasseBasicaPedido> listarPedido(ClasseBasicaPedido lista) throws Exception {
        return dados.listarPedido(lista);
    }

}
