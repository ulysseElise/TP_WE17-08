package com.intiformation.entity;

public class Produit {

	private long idProduit;
	private String designation;
	private String description;
	private double prix;
	private int quantite;
	private boolean selectionne;
	private String photo;
	
	public Produit() {}

	public Produit(String designation, String description, double prix, int quantite, boolean selectionne,
			String photo) {
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
	}

	public Produit(long idProduit, String designation, String description, double prix, int quantite,
			boolean selectionne, String photo) {
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
	}

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

	public String getPhoto() {return photo;}

	public void setPhoto(String photo) {this.photo = photo;}
	
	
	
	
}
