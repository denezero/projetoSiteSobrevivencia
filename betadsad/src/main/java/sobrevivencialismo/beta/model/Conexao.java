package sobrevivencialismo.beta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //Faz a conexao com o banco
    public Connection abrirConecxao() throws SQLException {
        String servidor = "localhost";
        String porta = "";
        String nomeDB = "/sobre_bd";
        String usuario = "root";
		String senha = "";
        //Monta conexao url
        String url = "jdbc:mysql://" + servidor + porta + nomeDB;
        Connection conn = DriverManager.getConnection(url,usuario,senha);
        return conn;

    }
    public void fecharConecxao(Connection conexaoAberta) throws SQLException{
        conexaoAberta.close();
    }
}
