/*Seconds Since Unix Epoch:
999999999

Year: 2002
Month: 1
Day: 24
Hour: 1
Min: 46
Sec: 39


Seconds Since Unix Epoch:
178437

Year: 1970
Month: 0
Day: 2
Hour: 1
Min: 33
Sec: 57 */

import java.util.*;

public class TimeConversion {
    
    public static void main(String[] args) {
        
        char n = '\n';
        
        Scanner run = new Scanner(System.in);
        
        System.out.println("Seconds Since Unix Epoch:");
        
        int unix = run.nextInt();
        
        int seconds = unix % 60; // calculates remainding seconds
        
        int minutes = unix / 60; // calculates minutes
        
        int simplifiedMin = minutes % 60; // simplifies minutes after converting to hours
       
        int hours = minutes / 60; // calculates how many hours 
        
        int simplifiedHr = hours % 24; // simplifies hours by converting to days
        
        int days = hours / 24; // calculates days
        
        int simplifiedDays = days % 30; // simplifies days by converting to months
        
        int months = days / 30; // calculates months
        
        int simplifiedMonth = months % 12; // simplifies months by converting to years
        
        int year = (months / 12) + 1970; // calculates years and adds the quotient to the 1970 unix approach
        
        System.out.println(n + "Year: " + year + n + "Month: " + simplifiedMonth + n + "Day: " + simplifiedDays + n + "Hour: " + simplifiedHr + n + "Min: " + simplifiedMin + n + "Sec: " + seconds);
    }
   
}