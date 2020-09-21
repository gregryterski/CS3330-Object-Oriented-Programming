/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjr7dzlanguagebasicsf20;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author gregryterski
 */
public class Gjr7dzLanguageBasicsF20 {
    //Fields
    public char c1 = 'a';
    public char c2 = 97;
    public String greeting = "Hello";
    public String myPawPrint = "gjr7dz";
    public short qualityScore = 89;
    public int months = 12;
    public float miles = (float) 1023.5;
    public float days = 365;
    public boolean sunny = true;
    public boolean warm = false;   
    
    //Grabs local time and adds the values according with the variables
    LocalDateTime dateTime = LocalDateTime.now(); //Start of stackabuse.com/how-to-get-current-date-and-time-in-java/
    public int hour = (int) dateTime.getHour();
    public int minute = (int) dateTime.getMinute();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
    public String currentTime = dateTime.format(formatter); //End of stackabuse.com/how-to-get-current-date-and-time-in-java/

    public double grade = Math.random() * (4.0); //Start & End of educative.io/edpresso/how-to-generate-random-numbers-in-java
    
    public static void main(String[] args) {
        Gjr7dzLanguageBasicsF20 starter = new Gjr7dzLanguageBasicsF20(); //Start & End stackoverflow.com/questions/2559527/non-static-variable-cannot-be-referenced-from-a-static-context
        
        starter.charCheck();
        starter.qualCheck();
        starter.carMileage();
        starter.timeOfDay();
        starter.giveGrade();
        starter.countNum();
        starter.invokeMe(); //Calls the function to print greeting, pawprint, and time
    }
    
    public void charCheck(){
        char char1 = this.c1;
        char char2 = this.c2;
        
        if(char1 == char2){ //Check if the characters are the same or not
            System.out.println(char1 + " and " + char2 + " are the same.");
        } else{
            System.out.println(char1 + " and " + char2 + " are NOT the same.");
        }
    }
    
    public void qualCheck(){
        short qualScore = this.qualityScore;
        
        if(qualScore >= 0 && qualScore <= 75){ //Checks to see if the quality is good or not
            System.out.println("The quality is bad.");
        } else{
            System.out.println("Good quality.");
        }
    }
    
    public void carMileage(){
        int month = this.months;
        float mile = this.miles;
        float day = this.days;
        boolean sun = this.sunny;
        boolean comfy = this.warm;
        
        float dcm;
        DecimalFormat df = new DecimalFormat("#.##"); //Start & End of stackoverflow.com/questions/12806278/double-decimal-formatting-in-java
        dcm = (mile * month) / day; //Does the dcm calculation
        System.out.println("My average daily car mileage = " + df.format(dcm));
        
        if(sun == true && comfy == true){ //Checks to see if it is sunny or warm
            System.out.println("Go swimming at beach.");
        } else if(sun == false && comfy == true){
            System.out.println("Go for a drive.");
        } else{
            System.out.println("Stay home and code.");
        }
    }
     
    public void timeOfDay(){
        int hours = this.hour;
        String timeNow = this.currentTime;

        switch(hours){ //Switch case based off the hour hand for the output message
            case 5: case 6: case 7: case 8: case 9: case 10:
                System.out.println("The current time is " + timeNow + " in the MORNING.");
                break;
            case 11: case 12: case 13: case 14: case 15: case 16:
                System.out.println("The current time is " + timeNow + " in the AFTERNOON.");
                break;
            case 17: case 18: case 19: case 20: case 21: case 22:
                System.out.println("The current time is " + timeNow + " in the EVENING.");
                break;
            case 23: case 0: case 1: case 2: case 3: case 4:
                System.out.println("The current time is " + timeNow + " in the NIGHT.");
                break;
            default:
                System.out.println("You have the wrong time.");
                break;
        }
    }
    
    public void giveGrade(){
        double studentGrade = this.grade;
        
        if(studentGrade <= 0.69 && studentGrade >= 0.00){ //Checks the grade variable based on the random scale form 0.0-4.0
            System.out.println("The student's GPA grade is an F in the class.");
        } else if(studentGrade <= 0.99 && studentGrade >= 0.70){
            System.out.println("The student's GPA grade is a D- in the class.");
        } else if(studentGrade <= 1.29 && studentGrade >= 1.00){
            System.out.println("The student's GPA grade is a D in the class.");
        } else if(studentGrade <= 1.69 && studentGrade >= 1.30){
            System.out.println("The student's GPA grade is a D+ in the class.");
        } else if(studentGrade <= 1.99 && studentGrade >= 1.70){
            System.out.println("The student's GPA grade is a C- in the class.");
        } else if(studentGrade <= 2.29 && studentGrade >= 2.00){
            System.out.println("The student's GPA grade is a C in the class.");
        } else if(studentGrade <= 2.69 && studentGrade >= 2.30){
            System.out.println("The student's GPA grade is a C+ in the class.");
        } else if(studentGrade <= 2.99 && studentGrade >= 2.70){
            System.out.println("The student's GPA grade is a B- in the class.");
        } else if(studentGrade <= 3.29 && studentGrade >= 3.00){
            System.out.println("The student's GPA grade is a B in the class.");
        } else if(studentGrade <= 3.69 && studentGrade >= 3.30){
            System.out.println("The student's GPA grade is a B+ in the class.");
        } else if(studentGrade <= 3.99 && studentGrade >= 3.70){
            System.out.println("The student's GPA grade is a A- in the class.");
        } else if(studentGrade == 4.00){
            System.out.println("The student's GPA grade is a A in the class.");
        } else if(studentGrade > 4.00){
            System.out.println("The student's GPA grade is a A+ in the class.");
        }
    }
     
    public void countNum(){
        for(int count=9; count>=3; count--){ //Counts down from 9 to 3 and prints only the even numbers
            if(count % 2 == 0){
            System.out.println("Count: " + count);
            }
        }
        
        int countDown = 3;
        while(countDown > 0){ //Counts down from 3 and prints a message at the end
            System.out.println("Count Down: " + countDown);
            countDown--;
             if(countDown == 0){
                System.out.println("Houston, we have a lift off!");
            }
        }
    }
    
    public void invokeMe(){
        String greet = this.greeting;
        String pawPrint = this.myPawPrint;
        String timeNow = this.currentTime;
        
        System.out.println(greet + ", my pawprint is " + pawPrint + " and today's date is " + timeNow);
    }
}
