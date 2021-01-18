/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

import pets.Bird;
import pets.Cat;
import pets.Gender;
import pets.GermanShepherd;
import pets.Pet;

/**
 *
 * @author Professor Wergeles
 */
public class PetstoreUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GermanShepherd dog = new GermanShepherd(Gender.FEMALE, "Maggie", 5, true, true);
        dog.getAge();
        dog.assignRegistration("Columbia");
        System.out.println("I will play with my dog");
        System.out.println("My dog is " + dog.getIsHappyAsString());
        System.out.println(dog.toString());
        System.out.println("My dog is " + dog.getIsHappyAsString());
        
        System.out.println("Number of pets: " + Pet.getNumOfPets());
        
        Cat cat = new Cat(Gender.FEMALE, "Whiskey", 2, Boolean.TRUE);
        cat.assignRegistration("St. Louis");
        System.out.println(cat.toString());
        
        System.out.println("Number of pets: " + Pet.getNumOfPets());
        
        Bird bird = new Bird("Tweety", 2, Gender.FEMALE, "Cyanocitta", true); 
        System.out.println(bird.toString());
         
        System.out.println("Number of pets: " + Pet.getNumOfPets());  
    }
}