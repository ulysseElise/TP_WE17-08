package com.intiformation.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.java.swing.plaf.motif.resources.motif;

@Controller // D�clare la classe comme bean dans le conteneur
@RequestMapping("/welcome")// Associe la classe � l'URL
public class WelcomeController {

	/**
	 * M�thode gestionnaire
	 * @return le mod�le de donn�es et le nom logique de la vue � la servlet Dispatcher de Spring
	 */
	@RequestMapping(method=RequestMethod.GET) // Associe la m�thode � un appel en GET sur l'URL /welcome
	public ModelAndView accueillirFonctionnaire() {
		// Donn�es � retourner vers la vue
		String titre = "Spring MVC";
		String message = "Bienvenue dans notre application de gestion des fonctionnaires.";
		Date today = new Date();
		
		Map<String, Object> data = new HashMap<>();
		data.put("titreKey", titre);
		data.put("messageKey", message);
		data.put("todayKey", today);
		
		// le nom logique de la vue
		String viewName = "accueil";
		
		// Renvoie de l'objet ModelAndView � la servlet
		ModelAndView modelAndView = new ModelAndView(viewName, data);
		
		return modelAndView;
	}
	
}
