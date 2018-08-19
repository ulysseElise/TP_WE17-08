package com.intiformation.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name="client")
@Table(name="clients")
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client")
	private long idClient;
	@Column(name="nom_client")
	private String nomClient;
	@Column(name="adresse")
	private String adresse; 
	@Column(name="email")
	private String email;
	@Column(name="tel")
	private String tel;
	
	@OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Commande commande;
	
	
	// Ctor
	public Client() {}
	
	public Client(String nomClient, String adresse, String email, String tel) {
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	public Client(long idClient, String nomClient, String adresse, String email, String tel) {
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	
	
	// Getters Setters
	public long getIdClient() {return idClient;}
	public void setIdClient(long idClient) {this.idClient = idClient;}
	
	public String getNomClient() {return nomClient;}
	public void setNomClient(String nomClient) {this.nomClient = nomClient;}
	
	public String getAdresse() {return adresse;}
	public void setAdresse(String adresse) {this.adresse = adresse;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
}
