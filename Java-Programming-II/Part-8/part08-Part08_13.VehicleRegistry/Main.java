
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        VehicleRegistry registry = new VehicleRegistry();      
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        System.out.println(registry.add(li1, "Xavier"));
        System.out.println(registry.add(li2, "Roxas"));
        System.out.println(registry.add(li1, "Mouse"));
        System.out.println(registry.add(li3, "Roger"));        
        System.out.println("-------------");        
        
        System.out.println(registry.get(li3));
        System.out.println(registry.get(li2));
        System.out.println("--------------");        
               
        System.out.println(registry.remove(li1));
        System.out.println("Plates:");
        registry.printLicensePlates();
        System.out.println("Owners");
        registry.printOwners();
        
        
        
        
    }
}
