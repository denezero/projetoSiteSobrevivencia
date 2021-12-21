package sobrevivencialismo.beta.model;

import java.sql.SQLException;

public class Myperfil {
    public String cadastrarPerfil(Perfil perfil) throws SQLException {
        if(perfil.getNome().equals("")) {
            return "Preencha o campo nome ";
        }
        if(perfil.getEmail().equals("")) {
            return "Preencha o campo Email";
        }
        if(perfil.getSenha().equals("")) {

        }
        //Envia o perfil para o banco de dados
        PerfilMY perfi = new PerfilMY();

        return perfi.cadastrarPerfilMY(perfil)
            ? "Cadastrado com sucesso" : "Erro ao cadastrar o usuario"; // IF ternario

    }
}
