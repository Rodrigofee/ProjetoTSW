/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labCliente;

import javax.swing.JOptionPane;

/**
 *
 * @author PedroCristovam
 */
public class NewClass {
    public static void main(String [] args){
          try {
           ClasseBasicaCliente c = new ClasseBasicaCliente();
            c.setNomeCliente("João 2");
            c.setEmailCliente("rua da lama");
            c.setTelefoneCliente("3499-5532");
            
            c.setCodigoCliente(1);
            DadosCliente dados = new DadosCliente();
            dados.removerCliente(c);
            JOptionPane.showMessageDialog(null, "Cadastrei um cliente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
