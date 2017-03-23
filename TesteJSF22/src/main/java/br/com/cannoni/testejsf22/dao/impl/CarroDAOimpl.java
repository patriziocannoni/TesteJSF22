package br.com.cannoni.testejsf22.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cannoni.testejsf22.dao.CarroDAO;
import br.com.cannoni.testejsf22.model.Carro;

/**
 * @author patrizio
 * @since 31/03/2015
 */
@Repository("carroDAO")
@Transactional
public class CarroDAOimpl implements CarroDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Construtor.
	 */
	public CarroDAOimpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carro> obterCarros() {
		List<Carro> carros;

		Session session = sessionFactory.getCurrentSession();
		carros = (List<Carro>) session.createCriteria(Carro.class).list();

		return carros;
	}

}
