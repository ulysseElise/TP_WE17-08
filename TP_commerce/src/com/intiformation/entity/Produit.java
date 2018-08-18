package com.intiformation.entity;

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
	
	
	
	
}
