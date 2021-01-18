/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import java.time.LocalDateTime;

/**
 *
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
 */
public abstract class LicensedPet extends Pet implements RegisteredPet {
    
    LocalDateTime whenRegistered;
    String registeredLocation = "unknown";
    
    LicensedPet(String name, int age, String type, Gender gender){
        super(name, age, type, gender);
    }
    
    public void assignRegistration(String registeredLocation) {
        whenRegistered = LocalDateTime.now();
        this.registeredLocation = registeredLocation;
    }
    
    @Override
    public Boolean isRegistered() {
        return whenRegistered != null;
    }

    @Override
    public LocalDateTime whenRegistered() {
        return whenRegistered;
    }
    
    @Override
    public String whereRegistered() {
        return registeredLocation;
    }   
}
