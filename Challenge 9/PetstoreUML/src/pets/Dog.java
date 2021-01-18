/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author Professor Wergeles
 */
public abstract class Dog extends LicensedPet implements VaccinatedPet {
    
    public static final String GENUS = "canis";
    private Boolean isHappy = false;
    protected Boolean isTrained = false;
    
    protected Dog(Gender gender, String name, int age) {
        super(name, age, "Dog", gender);
        this.age = age;
    }
    
    protected abstract String getSkill();
    
    @Override
    public int birthday(){
        return age++ * 7; 
    }
    
    void trainDog(){
        isTrained = true;
    }
    
    protected void yellAtDog() {
        isHappy = false;
    }
    
    public final String getIsHappyAsString() {
        if (isHappy) {
            return "happy";
        } else {
            return "sad";
        }
    } 
    
    @Override
    public String[] getNecessaryVacs() {
        
        String[] coreVaccines = {
            "Rabies 1-year",
            "Rabies 3-year",
            "Distemper",
            "Parvovirus",
            "Adenovirus"
        };
        
        return coreVaccines;
    }
    
    @Override
    public String[] getNonnecessaryVacs() {
        
        String[] nonCoreVaccines = {
            "Parainfluenza",
            "Bordetella bronchiseptica",
            "Lyme disease",
            "Leptospirosis",
            "Canine influenza"
        };
        
        return nonCoreVaccines;
    }
    
    @Override
    public String toString() {
        String info = super.toString();
        
        String updatedInfo =  String.format("%s, isHappy: %s", info, isHappy);
       
        if (whenRegistered != null) {
            updatedInfo +=  ", whenRegistered: " + whenRegistered;
        }       
        return updatedInfo;
    }

    @Override
    public String getGenus() {
        return Dog.GENUS;   
    }
    
    @Override
    public boolean hasTail() {
        return true; 
    }

    @Override
    public boolean canFly() {
        return false; 
    }

    @Override
    public boolean hasFeather() {
        return true;
    }
}