/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labPedido;

import labLoja.ClasseBasicaLoja;
import java.util.ArrayList;
import labServico.ClasseBasicaServico;

/**
 *
 * @author PedroCristovam
 */
public class ClasseBasicaPedido {
    ClasseBasicaLoja ClasseBasicaLoja;
    private int numeroPedido;
    private float dioptria_OD_Esf;
    private float dioptria_OE_Esf;
    private float dioptria_OD_Cil;
    private float dioptria_OE_Cil;
    ArrayList<ClasseBasicaServico> listaServicos = new ArrayList();

    public ClasseBasicaLoja getClasseBasicaLoja() {
        return ClasseBasicaLoja;
    }

    public void setClasseBasicaLoja(ClasseBasicaLoja ClasseBasicaLoja) {
        this.ClasseBasicaLoja = ClasseBasicaLoja;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public float getDioptria_OD_Esf() {
        return dioptria_OD_Esf;
    }

    public void setDioptria_OD_Esf(float dioptria_OD_Esf) {
        this.dioptria_OD_Esf = dioptria_OD_Esf;
    }

    public float getDioptria_OE_Esf() {
        return dioptria_OE_Esf;
    }

    public void setDioptria_OE_Esf(float dioptria_OE_Esf) {
        this.dioptria_OE_Esf = dioptria_OE_Esf;
    }

    public float getDioptria_OD_Cil() {
        return dioptria_OD_Cil;
    }

    public void setDioptria_OD_Cil(float dioptria_OD_Cil) {
        this.dioptria_OD_Cil = dioptria_OD_Cil;
    }

    public float getDioptria_OE_Cil() {
        return dioptria_OE_Cil;
    }

    public void setDioptria_OE_Cil(float dioptria_OE_Cil) {
        this.dioptria_OE_Cil = dioptria_OE_Cil;
    }
    
    
    
}
