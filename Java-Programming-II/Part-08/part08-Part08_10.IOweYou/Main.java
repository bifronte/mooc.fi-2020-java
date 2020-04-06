
public class Main {

    public static void main(String[] args) {
        IOU hashmap = new IOU();
        hashmap.setSum("Kakakroto", 125.4);
        hashmap.setSum("dinosaur", 99.5);
        hashmap.setSum("Screen", 45.2);
        
        System.out.println(hashmap.howMuchDoIOweTo("dinosaur"));
        System.out.println(hashmap.howMuchDoIOweTo("Micky"));
    }
}
