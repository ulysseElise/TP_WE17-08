package com.intiformation.entity;

import javax.persistence.*;

@Entity(name="categorie")
@Table(name="categories")
public class Categorie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_categorie")
	private long idCategorie;
	@Column(name="nom_categorie")
	private String nomCategorie;
	@Column(name="photo_categorie")
	private String photoCategorie;
	@Column(name="description")
	private String Description;
	
	public Categorie() {}
	
	public Categorie(String nomCategorie, String photoCategorie, String description) {
		this.nomCategorie = nomCategorie;
		this.photoCategorie = photoCategorie;
		Description = description;
	}
	
	public Categorie(long idCategorie, String nomCategorie, String photoCategorie, String description) {
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photoCategorie = photoCategorie;
		Description = description;
	}

	public long getIdCategorie() {return idCategorie;}
	public void setIdCategorie(long idCategorie) {this.idCategorie = idCategorie;}

	public String getNomCategorie() {return nomCategorie;}
	public void setNomCategorie(String nomCategorie) {this.nomCategorie = nomCategorie;}

	public String getPhoto() {return photoCategorie;}
	void setPhoto(String photo) {this.photoCategorie = photo;}

	public String getDescription() {return Description;}
	public void setDescription(String description) {Description = description;}
	
	
}
