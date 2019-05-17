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
public class NegocioServico {

    DadosServico dados = new DadosServico();

    public void cadastrarServico(ClasseBasicaServico s) throws Exception {

        
        if (s.getDataEntrada() == null) {
            throw new Exception("Por favor, informe os dados do serviço corretamente.");
        }

        if (s.getDataSaida() == null) {
            throw new Exception("Por favor, informe os dados do serviço corretamente.");
        }

        if (s.getStatusServico() == null) {
            throw new Exception("Por favor, informe os dados do serviço corretamente.");
        }

        if (s.getDataEntrada().length() <= 7) {
            throw new Exception("Por favor, informe a data completa. Exemplo 13/12/2017");
        }

        if (s.getDataSaida().length() <= 7) {
            throw new Exception("Por favor, informe a data completa. Exemplo 13/12/2017");
        }

        if ((s.getStatusServico().equals(" ")) || (s.getStatusServico().equals(""))) {
            throw new Exception("Por favor, informe o status do serviço");
        }

        if (s.getValorServico() <= 0) {
            throw new Exception("Por favor, informe o valor do serviço");
        }

        dados.cadastrarServico(s);
    }

    public void removerServico(ClasseBasicaServico s) throws Exception {
        dados.removerServico(s);
    }

    public void atualizarServico(ClasseBasicaServico s) throws Exception {

        if (s.getCodigoServico() <= 0) {
            throw new Exception("Por favor, informe o código do serviço a ser alterado");
        }

        if (s == null) {
            throw new Exception("Por favor, informe os dados do serviço corretamente.");
        }

        if (s.getDataEntrada().length() <= 7) {
            throw new Exception("Por favor, informe a data completa. Exemplo 13/12/2017");
        }

        if (s.getDataSaida().length() <= 7) {
            throw new Exception("Por favor, informe a data completa. Exemplo 13/12/2017");
        }

        if ((s.getStatusServico().equals(" ")) || (s.getStatusServico().equals(""))) {
            throw new Exception("Por favor, informe o status do serviço");
        }

        if (s.getValorServico() <= 0) {
            throw new Exception("Por favor, informe o valor do serviço");
        }
    }

    public ArrayList<ClasseBasicaServico> listarServico(ClasseBasicaServico lista) throws Exception {

        return dados.listarServico(lista);
    }
}
