package org.hcl.dao;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hcl.entities.Recipe;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class RecipeDaoImpl  implements RecipeDao{
private SessionFactory sessionFactory;
@Autowired
	public RecipeDaoImpl(SessionFactory sessionFactory) {
	super();
	this.sessionFactory = sessionFactory;
}
@Transactional
	@Override
	public List<Recipe> getAll() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from org.hcl.entities.Recipe as r");
		List<Recipe> recipies=query.list();
		return recipies;
	}

}
