/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjr7dzmoviesf20;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author gregryterski
 */
public class Gjr7dzMoviesF20 {

    public enum Category{
        ACTION, COMEDY, DRAMA, FANTASY, HORROR, ROMANCE, WESTERN, SCI_FI,
        SUSPENSE, ANIMATION, UNKNOWN
    }
    
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); //Start of java67.com/2015/06/how-to-format-number-in-java.html
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3); //End of java67.com/2015/06/how-to-format-number-in-java.html
        
        Movie movie1 = new Movie("Frozen 2 (Plus Bonus Content)", "Chris Buck and Jennifer Lee");
        movie1.setCategory(Category.ANIMATION);
        movie1.setSummary("Together with Anna, Kristoff, Olaf and Sven, Elsa "
                + "faces a dangerous but remarkable journey into the unknown-"
                + "to the enchanted forests and dark seas beyond Arendelle, in"
                + "search of truths about the past.");
        movie1.setRating((float) 6.9);
        movie1.setRevenue((double) 1450000000);
        movie1.setYear(2019);
        
        Movie movie2 = new Movie("Shrek Forever After", "Mike Mitchell", "The"
                + " further adventure of the giant green ogre, Shrek, living in "
                + "the land of Far, Far Away.", 2010, (float) 6.3, 
                (double) 752600000, Category.COMEDY);
        
        Movie movie3 = new Movie("The Matrix", "The Wachowski Brothers", "A computer"
                + "hacker learns from mysterious rebels about the true nature of "
                + "his reality and his role in the war against its controllers.",
                1999, Category.SCI_FI);
        
        movie3.setRating((float) 8.7);
        movie3.setRevenue((double) 460000000);
        
        Movie movie4 = new Movie();
        movie4.setName("Inception");
        movie4.setDirector("Christopher Nolan");
        movie4.setSummary("A thief who steals corporate secrets through the use"
                + "of dream-sharing technology is given the inverse task of planting"
                + " an idea into the mind of a C.E.O.");
        movie4.setCategory(Category.SUSPENSE);
        movie4.setRating((float) 8.8); 
        movie4.setRevenue((double) 826137188);
        movie4.setYear(2010);
        
        Scanner myObj = new Scanner(System.in); //Start & End of w3schools.com/java/java_user_input.asp
        System.out.println("Menu:\nDefault(All that is required): 1\nCreate a Movie: 2\n");
        int selectionNum = myObj.nextInt();
        if(selectionNum == 1){
        double movie1Rev = movie1.getRevenue();
        movie1Rev = movie1Rev/1000000000;
        System.out.println("Movie 1: " + "\nNAME: " + movie1.getName() + "\nDirector: " +
                movie1.getDirector() + "\nSummary: " + movie1.getSummary() + 
                "\nCategory: " + movie1.getCategory() + "\nRating: " + movie1.getRating() +
                "\nRevenue: $" + decimalFormat.format(movie1Rev) + " billion" + "\nYear: " + movie1.getYear() +
                "\nVersion: " + movie1.getVersion());
        
        double movie2Rev = movie2.getRevenue();
        movie2Rev = movie2Rev/1000000;
        System.out.println("\nMovie 2: " + "\nNAME: " + movie2.getName() + "\nDirector: " +
                movie2.getDirector() + "\nSummary: " + movie2.getSummary() + 
                "\nCategory: " + movie2.getCategory() + "\nRating: " + movie2.getRating() +
                "\nRevenue: $" + decimalFormat.format(movie2Rev) + " million" + "\nYear: " + movie2.getYear() +
                "\nVersion: " + movie2.getVersion());
        
        System.out.println("\nMovie 3:");
        movie3.Print(movie3);
        
        System.out.println("\nMovie 4:");
        movie4.Print(movie4);
        
        System.out.println("\nNumber of Movies: " + Movie.numOfMovies);
        }
        else{
            Movie movie5 = new Movie();
            System.out.println("Enter Movie Name: ");
            myObj.nextLine();
            String movieName = myObj.nextLine();
            movie5.setName(movieName);
            System.out.println("Enter Directors Name: ");
            String dirName = myObj.nextLine();
            movie5.setDirector(dirName);
            System.out.println("Category auto set to Unknown.");
            movie5.setCategory(Category.UNKNOWN);
            System.out.println("Enter Summary: ");
            String summary5 = myObj.nextLine();
            movie5.setSummary(summary5);
            System.out.println("Enter Rating: ");
            float rating5 = myObj.nextFloat();
            movie5.setRating(rating5);
            System.out.println("Enter Revenue: ");
            double revenue5 = myObj.nextDouble();
            movie5.setRevenue(revenue5);
            System.out.println("Enter Year: ");
            int year5 = myObj.nextInt();
            movie5.setYear(year5);
            System.out.println("Version is auto set.");
            System.out.println("\n\nYour Movie Is: ");
            movie5.Print(movie5);
        }
    }
    
}
