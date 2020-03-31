
public class Main {

    public static void main(String[] args) {
        Abbreviations abb = new Abbreviations();
        abb.addAbbreviation("abc", "abededece");
        abb.addAbbreviation("ka", "kakaroto");
        abb.addAbbreviation("pnk", "pinkasoide");
        
        System.out.println(abb.findExplanationFor("abc"));
        System.out.println(abb.findExplanationFor("ka"));
        System.out.println(abb.findExplanationFor("pnk"));
        System.out.println(abb.findExplanationFor("lala"));      
    }
}
