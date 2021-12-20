package sobrevivencialismo.beta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
    @RequestMapping("/abrigo")
    public String abrigo() {
        return "contrucoes/abrigo";
    }
}
	