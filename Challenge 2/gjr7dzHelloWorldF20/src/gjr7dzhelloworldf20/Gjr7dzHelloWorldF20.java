/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gjr7dzhelloworldf20;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gregryterski
 */
public class Gjr7dzHelloWorldF20 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        String myPawPrint = "\"gjr7dz\"";
        System.out.println("Hello World!");
        
        invokeMe(myPawPrint);
    }
    
    public static void invokeMe(String pawPrint){
        System.out.println("My PawPrint is " + pawPrint);
        
        ZoneId zoneId = ZoneId.of("US/Central"); //Start of geeksforgeeks.org/clock-system-method-in-java-with-examples/
        Clock clock = Clock.system(zoneId);
        
        Instant instant = clock.instant();
        ZonedDateTime time = instant.atZone(clock.getZone()); //End of website usage
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm a"); //Start & End of stackabuse.com/how-to-get-current-date-and-time-in-java/
        String currentTime = time.format(formatter);
        System.out.println("Today's date is " + currentTime);
    }
}
