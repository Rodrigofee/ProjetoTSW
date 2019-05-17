/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labPedido;

import dados.Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author PedroCristovam
 */
public class DadosPedido extends Dados implements InterfacePedido {

   @Override
    public void cadastrarPedido(ClasseBasicaPedido p) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção da Loja
        String sql = "INSERT INTO Pedido (CNPJ_Loja, Nome_Loja, End_Loja, Telefone_Loja)";
        sql += "VALUES (?,?,?,?,?)";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setInt(1,p.getNumeroPedido());
            stmt.setFloat(4, p.getDioptria_OD_Cil());
            stmt.setFloat(5, p.getDioptria_OE_Cil());
            stmt.setFloat(2, p.getDioptria_OD_Esf());
            stmt.setFloat(3, p.getDioptria_OE_Esf());
                    
            
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void atualizarPedido(ClasseBasicaPedido p) throws Exception {
      Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a atualização do Cliente
        String sql = "UPDATE Pedido SET Dioptria_OD_Esf = ?, Dioptria_OE_Esf = ?, Dioptria_OD_Cil = ?, Dioptria_OE_Cil where Num_Pedido = ? ";

        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setInt(5, p.getNumeroPedido());
            stmt.setFloat(1, p.getDioptria_OD_Esf());
            stmt.setFloat(2, p.getDioptria_OE_Esf());
            stmt.setFloat(3, p.getDioptria_OD_Cil());
            stmt.setFloat(4, p.getDioptria_OE_Cil());
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void removerPedido(ClasseBasicaPedido p) throws Exception {
         Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a remoção do Loja
        String sql = "DELETE FROM Pedido WHERE Num_Pedido =  ";
        sql += "?";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            // ALTERAR CLASSE DO PARAMETRO A BAIXO QUANDO TERMINAR O FORM***************
            stmt.setInt(1, p.getNumeroPedido());
            
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }
   
    @Override
    public ArrayList<ClasseBasicaPedido> listarPedido(ClasseBasicaPedido p) throws Exception {
        ArrayList<ClasseBasicaPedido> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos Cliente
        String sql = "SELECT Num_Pedido, Dioptria_OD_Esf, Dioptria_OE_Esf, Dioptria_OD_Cil, Dioptria_OE_Cil";
        sql += " FROM Pedido order by Num_Pedido; ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClasseBasicaPedido pe = new ClasseBasicaPedido();
            pe.setNumeroPedido(rs.getInt("Codigo"));
            pe.setDioptria_OD_Esf(rs.getFloat("Esferico_OD"));
            pe.setDioptria_OE_Esf(rs.getFloat("Esferico_OE"));
            pe.setDioptria_OD_Cil(rs.getFloat("Cilindrico_OD"));
            pe.setDioptria_OE_Cil(rs.getFloat("Cilindrico_OE"));
            
            retorno.add(p);
            
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
}
    

