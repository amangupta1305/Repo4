package Org.Testing.Utlilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	
	public static void takelog(String Classname, String message)
	{
		DOMConfigurator.configure("../YTFramework/LayOut.xml");
		Logger logs =Logger.getLogger(Classname);
		logs.info(message);
	}
}
