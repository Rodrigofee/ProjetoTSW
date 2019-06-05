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
public interface InterfacePedido {
    
	boolean cadastrarPedido(ClasseBasicaPedido p) throws Exception;
    boolean atualizarPedido(ClasseBasicaPedido p) throws Exception;
    boolean removerPedido(ClasseBasicaPedido p) throws Exception;
    ArrayList<ClasseBasicaPedido> listarPedido(ClasseBasicaPedido p) throws Exception;
}
