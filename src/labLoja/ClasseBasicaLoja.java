/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labLoja;

import labCliente.ClasseBasicaCliente;
import java.util.ArrayList;
import labPedido.ClasseBasicaPedido;

/**
 *
 * @author PedroCristovam
 */
public class ClasseBasicaLoja {

    ClasseBasicaCliente ClasseBasicaCliente;
    private int codigoLoja;
    private String nomeLoja;
    private String enderecoLoja;
    private String telefoneLoja;
    private String cnpjLoja;
    private final ArrayList<ClasseBasicaPedido> listaPedidos = new ArrayList();

    public ClasseBasicaCliente getClasseBasicaCliente() {
        return ClasseBasicaCliente;
    }

    public void setClasseBasicaCliente(ClasseBasicaCliente ClasseBasicaCliente) {
        this.ClasseBasicaCliente = ClasseBasicaCliente;
    }

    public ClasseBasicaCliente getCadastrarCliente() {
        return ClasseBasicaCliente;
    }

    public void setCadastrarCliente(ClasseBasicaCliente ClasseBasicaCliente) {
        this.ClasseBasicaCliente = ClasseBasicaCliente;
    }

    public int getCodigoLoja() {
        return codigoLoja;
    }

    public void setCodigoLoja(int codigoLoja) {
        this.codigoLoja = codigoLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(String enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public String getTelefoneLoja() {
        return telefoneLoja;
    }

    public void setTelefoneLoja(String telefoneLoja) {
        this.telefoneLoja = telefoneLoja;
    }

    public String getCnpjLoja() {
        return cnpjLoja;
    }

    public void setCnpjLoja(String cnpjLoja) {
        this.cnpjLoja = cnpjLoja;
    }

}
