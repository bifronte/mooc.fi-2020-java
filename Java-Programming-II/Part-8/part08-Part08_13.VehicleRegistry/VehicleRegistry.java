/**
 *
 * @author bifronte
 */

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> registry;
    
    public VehicleRegistry() {
        registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        if(registry.containsKey(licensePlate)) {
            return false;
        }
        
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(!registry.containsKey(licensePlate)) {
            return false;
        }
        
        registry.remove(licensePlate);
        return true;        
    }
    
    public void printLicensePlates() {        
        for(LicensePlate license: registry.keySet()) {
            System.out.println(license);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        
        for(String owner: registry.values()) {
            if(ownerList.contains(owner)) {
                continue;
            }
            System.out.println(owner);
            ownerList.add(owner);
        }
    }
}
