package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class Dados {

    private Statement stmt;
    public Connection conn;

    private String local = "localhost";
    private String bancoDeDados = "bancolaboratorio";
    private String usuario = "ProjetoLaboratorio";
    private String senha = "123456";

    public Statement conectar() throws ClassNotFoundException, SQLException {
        return this.conectarSqlServer();
    }

    public Connection conectarPrepareStatment() throws ClassNotFoundException, SQLException {
        this.conectarSqlServer();
        return conn;
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

    private Statement conectarSqlServer() throws ClassNotFoundException, SQLException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        String url = "jdbc:sqlserver://" + local + ":1433;DatabaseName=" + bancoDeDados;

        Class.forName(driver);
        conn = DriverManager.getConnection(url, usuario, senha);
        stmt = conn.createStatement();
        return stmt;
    }

   /* private Statement conectarMySql() throws ClassNotFoundException, SQLException {
        try {

            String driver = "com.mysql.jdbc.Driver";

            String url = "jdbc:mysql://localhost:3306/";

            Class.forName(driver).newInstance();
            conn = (Connection) DriverManager.getConnection(url + bancoDeDados, usuario, senha);
            stmt = conn.createStatement();
            return stmt;
        } catch (InstantiationException ex) {
            throw new SQLException(ex.getMessage());
        } catch (IllegalAccessException ex) {
            throw new SQLException(ex.getMessage());
        }
    }*/  
}
