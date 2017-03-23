package br.com.cannoni.testejsf22.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cannoni.testejsf22.dao.MockDataDAO;
import br.com.cannoni.testejsf22.model.MockData;

/**
 * @author patrizio
 * @since 03/06/2015
 */
@Repository("mockDataDAO")
@Transactional
public class MockDataDAOimpl implements MockDataDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<MockData> obterMockData() {
		List<MockData> list;

		Session session = sessionFactory.getCurrentSession();
		list = (List<MockData>) session.createCriteria(MockData.class).list();

		return list;
	}

}
