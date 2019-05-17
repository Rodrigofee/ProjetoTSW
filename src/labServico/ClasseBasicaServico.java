/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labServico;

import labPedido.ClasseBasicaPedido;


/**
 *
 * @author PedroCristovam
 */
public class ClasseBasicaServico {
      ClasseBasicaPedido ClasseBasicaPedido;
    private int codigoServico;
    private String statusServico;
    private String dataEntrada;
    private String dataSaida;
    private float valorServico;

    public ClasseBasicaPedido getClasseBasicaPedido() {
        return ClasseBasicaPedido;
    }

    public void setClasseBasicaPedido(ClasseBasicaPedido ClasseBasicaPedido) {
        this.ClasseBasicaPedido = ClasseBasicaPedido;
    }

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public float getValorServico() {
        return valorServico;
    }

    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }
   
        
    
    
}
