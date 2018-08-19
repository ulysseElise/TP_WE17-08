package com.intiformation.entity;

import java.util.List;

import javax.persistence.*;

@Entity(name="produit")
@Table(name="produits")
public class Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_produit")
	private long idProduit;
	@Column(name="designation")
	private String designation;
	@Column(name="description")
	private String description;
	@Column(name="prix")
	private double prix;
	@Column(name="quantite")
	private int quantite;
	@Column(name="selectionne")
	private boolean selectionne;
	@Column(name="photo_produit")
	private String photoProduit;
	
	@OneToMany(mappedBy = "produit", targetEntity = LigneCommande.class, cascade = CascadeType.ALL)
    private List<LigneCommande> ligneCommande;
	
	@OneToOne(cascade = CascadeType.ALL)
    // referencedColumnName : référence de la variable JAVA qui représente l'id de la table Categorie
    @JoinColumn(name = "categorie_id", referencedColumnName = "idCategorie")
    private Categorie categorie;
	
	
	
	// Ctor
	public Produit() {}

	public Produit(String designation, String description, double prix, int quantite, boolean selectionne,
			String photoProduit) {
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photoProduit = photoProduit;
	}

	public Produit(long idProduit, String designation, String description, double prix, int quantite,
			boolean selectionne, String photoProduit) {
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photoProduit = photoProduit;
	}
	
	// Getters Setters
	public long getIdProduit() {return idProduit;}
	public void setIdProduit(long idProduit) {this.idProduit = idProduit;}

	public String getDesignation() {return designation;}
	public void setDesignation(String designation) {this.designation = designation;}

	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}

	public double getPrix() {return prix;}
	public void setPrix(double prix) {this.prix = prix;}

	public int getQuantite() {return quantite;}
	public void setQuantite(int quantite) {this.quantite = quantite;}

	public boolean isSelectionne() {return selectionne;}
	public void setSelectionne(boolean selectionne) {this.selectionne = selectionne;}

	public String getPhoto() {return photoProduit;}

	public void setPhoto(String photoProduit) {this.photoProduit = photoProduit;}

	public String getPhotoProduit() {
		return photoProduit;
	}

	public void setPhotoProduit(String photoProduit) {
		this.photoProduit = photoProduit;
	}

	public List<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	
	
}
