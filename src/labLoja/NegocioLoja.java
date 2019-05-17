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
public class NegocioLoja {

    DadosLoja dados = new DadosLoja();

    public void cadastrarLoja(ClasseBasicaLoja l) throws Exception {
        if (l == null) {
            throw new Exception("Por favor, informe os dados da Loja");
        }

        if (l.getCodigoLoja() <= 0) {
            throw new Exception("Por favor, informe o código do loja corretamente");
        }
        if (l.getNomeLoja().length() <= 2) {
            throw new Exception("Por favor, informe o nome da loja corretamente");
        }

        if (l.getNomeLoja().equals(" ")) {
            throw new Exception("Por favor, informe o nome da loja corretamente");
        }
        if (l.getNomeLoja().equals("")) {
            throw new Exception("Por favor, informe o nome da loja corretamente");
        }

        if (l.getCnpjLoja().length() <= 0) {
            throw new Exception("Por favor, informe o CNPJ da loja corretamente");
        }
        if (l.getCnpjLoja().equals("")) {
            throw new Exception("Por favor, informe o CNPJ da loja corretamente");
        }
        if (l.getTelefoneLoja().equals("")) {
            throw new Exception("Por favor, Informe o telefone da loja corretamebte");
        }
        if (l.getTelefoneLoja().length() <= 0) {
            throw new Exception("Por favor, informe o telefone da loja corretamente");
        }
        if (l.getEnderecoLoja().length() <= 0) {
            throw new Exception("Por favor, informe o telefone da loja corretamente");
        }
        if (l.getEnderecoLoja().equals("")) {
            throw new Exception("Por favor, Informe o endereço da loja corretamebte");
        }
        if (l.getEnderecoLoja() == null) {
            throw new Exception("Por favor, informe o email corretamente. Exemplo: exemplo@email.com");
        }
        dados.cadastrarLoja(l);
    }

    public void removerLoja(ClasseBasicaLoja l) throws Exception {
        dados.removerLoja(l);

    }

    public void atualizarLoja(ClasseBasicaLoja l) throws Exception {
        if (l == null) {
            throw new Exception("Por Favor informar os dados da loja");
        }
        if (l.getCodigoLoja() <= 0) {
            throw new Exception("Por favor informe o código da loja");
        }

        if (l.getNomeLoja() == null) {
            throw new Exception("Por favor, informe o nome da loja.");
        }
        if (l.getNomeLoja().trim().equals("")) {
            throw new Exception("Por favor, informe o nome da loja.");
        }
        if (l.getNomeLoja().trim().equals(" ")) {
            throw new Exception("Por favor, informe o nome da loja.");
        }
        if (!l.getEnderecoLoja().trim().equals(" ")) {
            throw new Exception("Por favor, informe o endereço da loja");
        }
        if (l.getEnderecoLoja() == null) {
            throw new Exception("Por favor, informe o endereço da loja.");
        }
        if (l.getCnpjLoja() == null) {
            throw new Exception("Por favor, informe o CNPJ corretamente");
        }
        if ((l.getCnpjLoja().equals("")) || (l.getCnpjLoja().equals(" "))) {
            throw new Exception("Por favor, informe o CNPJ corretamente");
        }
        if (l.getTelefoneLoja() == null) {
            throw new Exception("Por favor, informe o telefone da loja corretamente");
        }
        if ((l.getTelefoneLoja().equals("")) || (l.getTelefoneLoja().equals(" "))) {
            throw new Exception ("Por favor, informe o telefone da loja corretamente");
        }
       
        if (l.ClasseBasicaCliente.getCodigoCliente() <= 0){
            throw new Exception ("Por favor, informe o código do cliente cuja a loja pertence");
        }
        

        dados.atualizarLoja(l);
    }

    public ArrayList<ClasseBasicaLoja> listarLoja(ClasseBasicaLoja lo) throws Exception {

        return dados.listarLoja(lo);
    }
}
