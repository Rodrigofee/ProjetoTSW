/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labLoja;

import dados.Dados;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author PedroCristovam Gabriel
 */
public class DadosLoja extends Dados implements InterfaceLoja {

   @Override
    public void cadastrarLoja(ClasseBasicaLoja l) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção da Loja
        String sql = "INSERT INTO Loja (CNPJ_Loja, Nome_Loja, End_Loja, Telefone_Loja)";
        sql += "VALUES (?,?,?,?)";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setString(1,l.getCnpjLoja());
            stmt.setString(2, l.getNomeLoja());
            stmt.setString(3, l.getEnderecoLoja());
            stmt.setString(4, l.getTelefoneLoja());
                    
            
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void atualizarLoja(ClasseBasicaLoja l) throws Exception {
      Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a atualização do Cliente
        String sql = "UPDATE Loja SET CNPJ_Loja = ?, Nome_Loja = ?, End_Loja = ?, Telefone_Loja where Cd_Loja = ? ";

        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setString(1, l.getCnpjLoja());
            stmt.setString(2, l.getNomeLoja());
            stmt.setString(3, l.getEnderecoLoja());
            stmt.setString(4, l.getTelefoneLoja());
            stmt.setInt(5, l.getCodigoLoja());
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void removerLoja(ClasseBasicaLoja l) throws Exception {
         Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a remoção do Loja
        String sql = "DELETE FROM Loja WHERE Cd_Loja =  ";
        sql += "?";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            // ALTERAR CLASSE DO PARAMETRO A BAIXO QUANDO TERMINAR O FORM***************
            stmt.setInt(1, l.getCodigoLoja());
            
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }
   
    @Override
    public ArrayList<ClasseBasicaLoja> listarLoja(ClasseBasicaLoja l) throws Exception {
        ArrayList<ClasseBasicaLoja> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção das Lojas
        String sql = "SELECT Cd_Loja, Nome_Loja";
        sql += " FROM Loja order by Nome_Loja; ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClasseBasicaLoja lo = new ClasseBasicaLoja();
            lo.setCodigoLoja(rs.getInt("Codigo_Loja"));
            lo.setNomeLoja(rs.getString("Nome_Loja"));
            retorno.add(l);
            
        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }
    
}
