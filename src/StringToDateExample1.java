import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample1 {
	public static void main(String[] args) throws ParseException {
		String sdate1 ="26/12/1992";
		String sdate2 ="26-12-1992";
		String sdate3 = "12 31, 1998";  
		String sdate4 = "Thu, Dec 31 1998";  
		String sdate5 = "Thu, Dec 31 1998 23:37:50";  
		String sdate6 = "31-Dec-1998 23:37:50";  
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate1);
		Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sdate2);
		Date date3 = new SimpleDateFormat("dd MM, yyyy").parse(sdate3);
		Date date4 = new SimpleDateFormat("E, MMM dd yyyy").parse(sdate4);
		Date date5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss").parse(sdate5);
		Date date6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").parse(sdate6);
		System.out.println(sdate1 + " " + date1);
		System.out.println(sdate2 + " " + date2);
		System.out.println(sdate3 + " " + date3);
		System.out.println(sdate4 + " " + date4);
		System.out.println(sdate5 + " " + date5);
		System.out.println(sdate6 + " " + date6);
	}
}
