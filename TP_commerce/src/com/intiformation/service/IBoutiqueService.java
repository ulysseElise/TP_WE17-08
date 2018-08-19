package com.intiformation.service;

import java.util.List;

import com.intiformation.entity.Categorie;
import com.intiformation.entity.Produit;

public interface IBoutiqueService {

	public List<Categorie> findAllCategories();

	public Categorie findCategorieById(Long idCat);

	public List<Produit> findAllProduits();

	public List<Produit> produitsParMotCle(String mc);

	public List<Produit> produitsParCategorie(Long idCat);

	public List<Produit> produitsSelectionnes();

	public Produit getProduitById(Long idP);

	public long ajouterCategorie(Categorie c);

	public void supprimerCategrorie(Long idCat);

	public void modifierCategorie(Categorie c);

	public Long ajouterProduit(Produit p, Long idCat);

	public void supprimerProduit(Long idP);

	public void modifierProduit(Produit p);
	
}
