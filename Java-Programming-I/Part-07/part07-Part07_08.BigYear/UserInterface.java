/**
 *
 * @author bifronte
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private BirdManager bmanager;
    
    public UserInterface(Scanner scan, BirdManager bmanager) {
        this.scan = scan;
        this.bmanager = bmanager;
    }
    
    public void start() {
        while(true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            if(command.equals("Add")) { 
                commandAdd();
            }
            
            if(command.equals("Observation")) {
                commandObservation();
            }
            
            if(command.equals("All")) {
                bmanager.printAll();
            }
            
            if(command.equals("One")) {
                commandOne();
            }
        }
    }
    
    public void commandAdd() {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String nameLatin = scan.nextLine();
        
        bmanager.addBird(name, nameLatin);
    }
    
    public void commandObservation() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        
        if(bmanager.isNameTrue(name)) {
            bmanager.addObservation(name);
            
        }else {
            System.out.println("Not a bird!");
        }        
    }
    
    public void commandOne() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        
        if(bmanager.isNameTrue(name)) {
            bmanager.getBird(name);
            
        }else {
            System.out.println("Nt a bird!");
        }
    }
}
