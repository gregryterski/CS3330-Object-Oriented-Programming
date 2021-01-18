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
public class Cat extends LicensedPet implements VaccinatedPet {
     
    public final static String GENUS = "Felis";
    private final Boolean HAIR;
    
    Cat(Gender gender, String name){
        this(gender, name, 0, null); 
    }
    
    public Cat(Gender gender, String name, int age, Boolean hair) {
        super(name, age, "Cat", gender);
        this.HAIR = hair; 
    }
    
    protected Boolean hasHair() {
        return HAIR;
    }
    
    static String meow(int numMeows){
        String meows = ""; 
        for(int i = 0; i < numMeows; i++){
            meows += "meow!\n"; 
        }
        return meows; 
    }
    
    @Override
    public int birthday(){
        return age++ * 7; 
    }

        
    @Override
    public String[] getNecessaryVacs() {    
        String[] coreVaccines = {
            "Rabies",
            "Feline Distemper",
            "Feline Herpesvirus",
            "Calicivirus"
        };
        return coreVaccines;   
    }

    @Override
    public String[] getNonnecessaryVacs() {
        String[] nonCoreVaccines = {
            "Feline Leukemia Virus",
            "Bordetella"
        };
        return nonCoreVaccines;
    }
    
    @Override
    public String toString() {
       String info = super.toString();
       if (whenRegistered != null) {
           info +=  ", whenRegistered: " + whenRegistered;
       }
       return info;
    }

    @Override
    public String getGenus() {
        return Cat.GENUS; 
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
        return false;
    }
}