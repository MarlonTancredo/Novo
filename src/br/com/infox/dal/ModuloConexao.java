//Pacote br.com.siscontrol.dal
package br.com.infox.dal;

//A linha abaixo importa a biblioteca Sql
import java.sql.*;

//Classe ModuloConexao
public class ModuloConexao {

    //As linhas abaixo são responsaveis por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;

        //A linha abaixo "chama" o driver 
        String driver = "com.mysql.jdbc.Driver";

        //A linha abaixo armazena informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbsiscontrol";
        String user = "root";
        String password = "";

        // A linha abaixo estabelece a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve para esclarecer o erro de conecção (apagar barras do sout linha abaixo)
            // System.out.println(e);
            return null;
        }

    }

}
