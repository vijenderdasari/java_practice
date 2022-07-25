/* JFM1T6_Assignment4:

   Write a program to display current date-time. Hint: java.util package contains Date class.
   
   Sample Output:
   Date in Indian Timezone (IST) : 18-02-21 10:20:195 IST

*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDateTime {

//main method
public static void main(String[] args){
SimpleDateFormat  format1=new SimpleDateFormat("dd/MM/yy HH:mm:ss z");
/* 
capture today's date by
Date today = new Date();
*/
Date today=new Date();
//create DateFormat and set TimeZone 
format1.setTimeZone(TimeZone.getTimeZone("IST"));

//display this date on IST time zone 
System.out.println(format1.format(today));
}
}