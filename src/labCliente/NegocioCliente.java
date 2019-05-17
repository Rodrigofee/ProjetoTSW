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
public class NegocioCliente {

    public void cadatrarCliente(ClasseBasicaCliente c) throws Exception {
        if (c == null) {
            throw new Exception("Por Favor informar os dados do Cliente");
        }
        if (!(c.getNomeCliente().contains(" ")) || !(c.getNomeCliente().length() >= 2)) {
            throw new Exception("O nome deve conter pelo menos uma sílaba e um composto");
        }
        if (c.getNomeCliente() == null) {
            throw new Exception("Por favor, informe o nome do Cliente.");
        }
        if (c.getNomeCliente().trim().equals("")) {
            throw new Exception("Por favor, informe o nome do Cliente.");
        }
        if (c.getNomeCliente().trim().equals(" ")) {
            throw new Exception("Por favior, informe o nome do Cliente.");
        }
        if (!c.getEmailCliente().contains("@")) {
            throw new Exception("Informe um email válido. Exemplo: exemplo@email.com ");
        }
        if (c.getEmailCliente() == null) {
            throw new Exception("Por favor, informe o email do Cliente.");
        }
        if (!c.getEmailCliente().contains(".com")) {
            throw new Exception("Informe um email válido. Exemplo exemplo@email.com");
        }
        if ((c.getEmailCliente().trim().equals(" ")) || (c.getEmailCliente().trim().equals(""))) {
            throw new Exception("Por favor, informe o email do Cliente.");
        }
        if (c.getTelefoneCliente() == null) {
            throw new Exception("Por favor, informe o telefone do Cliente.");
        }
        if ((c.getTelefoneCliente().trim().equals("")) || (c.getTelefoneCliente().trim().equals(" "))) {
            throw new Exception("Por favor, informe o telefone do Cliente.");
        }
        DadosCliente dados = new DadosCliente();
        dados.cadastrarCliente(c);
    }

    public void removerCliente(ClasseBasicaCliente c) throws Exception {
        DadosCliente dados = new DadosCliente();
        dados.removerCliente(c);

    }

    public void atualizarCliente(ClasseBasicaCliente c) throws Exception {
        DadosCliente dados = new DadosCliente();
        if (dados.buscarCliente(c) == true) {

            if (c == null) {
                throw new Exception("Por Favor informar os dados do Cliente");
            }
            if (c.getCodigoCliente() <= 0) {
                throw new Exception("Por favor informe o código do Cliente");
            }
            if (!(c.getNomeCliente().contains(" ")) || !(c.getNomeCliente().length() >= 2)) {
                throw new Exception("O nome deve conter pelo menos uma sílaba e um composto");
            }
            if (c.getNomeCliente() == null) {
                throw new Exception("Por favor, informe o nome do Cliente.");
            }
            if (c.getNomeCliente().trim().equals("")) {
                throw new Exception("Por favor, informe o nome do Cliente.");
            }
            if (c.getNomeCliente().trim().equals(" ")) {
                throw new Exception("Por favior, informe o nome do Cliente.");
            }
            if (!c.getEmailCliente().contains("@")) {
                throw new Exception("Informe um email válido. Exemplo: exemplo@email.com ");
            }
            if (c.getEmailCliente() == null) {
                throw new Exception("Por favor, informe o email do Cliente.");
            }
            if (!c.getEmailCliente().contains(".com")) {
                throw new Exception("Informe um email válido. Exemplo exemplo@email.com");
            }
            if ((c.getEmailCliente().trim().equals(" ")) || (c.getEmailCliente().trim().equals(""))) {
                throw new Exception("Por favor, informe o email do Cliente.");
            }
            if (c.getTelefoneCliente() == null) {
                throw new Exception("Por favor, informe o telefone do Cliente.");
            }
            if ((c.getTelefoneCliente().trim().equals("")) || (c.getTelefoneCliente().trim().equals(" "))) {
                throw new Exception("Por favor, informe o telefone do Cliente.");
            }

            dados.atualizarCliente(c);
        } else {
            throw new Exception("Erro de busca");

        }
    }

    public ArrayList<ClasseBasicaCliente> listarCliente(ClasseBasicaCliente lista) throws Exception {
        DadosCliente dados = new DadosCliente();
        return dados.listarCliente(lista);

    }

}
