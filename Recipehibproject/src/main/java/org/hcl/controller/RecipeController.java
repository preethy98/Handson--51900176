package org.hcl.controller;

import java.util.List;

import org.hcl.entities.Recipe;
import org.hcl.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {
	private RecipeService service;
	@Autowired
	public RecipeController(RecipeService service) {
		super();
		this.service = service;
	}
	@GetMapping("/")
	public String showhome()
	{
		return "home";
	}
	@GetMapping("/display")
	public String showdisplay(Model model)
	{
		List<Recipe> recipies=service.getRecipes();
		model.addAttribute("recipies", recipies);
		return "home";
	}

}
