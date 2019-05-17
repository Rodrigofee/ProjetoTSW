/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labCliente;

import dados.Dados;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author PedroCristovam
 *
 */
// <<<< OS DADOS DO CLIENTE NO FIM CHEGARÁ AQUI >>>>
public class DadosCliente extends Dados implements InterfaceCliente {

    @Override
    public void cadastrarCliente(ClasseBasicaCliente c) throws Exception {
        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a inserção do Cliente
        String sql = "INSERT INTO Cliente (Nome_Cliente, Email_Cliente, Telefone_Cliente)";
        sql += "VALUES (?,?,?)";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setString(1, c.getNomeCliente());
            stmt.setString(2, c.getEmailCliente());
            stmt.setString(3, c.getTelefoneCliente());
            // executa
            stmt.execute();
            stmt.close();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void atualizarCliente(ClasseBasicaCliente c) throws Exception {
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a atualização do Cliente
        String sql = "UPDATE Cliente SET Nome_Cliente = ?, Email_Cliente = ?, Telefone_Cliente = ? where Cd_Cliente = ? ";

        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            stmt.setString(1, c.getNomeCliente());
            stmt.setString(2, c.getEmailCliente());
            stmt.setString(3, c.getTelefoneCliente());
            stmt.setInt(4, c.getCodigoCliente());
            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public void removerCliente(ClasseBasicaCliente c) throws Exception {
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a remoção do cliente
        String sql = "DELETE FROM Cliente WHERE Cd_Cliente =  ";
        sql += "?";
        // preenche os valores
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // preenche os valores
            // ALTERAR CLASSE DO PARAMETRO A BAIXO QUANDO TERMINAR O FORM***************
            stmt.setInt(1, c.getCodigoCliente());

            // executa
            stmt.execute();
        }
        //fechando a conexão com o banco de dados
        desconectar();
    }

    @Override
    public ArrayList<ClasseBasicaCliente> listarCliente(ClasseBasicaCliente a) throws Exception {
        ArrayList<ClasseBasicaCliente> retorno = new ArrayList<>();

        //abrindo a conexão
        Connection conn = conectarPrepareStatment();
        //instrução sql correspondente a seleção dos Cliente
        String sql = "SELECT Cd_Cliente, Nome_Cliente, Telefone_Cliente";
        sql += " FROM Cliente order by Nome_Cliente; ";
        PreparedStatement stmt = conn.prepareStatement(sql);

        //executando a instrução sql
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClasseBasicaCliente c = new ClasseBasicaCliente();

            c.setCodigoCliente(rs.getInt("Cd_Cliente"));
            c.setNomeCliente(rs.getString("Nome_Cliente"));
            c.setTelefoneCliente(rs.getString("Telefone_Cliente"));
            retorno.add(c);

        }
        //fechando a conexão com o banco de dados
        desconectar();
        return retorno;
    }

    public boolean buscarCliente(ClasseBasicaCliente c) throws Exception {
        ArrayList<ClasseBasicaCliente> lista = new ArrayList<>();

        Connection conn = conectarPrepareStatment();
        boolean resposta = false;

        String sql = "SELECT * FROM Cliente WHERE Cd_Cliente = Cd_Cliente AND ";

        if (c.getCodigoCliente() != 0) {
            sql += " Cd_Cliente = '" + c.getCodigoCliente() + "';";

        }
        /*if (c.getNomeCliente() != null){
            sql+= "WHERE Nome_Cliente like '%" + c.getNomeCliente() + "%';";
        }
        
        if (c.getEmailCliente() != null){
            sql += "WHERE Email_Cliente like '%" + c.getEmailCliente() + "%';";
        }
        if (c.getTelefoneCliente() != null){
            sql += "WHERE Telefone_Cliente like '%" + c.getTelefoneCliente() + "%';";
        }
         */
        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ClasseBasicaCliente cl = new ClasseBasicaCliente();

            cl.setCodigoCliente(rs.getInt("Cd_Cliente"));

            lista.add(cl);

        }
        if (c.getCodigoCliente() != 0) {
            for (ClasseBasicaCliente cl : lista) {
                if (c.getCodigoCliente() == cl.getCodigoCliente()) {
                    resposta = true;
                    break;
                } else {
                    resposta = false;
                }
            }
        }
        /*
          if (c.getNomeCliente() != null) {
            for (ClasseBasicaCliente cl : lista) {
                if ( cl.getNomeCliente() != null) {
                    resposta = true;
                    break;
                } else {
                    resposta = false;
                }
            }
            
            if (c.getTelefoneCliente() != null) {
            for (ClasseBasicaCliente cl : lista) {
                if (cl.getTelefoneCliente() != null) {
                    resposta = true;
                    break;
                } else {
                    resposta = false;
                }
            }
        }
            if (c.getEmailCliente() != null) {
            for (ClasseBasicaCliente cl : lista) {
                if (cl.getEmailCliente()!= null) {
                    resposta = true;
                    break;
                } else {
                    resposta = false;
                }
            }
        }
         */

        return resposta;

    }

}
