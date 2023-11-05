package com.vikas.recipefoodorderwebservices.recipemangement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RecipeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String recipeName;
	private String ingredients;
	private String recipeInformation;
	private String recipeCost;
	 
	public RecipeEntity() {
		// TODO Auto-generated constructor stub
	}
	
	

     public RecipeEntity(String recipeName, String ingredients, String recipeInformation, String recipeCost) {
		super();
		this.recipeName = recipeName;
		this.ingredients = ingredients;
		this.recipeInformation = recipeInformation;
		this.recipeCost = recipeCost;
	}



	//getters 
	public Long getId() {
		return id;
	}


	public String getRecipeName() {
		return recipeName;
	}


	


	public String getRecipeInformation() {
		return recipeInformation;
	}


	public String getRecipeCost() {
		return recipeCost;
	}

	


	public String getIngredients() {
		return ingredients;
	}



	

}
