/**
 *
 * @author bifronte
 */

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private RecipeManager rmanager;
    
    public UserInterface(Scanner reader) {
        rmanager = new RecipeManager();
        this.reader = reader;
    }
    
    public void start() {        
        System.out.print("File to read: ");
        String fileToRead = reader.nextLine();
        
        // Reading the file
        readFile(fileToRead);        
        
        System.out.println("Commands:\n" + "list - list the recipes\n" + "stop - stops the program\n" +
                           "find name - searches recipes by name\n" + 
                           "find cooking time - searches recipes by cooking time\n" +
                           "find ingredient - searches recipes by ingredient\n");
        
        // WAITING FOR COMMANDS
        while(true) {
            System.out.print("Enter command: ");
            String input = reader.nextLine();            
            
            if(input.equals("stop")) {
                break;
            }
            
            if(input.equals("list")) {          
                System.out.println("");
                System.out.println("Recipes:");
                rmanager.printRecipeList();
            }
            
            if(input.equals("find name")) {
                System.out.print("Searched word: ");
                String findByName = reader.nextLine();
                
                rmanager.findRecipeName(findByName);               
            }
            
            if(input.equals("find cooking time")) {
                System.out.print("Max cookign time: ");
                int maxCookingTime = Integer.valueOf(reader.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                
                rmanager.findByMaxCookingTime(maxCookingTime);
                System.out.println("");
            }
            
            if(input.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredientToFind = reader.nextLine();
                System.out.println("");
                System.out.println("Recipes: ");
                
                rmanager.findByIngredient(ingredientToFind);                              
            }
        }
    }
    
    // FILE READER METHOD
    public void readFile(String file) {
        try(Scanner fileReader = new Scanner(Paths.get(file))) {

            int counter = 0;
            while(fileReader.hasNextLine()) {                    
                
                String recipeName = fileReader.nextLine();    
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                
                rmanager.addRecipe(new Recipe(recipeName, cookingTime));
                
                // Loop for the rest of the lines(INGREDIENTS)
                while(fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();      
                    
                    if(ingredient.isEmpty()) {     
                        counter++;
                        break;
                    }
                    
                    rmanager.getRecipesList().get(counter).addToIngredientsList(ingredient);
                }
            }         
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }     
    }    
}
