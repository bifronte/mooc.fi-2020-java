import java.util.ArrayList;
/**
 *
 * @author bifronte
 */
public class MessagingService {
    
    public ArrayList<Message> messages;
    
    public MessagingService() {
        messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            this.messages.add(message);
        }else {
            System.out.println("The message is too long, maximum characters: 280");
        }        
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
