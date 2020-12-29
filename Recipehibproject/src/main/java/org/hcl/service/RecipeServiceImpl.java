package org.hcl.service;

import java.util.List;

import org.hcl.dao.RecipeDao;
import org.hcl.entities.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RecipeServiceImpl implements RecipeService{
private RecipeDao dao;
@Autowired
	public RecipeServiceImpl(RecipeDao dao) {
	super();
	this.dao = dao;
}

	@Override
	public List<Recipe> getRecipes() {

		return dao.getAll();
	}

}
