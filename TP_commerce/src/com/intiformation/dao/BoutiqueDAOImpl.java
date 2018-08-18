package com.intiformation.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intiformation.entity.*;

@Repository // Déclare un bean du DAO dans le conteneur spring
public class BoutiqueDAOImpl implements IBoutiqueDAO {

	//à injecter sur spring, la session et son setter
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {this.sessionFactory = sessionFactory;}
	
	
	
	@Override
	public List<Categorie> listCategories() {
		return sessionFactory.getCurrentSession().createQuery("FROM categorie").list();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return sessionFactory.getCurrentSession().get(Categorie.class, idCat);
	}

	@Override
	public List<Produit> listproduits() {
		return sessionFactory.getCurrentSession().createQuery("FROM produit").list();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		//à tester mais j'y crois
		Query query = sessionFactory.getCurrentSession().createQuery("FROM produit p WHERE p.description LIKE :motCle");
		query.setParameter("motCle", "%"+mc+"%");
		return query.list();
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		//voir la table de jointure avant ça
		return null;
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		Query query = sessionFactory.getCurrentSession().createQuery("FROM produit p WHERE p.selectionne=1");
		return query.list();
	}

	@Override
	public Produit getProduit(Long idP) {
		return sessionFactory.getCurrentSession().get(Produit.class, idP);
	}

	@Override
	public long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void supprimerCategrorie(Long idcat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduit(Long idP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

}
