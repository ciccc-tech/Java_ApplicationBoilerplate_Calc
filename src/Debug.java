import java.sql.Date;
import java.text.SimpleDateFormat;

public class Debug {
	
	
	
	public static void log(String message)
	{
	Console.println("[" + getDateTimeString() + "] - " + message);
	}
	
	public static void logInfo(String  message)
	{
		
	}
	
	public static void logWarning(String  message)
	{
		
	}
	
	public static void logException(String  message)
	{
		
	}
	
	public static String getDateTimeString()
	{
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}


}
