package com.intiformation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Produit;
import com.intiformation.service.BoutiqueService;
import com.intiformation.service.IBoutiqueService;

@Controller
public class BoutiqueController {

	// D�claration du service
	@Autowired
	private IBoutiqueService boutiqueManager;

	// Setter pour permettre � Spring d'injecter
	public void setFonctionnaireManager(IBoutiqueService boutiqueManager) {
		this.boutiqueManager = boutiqueManager;
	}
	
	/**
	 * 
	 * @param modele : modele de donn�es � retourner vers la vue
	 * @return le nom logique de la vue
	 */
	@RequestMapping(value="/gestion/produit", method=RequestMethod.GET)
	public ModelAndView afficherProduit(ModelMap modele) {
		
		/*AFFICHER LA LISTE DES PRODUITS*/
		// Appel au service pour r�cup�rer la liste des produits
		List<Produit> listeProduits = boutiqueManager.findAllProduits();
		
		// Donn�es � retourner vers la vue
		modele.addAttribute("ListeProduits", listeProduits);
		
		
		/*AFFICHER LE FORM VIDE AVEC OBJET INIT*/
		// Donn�es � retourner vers la vue 
		Map<String, Object> data = new HashMap<>();
		
		// 1. D�finition de l'objet de commande
		Produit produit = new Produit();
		
		// 2. D�finition du nom de l'objet de commande
		String objetDeCommandeFonctionnaire = "ProduitCommand";
		
		// 3. Association du nom � l'objet
		data.put(objetDeCommandeFonctionnaire, produit);
		
		// ########### Nom logique de la vue #############
		String viewName = "afficher_produits";

		return new ModelAndView(viewName, data);
	}
	
	@RequestMapping(value="/gestion/categorie", method=RequestMethod.GET)
	public ModelAndView afficherCategorie(ModelMap modele) {
		
		/*AFFICHER LA LISTE DES PRODUITS*/
		// Appel au service pour r�cup�rer la liste des produits
		List<Categorie> listeCategorie = boutiqueManager.findAllCategories();
		
		// Donn�es � retourner vers la vue
		modele.addAttribute("ListeCategories", listeCategorie);
		
		
		/*AFFICHER LE FORM VIDE AVEC OBJET INIT*/
		// Donn�es � retourner vers la vue 
		Map<String, Object> data = new HashMap<>();
		
		// 1. D�finition de l'objet de commande
		Categorie categorie = new Categorie();
		
		// 2. D�finition du nom de l'objet de commande
		String objetDeCommandeFonctionnaire = "CategorieCommand";
		
		// 3. Association du nom � l'objet
		data.put(objetDeCommandeFonctionnaire, categorie);
		
		// ########### Nom logique de la vue #############
		String viewName = "afficher_categories";

		return new ModelAndView(viewName, data);
	}
	
	
	
	/**
	 * Ajoute un nouveau Produit dans la BDD via le formulaire d'ajout
	 * @return
	 */
	@RequestMapping(value= "/produit/add", method=RequestMethod.POST)
	public String addProduit(@ModelAttribute("ProduitCommand") Produit pProduit, ModelMap modele) {
		
		// Appel du Service pour l'ajout du fonctionnaire dans la BDD
		boutiqueManager.ajouterProduit(pProduit, null);
		
		/*AFFICHER LA LISTE DES PRODUITS*/
		// Appel au service pour r�cup�rer la liste des produits
		List<Produit> listeProduits = boutiqueManager.findAllProduits();
		
		// Donn�es � retourner vers la vue
		modele.addAttribute("ListeProduits", listeProduits);
		
		
		/*AFFICHER LE FORM VIDE AVEC OBJET INIT*/
		// Donn�es � retourner vers la vue 
		Map<String, Object> data = new HashMap<>();
		
		// 1. D�finition de l'objet de commande
		Produit produit = new Produit();
		
		// 2. D�finition du nom de l'objet de commande
		String objetDeCommandeFonctionnaire = "ProduitCommand";
		
		// 3. Association du nom � l'objet
		data.put(objetDeCommandeFonctionnaire, produit);
		
		// ########### Nom logique de la vue #############
		String viewName = "afficher_produits";
		
		return "redirect:/gestion/produit";
	}
	
	/**
	 * Ajoute un nouveau Categorie dans la BDD via le formulaire d'ajout
	 * @return
	 */
	@RequestMapping(value= "/categorie/add", method=RequestMethod.POST)
	public String addCategorie(@ModelAttribute("CategorieCommand") Categorie pCategorie, ModelMap modele) {
		
		// Appel du Service pour l'ajout du fonctionnaire dans la BDD
		boutiqueManager.ajouterCategorie(pCategorie);
		
		/*AFFICHER LA LISTE DES PRODUITS*/
		// Appel au service pour r�cup�rer la liste des produits
		List<Categorie> listeCategorie = boutiqueManager.findAllCategories();
		
		// Donn�es � retourner vers la vue
		modele.addAttribute("ListeCategories", listeCategorie);
		
		
		/*AFFICHER LE FORM VIDE AVEC OBJET INIT*/
		// Donn�es � retourner vers la vue 
		Map<String, Object> data = new HashMap<>();
		
		// 1. D�finition de l'objet de commande
		Categorie categorie = new Categorie();
		
		// 2. D�finition du nom de l'objet de commande
		String objetDeCommandeFonctionnaire = "CategorieCommand";
		
		// 3. Association du nom � l'objet
		data.put(objetDeCommandeFonctionnaire, categorie);
		
		// ########### Nom logique de la vue #############
		String viewName = "afficher_categories";
		
		return "redirect:/gestion/produit";
	}
	
	
}
