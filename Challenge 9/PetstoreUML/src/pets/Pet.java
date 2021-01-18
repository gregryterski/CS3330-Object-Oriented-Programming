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
public abstract class Pet implements PetFeatures {
    
    protected static int numOfPets = 0;
    
    private String name;
    Integer age;
    private String type;
    private Gender gender;
    
    private Pet() {
        numOfPets++;
    }
    
    protected Pet(String name, String type){
        this(); 
        this.name = name; 
        this.type = type; 
    }
    
    public Pet(String name, int age, String type, Gender gender) {
        this(name, type);
        this.age = age;
        this.gender = gender;
    }
    
    public static final int getNumOfPets() {
        return numOfPets;
    }
    
    void setType(String type) {
        this.type = type;
    }
    
    String getType() {
        return type;
    }
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected String getName() {
        return name;
    }
    
    void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    protected void setGender(Gender gender){
        this.gender = gender;
    }
    
    public Gender getGender(){
        return gender;
    }
    
    int birthday() {
        return age++; 
    }
    
    protected abstract String getGenus();
    
    @Override
    public String toString() {
        return String.format("Type: %s, Name: %s, Age: %d, Gender: " + gender, type, name, age); 
    }   
}