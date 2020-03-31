
public class Main {

    public static void main(String[] args) {
        Package gifts = new Package();
        
        Gift papa = new Gift("rel", 2);
        Gift mama = new Gift("kjal", 1);
        Gift bror = new Gift("gia", 3);
        
        gifts.addGift(papa);
        gifts.addGift(mama);
        gifts.addGift(bror);
        
        System.out.println("Total gift's weight: " + gifts.totalWeight());

    }
}
