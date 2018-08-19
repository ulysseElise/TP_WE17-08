package com.intiformation.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.entity.Client;

@Repository
public class ClientDAO implements IDAO<Client>{

	@Autowired // Injection par type de la sessionFactory par Spring
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public void add(Client pClient) {
		sessionFactory.getCurrentSession().save(pClient);
	}

	@Override
	@Transactional
	public void update(Client pClient) {
		sessionFactory.getCurrentSession().update(pClient);
	}

	@Override
	@Transactional
	public void delete(int pClient) {
		Client client = sessionFactory.getCurrentSession().get(Client.class, pClient);
		
		sessionFactory.getCurrentSession().delete(client);
	}

	@Override
	@Transactional(readOnly=true)
	public Client getById(int pIdClient) {
		return sessionFactory.getCurrentSession().get(Client.class, pIdClient);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Client> getAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Client").list();		
	}

	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
}
