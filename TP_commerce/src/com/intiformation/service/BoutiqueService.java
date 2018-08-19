package com.intiformation.service;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.dao.IBoutiqueDAO;
import com.intiformation.entity.Categorie;
import com.intiformation.entity.Produit;

/**
 * Implémentation concrète de la couche Service
 * @author Simon Ulrich
 *
 */
@Transactional
@Service // Déclare un bean de service dans le conteneur
public class BoutiqueService{

	// Déclaration de la couche DAO
	@Autowired // Injection par type du DAO
	private IBoutiqueDAO boutiqueDAO;

	public void setBoutiqueDAO(IBoutiqueDAO boutiqueDAO) {
		this.boutiqueDAO = boutiqueDAO;
	}
	
	
	
	public List<Categorie> findAllCategories() {
		return boutiqueDAO.listCategories();
	}

	public Categorie findCategorieById(Long idCat) {
		return boutiqueDAO.getCategorie(idCat);
	}

	public List<Produit> findAllProduits() {
		return boutiqueDAO.listproduits();
	}

	public List<Produit> produitsParMotCle(String mc) {
		return boutiqueDAO.produitsParMotCle(mc);
	}

	public List<Produit> produitsParCategorie(Long idCat) {
		//voir la table de jointure avant ça
		return null;
	}

	public List<Produit> produitsSelectionnes() {
		return boutiqueDAO.produitsSelectionnes();
	}

	public Produit getProduitById(Long idP) {
		return boutiqueDAO.getProduit(idP);
	}

	public long ajouterCategorie(Categorie c) {
		return boutiqueDAO.ajouterCategorie(c);
	}

	public void supprimerCategrorie(Long idCat) {
		boutiqueDAO.supprimerCategrorie(idCat);
	}

	public void modifierCategorie(Categorie c) {
		boutiqueDAO.modifierCategorie(c);		
	}

	public Long ajouterProduit(Produit p, Long idCat) {
		return boutiqueDAO.ajouterProduit(p, idCat);
	}

	public void supprimerProduit(Long idP) {
		boutiqueDAO.supprimerProduit(idP);
	}

	public void modifierProduit(Produit p) {
		boutiqueDAO.modifierProduit(p);
	}
	
	
}
