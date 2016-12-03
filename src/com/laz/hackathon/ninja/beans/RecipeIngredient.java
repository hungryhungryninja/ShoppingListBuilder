package com.laz.hackathon.ninja.beans;

public class RecipeIngredient {
	String name;
	Mass amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Mass getAmount() {
		return amount;
	}
	public void setAmount(Mass ammount) {
		this.amount = ammount;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + " ");
		sb.append(this.amount.toString());
		return sb.toString();
	}

}
