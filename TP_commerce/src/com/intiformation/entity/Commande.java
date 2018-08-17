package com.intiformation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="commande")
@Table(name="commandes") 
public class Commande implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_commande")
	private int idCommande;
	@Column(name="date_commande")
	private String dateCommande;
	
	
	// Ctor
	public Commande() {
		super();
	}
	public Commande(String dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}
	public Commande(int idCommande, String dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}
	
	
	// Getters Setters
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public String getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	
	
}
