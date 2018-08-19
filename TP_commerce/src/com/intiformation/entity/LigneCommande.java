package com.intiformation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="ligneCommande")
@Table(name="ligne_commandes")
public class LigneCommande implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ligne_commande")
	private int idLigneCommande;
	@Column(name="quantite_ligne_commande")
	private int quantite;
	@Column(name="prix_ligne_commande")
	private double prix;
	
	
	@ManyToOne
    @JoinColumn(name = "produit_id", referencedColumnName = "idProduit")
    Produit produit = new Produit();
    
    @ManyToOne
    @JoinColumn(name = "commande_id", referencedColumnName = "idCommande")
    Commande commande = new Commande();
    
    
	
	// Ctor
	public LigneCommande() {
		super();
	}
	public LigneCommande(int quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}
	
	public LigneCommande(int idLigneCommande, int quantite, double prix) {
		super();
		this.idLigneCommande = idLigneCommande;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	
	// Getters Setters
	public int getIdLigneCommande() {
		return idLigneCommande;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
