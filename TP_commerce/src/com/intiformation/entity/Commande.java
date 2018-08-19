package com.intiformation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="commande")
@Table(name="commandes") 
public class Commande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommande;
	@Column(name="date_commande")
	private String dateCommande;
	
	@OneToMany(mappedBy = "commande", targetEntity = LigneCommande.class, cascade = CascadeType.ALL)
    private List<LigneCommande> ligneCommande;
	
	@OneToOne(cascade = CascadeType.ALL)
    // referencedColumnName : référence de la variable JAVA qui représente l'id de la table Categorie
    @JoinColumn(name = "client_id", referencedColumnName = "idClient")
    private Client client;
	
	
	// Ctor
	public Commande() {}
	
	public Commande(String dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	public Commande(int idCommande, String dateCommande) {
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}
	
	
	// Getters Setters
	public int getIdCommande() {return idCommande;}
	public void setIdCommande(int idCommande) {this.idCommande = idCommande;}
	
	public String getDateCommande() {return dateCommande;}
	public void setDateCommande(String dateCommande) {this.dateCommande = dateCommande;}

	public List<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
