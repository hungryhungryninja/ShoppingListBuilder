package com.laz.hackathon.ninja;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.laz.hackathon.ninja.beans.Recipe;

public class IngredientListBuilder implements RequestHandler<String, Object> {

    @Override
    public Object handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        
        
        List<Recipe> recipes = null;
        List<String> ingredients = null;
        
        try {
        	ObjectMapper mapper = new ObjectMapper();
        	recipes = (List<Recipe>) Arrays.asList(mapper.readValue(input, Recipe[].class));
        	
        	ingredients = 
        			recipes.stream()
        				.map( recipe -> recipe.getIngredients() )
        				.flatMap(ingredientList -> ingredientList.stream())
        				.distinct()
        				.map( ingredient -> ingredient.toString() )
        				.collect(Collectors.toList());
        	
        	
		} catch (JsonParseException e) {
			context.getLogger().log("Falied to parse the json input: " + e.getMessage());
		} catch (JsonMappingException e) {
			context.getLogger().log("Falied to map the json to beans input: " + e.getMessage());
		} catch (IOException e) {
			context.getLogger().log("Falied to map the json to beans input: " + e.getMessage());
		}

        return ingredients;
    }

}
