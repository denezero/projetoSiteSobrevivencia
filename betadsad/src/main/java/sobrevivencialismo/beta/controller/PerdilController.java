package sobrevivencialismo.beta.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import sobrevivencialismo.beta.model.Myperfil;
import sobrevivencialismo.beta.model.Perfil;

@Controller
public class PerdilController {

	@PostMapping("/cadastrarPerfil")
	public String cadastrarContato(Model model, Perfil perfil) {
		
		Myperfil myperfil = new Myperfil();
		
		try {
			String mensagem = myperfil.cadastrarPerfil(perfil);
			model.addAttribute("mensagem", mensagem);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "cadastro";
	}
}
