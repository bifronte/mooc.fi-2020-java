/**
 *
 * @author bifronte
 */

import java.util.ArrayList;

public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public void addToIngredientsList(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public ArrayList<String> getIngredientsList() {
        return this.ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public String toString() {
        return getName() + ", " + "cooking time: " + getCookingTime();
    }
}
