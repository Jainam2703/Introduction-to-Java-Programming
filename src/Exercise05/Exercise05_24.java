package Exercise05;

/*
(Display current date and time) Listing 2.6, ShowCurrentTime.java, displays the
current time. Improve this example to display the current date and time. 
The calendar example in Listing 5.12, PrintCalendar.java, should give you some ideas on
how to find the year, month, and day.
*/
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
/**
 * 
 * @author JAINAM MEHTA (20CS035)
 * @email 20cs035@charusat.edu.in
 * 
 */
public class Exercise05_24 {
    
public static void main(String[] args) {
    
        DateTimeFormatter Date = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
        
        LocalDateTime now = LocalDateTime.now(); 
        
         // Display current date 
        System.out.println("The current Date is :" + Date.format(now)); 
         
        time();
        
	}

public static String time() {
    
	// Obtain the total milliseconds 
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds 
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;
        
        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display current time
        System.out.println("Current time is : " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");
        
        return "0";
         
    }
}
 
	
		
		