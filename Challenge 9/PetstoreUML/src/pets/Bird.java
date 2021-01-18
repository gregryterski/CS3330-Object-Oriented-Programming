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
public class Bird extends Pet {
    
    private final String GENUS;
    private boolean isMelodious;
    static Boolean hasFeathers;
    
    private Bird(Gender gender, String genus){
        this(null, 0, gender, genus, false); 
        Bird.hasFeathers = false; 
    }
    
    public Bird(String name, int age, Gender gender, String genus, boolean isMelodious){
        super(name, age, "Bird", gender); 
        this.GENUS = genus; 
        this.isMelodious = isMelodious;
        Bird.hasFeathers = true; 
    }
    
    String sing(){
        if (isMelodious){
            return "Stay and listen!";
        }else{
            return "Run!";
        }
    }
    
    @Override
    public String getGenus(){
        return GENUS; 
    }
    
    @Override
    public boolean hasTail() {
        return false; 
    }
    
    @Override
    public boolean canFly() {
        return true; 
    }
    
    @Override
    public boolean hasFeather() {
        return hasFeathers; 
    }
     
    @Override
    public String toString() {
       String info = super.toString();
       return String.format("%s, Genus: %s", info, GENUS);
    }
}