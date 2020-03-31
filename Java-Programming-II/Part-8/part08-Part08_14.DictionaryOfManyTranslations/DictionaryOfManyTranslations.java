/**
 *
 * @author bifronte
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {        
        // Adding a new ArrayList for a new user
        dictionary.putIfAbsent(word, new ArrayList<>());
        
        // Adding a new word to the list, reference variables point to the same object
        ArrayList<String> translationList = dictionary.get(word);
        translationList.add(translation);
        
        // Another way would be
        // dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word) {
        dictionary.remove(word);
    }
}
