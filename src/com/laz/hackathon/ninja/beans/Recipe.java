package com.laz.hackathon.ninja.beans;

import java.util.List;

public class Recipe {
	
	private String name;
	
	private String cookTime;
	
	private String prepTime;
	
	private String cookingMethod;
	
	private NutritionInformation nutritionInformation;
	
	private String recipeCategory;
	
	private String recipeCuisine;
	
	private List<RecipeIngredient> ingredients;
	
	private List<String> instructions;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCookTime() {
		return cookTime;
	}



	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}



	public String getPrepTime() {
		return prepTime;
	}



	public void setPrepTime(String prepTime) {
		this.prepTime = prepTime;
	}



	public String getCookingMethod() {
		return cookingMethod;
	}



	public void setCookingMethod(String cookingMethod) {
		this.cookingMethod = cookingMethod;
	}



	public NutritionInformation getNutritionInformation() {
		return nutritionInformation;
	}



	public void setNutritionInformation(NutritionInformation nutritionInformation) {
		this.nutritionInformation = nutritionInformation;
	}



	public String getRecipeCategory() {
		return recipeCategory;
	}



	public void setRecipeCategory(String recipeCategory) {
		this.recipeCategory = recipeCategory;
	}



	public String getRecipeCuisine() {
		return recipeCuisine;
	}



	public void setRecipeCuisine(String recipeCuisine) {
		this.recipeCuisine = recipeCuisine;
	}



	public List<RecipeIngredient> getIngredients() {
		return ingredients;
	}



	public void setIngredients(List<RecipeIngredient> ingredients) {
		this.ingredients = ingredients;
	}



	public List<String> getInstructions() {
		return instructions;
	}



	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name:" + this.name + "\n");
		sb.append("Prep Time:" + this.prepTime + "\n");
		sb.append("Cooking Time:" + this.cookTime + "\n");
		sb.append("Cooking Method:" + this.cookingMethod + "\n");
		sb.append("Nutrition Information: \n" + this.nutritionInformation.toString() + "\n");
		sb.append("Recipe Category:" + this.recipeCategory + "\n");
		sb.append("Recipe Cuisine:" + this.recipeCuisine + "\n");
		sb.append("Ingredients:  \n" + this.ingredients.toString() + "\n");
		sb.append("Instructions:" + this.instructions + "\n");
		
		
		return sb.toString();
	}
	
}