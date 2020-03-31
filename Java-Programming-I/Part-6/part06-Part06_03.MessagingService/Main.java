
public class Main {

    public static void main(String[] args) {
        MessagingService heaven = new MessagingService();
        Message msj = new Message("icwe", "mtk lolo");
        heaven.add(msj);
        
        Message msj2 = new Message("icwe", "et lulu");
        heaven.add(msj2);
        System.out.println("");
        
        System.out.println(heaven.getMessages());
        
        
        
    }
}
