package com.intiformation.dao;

import java.util.List;


/**
 * Interface de la couche DAO
 * @author Simon Ulrich
 *
 */
public interface IDAO<T> {

	public void add(T pFonctionnaire);
	public void update(T pFonctionnaire);
	public void delete(int pIdFonctionnaire);
	public T getById(int pIdFonctionnaire);
	public List<T> getAll();
	
}
