
public class Test {
	
	public static void Test_Console_RunAll()
		{
		Test_Console_NewLine();
		Test_Console_Print();
		Test_Console_PrintLn();
		Test_Console_repeatChar();
		Test_Console_repeatStr();

		}
	
	public static void Test_Console_NewLine()
	{
		for (int i = 0; i < 10; i++)
		{
			Debug.logInfo("Test_Console_NewLine() - Test " + i + " - Printing " + i + " newLines");
			Console.newLine(i);
		}
	}
	
	public static void Test_Console_Print()
	{
		for (int i = 0; i < 10; i++)
		{
			Debug.logInfo("Test_Console_Print() - Test " + i);
			Console.print("\tTest: " + i);
		}
	}
	
	public static void Test_Console_PrintLn()
	{
		for (int i = 0; i < 10; i++)
		{
			Debug.logInfo("Test_Console_PrintLn() - Test " + i);
			Console.println("\tTest: " + i);
		}
	}
	
	public static void Test_Console_repeatChar()
	{
		for (int i = 0; i < 10; i++)
		{
			Debug.logInfo("Test_Console_repeatChar() - Test " + i + " will print via type casting " + i + " to its char equvilent");
			Console.repeatChar(i, (char) i);
		}
	}
	
	public static void Test_Console_repeatStr()
	{
		for (int i = 0; i < 10; i++)
		{
			Debug.logInfo("Test_Console_repeatStr() - Test " + i + " will print " + i);
			Console.repeatStr(i, "\tTest: " + i);
		}
		
	}

}
