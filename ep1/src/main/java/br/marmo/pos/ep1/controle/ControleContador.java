package br.marmo.pos.ep1.controle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControleContador {
	
	private int contagem = 0;

		@GetMapping("/contador")
		public String contagem(HttpServletRequest requisicao, Model model) {
			
			HttpSession session = requisicao.getSession(true); 
			contagem +=1;
			session.setAttribute("contador", contagem); 
			contagem = (Integer) session.getAttribute("contador"); 
			model.addAttribute("contador", contagem);
			
			
			return "contador/contadorPage";
		}
			
			
	

}
