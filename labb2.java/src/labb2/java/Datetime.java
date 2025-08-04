package labb2.java;
import java.util.Date;
public class Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate=new Date();
		System.out.println("Displays Date and Time :" +currentDate);
		
		System.out.println("Time :" +currentDate.getTime());
		System.out.println("Date :"+currentDate.getDate());
		System.out.println("day :" +currentDate.getDay());
		System.out.println("houre :" +currentDate.getHours());
		System.out.println("Minutes :"+currentDate.getMinutes());
		System.out.println("Seconds : " +currentDate.getSeconds());
		System.out.println("Time zone offset :" +currentDate.getTimezoneOffset());
		System.out.println("Year : " +currentDate.getYear());
		System.out.println("Class : "+currentDate.getClass());
	}

}
