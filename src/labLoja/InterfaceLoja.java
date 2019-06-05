/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labLoja;

import java.util.ArrayList;


/**
 *
 * @author PedroCristovam
 */
public interface InterfaceLoja {
    
  //objetivo: cadastrar um client na tabela Loja
    boolean cadastrarLoja(ClasseBasicaLoja l) throws Exception;
    boolean atualizarLoja(ClasseBasicaLoja l) throws Exception;
    boolean removerLoja(ClasseBasicaLoja l) throws Exception;
    ArrayList<ClasseBasicaLoja> listarLoja(ClasseBasicaLoja l) throws Exception;
}
