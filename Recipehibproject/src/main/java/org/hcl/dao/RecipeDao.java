package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Recipe;

public interface RecipeDao {
   List<Recipe> getAll();
}
