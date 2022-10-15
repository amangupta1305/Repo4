package Org.Testings.Assertio;

import org.testng.Assert;

public class Aserti {

	public static void assertions(String ExpectedResult, String Actualresult)
	{
		if(Actualresult.equals(ExpectedResult))
		{
			System.out.println("Assertion Pass");
		}
	else
	{
		System.out.println("Assertion failed");
	}
	}
		
		public static void Verifytitle(String Expectedtitle, String Actualtitle)
		{
			if(Actualtitle.equals(Expectedtitle))
			{
				System.out.println("title is mactching");
			}
		else
		{
			System.out.println("title is not mactching");
		}
		}
}


