/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labServico;

import dados.Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



/**
 *
 * @author PedroCristovam
 */
public class DadosServico extends Dados implements InterfaceServico {

    @Override
    public void cadastrarServico(ClasseBasicaServico s) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do Cliente
        String sql = "INSERT INTO Servico (Data_Entrada, Data_Saida, Valor_Servico, Status_Servico)";
        sql += "VALUES (?,?,?,?)";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setString(1, s.getDataEntrada());
            stmt.setFloat(3, s.getValorServico());
            stmt.setString(3, s.getDataSaida());
            stmt.setString(4, s.getStatusServico());
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void atualizarServico(ClasseBasicaServico s) throws Exception {
      Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a atualização do Cliente
        String sql = "UPDATE Servico SET Cd_Servico = ?, Data_Entrada = ?, Data_Saida = ?, Status_Servico, Valor_Servico where Cd_Servico = ? ";

        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setString(1, s.getDataEntrada());
            stmt.setString(2, s.getDataSaida());
            stmt.setString(3, s.getStatusServico());
            stmt.setInt(4, s.getCodigoServico());
            stmt.setFloat(5, s.getValorServico());
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void removerServico(ClasseBasicaServico s) throws Exception {
         Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a remoção do cliente
        String sql = "DELETE FROM Servico WHERE Cd_Servico =  ";
        sql += "?";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            // ALTERAR CLASSE DO PARAMETRO A BAIXO QUANDO TERMINAR O FORM***************
            stmt.setInt(1, s.getCodigoServico());
            
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }
   
    @Override
    public ArrayList<ClasseBasicaServico> listarServico(ClasseBasicaServico a) throws Exception {
        ArrayList<ClasseBasicaServico> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos Cliente
        String sql = "SELECT Cd_Servico, Data_Entrada, Data_Saida, Status_Servico, Valor_Servico";
        sql += " FROM Servico order by Cd_Servico; ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClasseBasicaServico s = new ClasseBasicaServico();
            
            s.setCodigoServico (rs.getInt("Cd_Servico"));           
            s.setDataEntrada(rs.getString("Entrada"));
            s.setDataSaida(rs.getString("Saída"));
            s.setStatusServico("Status");
            s.setValorServico(rs.getFloat("Valor"));
            
            retorno.add(s);
            
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
}

 