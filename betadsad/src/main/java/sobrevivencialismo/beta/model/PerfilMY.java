package sobrevivencialismo.beta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PerfilMY {
    
    public Boolean cadastrarPerfilMY(Perfil perfil) throws SQLException {
        //inserção de dados no DB
        String sql = "INSERT INFO perfil (nome,email,senha)"+
                        "VALUES(?,?,?)";

        Conexao conexao = new Conexao();
        Connection conn = conexao.abrirConecxao();
        PreparedStatement statement = conn.prepareStatement(sql);
        
        //Adiciona valores informados, em cada interrogação
        statement.setString(1, perfil.getNome());
        statement.setString(2, perfil.getEmail());
        statement.setString(3, perfil.getSenha());

        //Executa a Intrução no DB
        statement.execute();

        //fecha Statement e conecxao DB
        statement.close();
        return true;

    }
}
