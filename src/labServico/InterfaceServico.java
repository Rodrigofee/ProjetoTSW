/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labServico;

import java.util.ArrayList;


/**
 *
 * @author PedroCristovam
 */
public interface InterfaceServico {
    //objetivo: cadastrar um Servico na tabela Serviço
    void cadastrarServico(ClasseBasicaServico s) throws Exception;
    void atualizarServico(ClasseBasicaServico s) throws Exception;
    void removerServico(ClasseBasicaServico s) throws Exception;
    ArrayList<ClasseBasicaServico> listarServico(ClasseBasicaServico s) throws Exception;
}
    

