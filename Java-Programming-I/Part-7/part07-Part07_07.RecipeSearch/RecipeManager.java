/**
 *
 * @author bifronte
 */

import java.util.ArrayList;

public class RecipeManager {
    private ArrayList<Recipe> recipesList;
    
    public RecipeManager() {
        this.recipesList = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipesList.add(recipe);
    }       
    
    public void printRecipeList() {
        for(Recipe recipe: recipesList) {
            System.out.println(recipe);
        }
        System.out.println("");
    }
    
    public ArrayList<Recipe> getRecipesList() {
        return this.recipesList;
    }
    
    public void findRecipeName(String name) {
        for(Recipe recipe: recipesList) {
            if(recipe.getName().contains(name)) {
                System.out.println(recipe);
                System.out.println("");
            }
        }
    }
    
    public void findByMaxCookingTime(int time) {
        for(Recipe recipe: recipesList) {
            if(recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String ingredient) {
        for(Recipe recipe: recipesList) {
            ArrayList<String> ingredients = recipe.getIngredientsList();          
            
            for(String ingre: ingredients) {
                if(ingre.equals(ingredient)) {
                    System.out.println(recipe);
                }
            }
        }
        System.out.println("");
    }
}
