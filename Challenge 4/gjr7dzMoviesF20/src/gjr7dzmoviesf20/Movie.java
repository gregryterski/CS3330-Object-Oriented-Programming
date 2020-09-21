/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjr7dzmoviesf20;

import gjr7dzmoviesf20.Gjr7dzMoviesF20.Category;
import java.text.DecimalFormat;


public class Movie {
    private String name;
    private String director;
    private String summary;
    private float rating = 0.0f;
    private double revenue = 0.0;
    private Category category;
    private int year = 1888;
    private int version;
    public static int numOfMovies = 0;
    
    public Movie(){
        this.version = 0;
        this.name = "";
        this.director = "";
        this.numOfMovies++;
    }
    
    public Movie(String name, String director){
        this();
        this.name = name;
        this.director = director;
    }
    
    public Movie(String name, String director, String summary, int year, Category category){
        this(name, director);
        this.summary = summary;
        this.year = year;
        this.category = category;
        this.version = 1;
    }
    
    public Movie(String name, String director, String summary, int year, float rating, double revenue, Category category){
        this(name, director, summary, year, category);
        this.rating = rating;
        this.revenue = revenue;
        this.version = 1;
    }
    
    public void setName(String name){
        this.name = name;
        this.version++;
    }
    
    public void setDirector(String director){
        this.director = director;
    }
    
    public void setRating(float rating){
        this.rating = rating;
        this.version++;
    }
    
    public void setRevenue(double revenue){
        this.revenue = revenue;
        this.version++;
    }
    
    public void setYear(int year){
        this.year = year;
        this.version++;
    }
    
    public void setCategory(Category category){
        this.category = category;
    }
    
    public void setSummary(String summary){
        this.summary = summary;
        this.version++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public float getRating(){
        return this.rating;
    }
    
    public double getRevenue(){
        return this.revenue;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public Category getCategory(){
        return this.category;
    }
    
    public String getSummary(){
        return this.summary;
    }
    
    public int getVersion(){
        return this.version;
    }
    
    public void Print(Movie moviee){
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); //Start of java67.com/2015/06/how-to-format-number-in-java.html
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3); //End of java67.com/2015/06/how-to-format-number-in-java.html
        double revNum = moviee.getRevenue();
        
        //If statement created to see if the revenue could be simplified and added with a suffix, "billion", "million", "thousand"
        if(revNum >= 1000000000){
        revNum = revNum/1000000000;
        System.out.println("NAME: " + moviee.getName() + "\nDirector: " + moviee.getDirector() +
        "\nSummary: " + moviee.getSummary() + "\nCategory: " + moviee.getCategory() +
        "\nRating: "+ moviee.getRating() + "\nRevenue: $" + decimalFormat.format(revNum) + " billion" +
        "\nYear: " + moviee.getYear() + "\nVersion: " + moviee.getVersion());
        }
        else if(revNum >= 1000000 && revNum <= 1000000000){
        revNum = revNum/1000000;
        System.out.println("NAME: " + moviee.getName() + "\nDirector: " + moviee.getDirector() +
        "\nSummary: " + moviee.getSummary() + "\nCategory: " + moviee.getCategory() +
        "\nRating: "+ moviee.getRating() + "\nRevenue: $" + decimalFormat.format(revNum) + " million" + 
        "\nYear: " + moviee.getYear() + "\nVersion: " + moviee.getVersion());
        }
        else if(revNum >= 1000 && revNum <= 1000000){
        revNum = revNum/1000;
        System.out.println("NAME: " + moviee.getName() + "\nDirector: " + moviee.getDirector() +
        "\nSummary: " + moviee.getSummary() + "\nCategory: " + moviee.getCategory() +
        "\nRating: "+ moviee.getRating() + "\nRevenue: $" + decimalFormat.format(revNum) + " thousand" + 
        "\nYear: " + moviee.getYear() + "\nVersion: " + moviee.getVersion());
        }
        else{
        System.out.println("NAME: " + moviee.getName() + "\nDirector: " + moviee.getDirector() +
        "\nSummary: " + moviee.getSummary() + "\nCategory: " + moviee.getCategory() +
        "\nRating: "+ moviee.getRating() + "\nRevenue: $" + decimalFormat.format(revNum) + 
        "\nYear: " + moviee.getYear() + "\nVersion: " + moviee.getVersion());
        }
    }
}
