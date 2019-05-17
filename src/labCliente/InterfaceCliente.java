/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labCliente;

import java.util.ArrayList;

/**
 *
 * @author PedroCristovam
 */
public interface InterfaceCliente {

    //objetivo: cadastrar um client na tabela cliente
    void cadastrarCliente(ClasseBasicaCliente c) throws Exception;

    void atualizarCliente(ClasseBasicaCliente c) throws Exception;

    void removerCliente(ClasseBasicaCliente c) throws Exception;

    ArrayList<ClasseBasicaCliente> listarCliente(ClasseBasicaCliente c) throws Exception;
}
