package com.intiformation.dao;

import java.util.*;
import com.intiformation.entity.*;

public interface IBoutiqueDAO {
	
	//InternauteBoutique
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public List<Produit> listproduits();
	public List<Produit> produitsParMotCle(String mc);
	public List<Produit> produitsParCategorie(Long idCat);
	public List<Produit> produitsSelectionnes();
	public Produit getProduit(Long idP);
//	public Commande enregistrerCommande(GestionPanier p, Client c);
	
	//IAdminProduitMetier
	public long ajouterCategorie(Categorie c);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	
	//IAdminCategoriesMetier
	public Long ajouterProduit(Produit p, Long idCat);
	public void supprimerProduit(Long idP);
	public void modifierProduit(Produit p);
//	public void ajouterUser(User u);
//	public void attribuerRole(Role r, Long userID);
	
}
