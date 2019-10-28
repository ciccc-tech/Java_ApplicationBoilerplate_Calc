
public class BasicMath {

	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static float add(float a, float b)
	{
		return a + b;
	}
	
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	public static int sub(int amount, int from)
	{
		// i  can also 
		// return amount - from;
		// but here i do a math trick, reverse the sign and reuse my add method
		return add(from*-1,amount);
	}
	
	public static float sub(float amount, float from)
	{
		// i  can also 
		// return amount - from;
		//but here i do a math trick, reverse the sign and reuse my add method
		return add(from*-1,amount);
	}
	
	public static double sub(double amount, double from)
	{
		// i  can also 
		// return amount - from;
		// but here i do a math trick, reverse the sign and reuse my add method
		return add(from*-1,amount);
	}
	
	public static int mul(int amount, int by)
	{
		// i  can also 
		// return amount * by;
		// but here i chose to add repeatably 
		int aResult = 0;
		for (int i = 0; i < by; i++) {
			aResult = add(by,amount); 
		}
		return aResult;
	}
	
	public static float mul(float amount, float by)
	{
		// i  can also 
		// return amount * by;
		// but here i chose to add repeatably 
		float aResult = 0;
		for (int i = 0; i < by; i++) {
			aResult = add(by,amount); 
		}
		return aResult;
	}
	
	public static double mul(double amount, double by)
	{
		// i  can also 
		// return amount * by;
		// but here i chose to add repeatably 
		double aResult = 0;
		for (int i = 0; i < by; i++) {
			aResult = add(by,amount); 
		}
		return aResult;
	}
	
	public static int div(int amount, int by)
	{
		// i  can also 
		// return amount / by;
		// but here i chose to sub repeatably 
		int aResult = 0;
		for (int i = 0; i < by; i++) {
			aResult = sub(by,amount); 
		}
		return aResult;
	}
	
	public static float div(float amount, float by)
	{
		// i  can also 
		// return amount / by;
		// but here i chose to sub repeatably 
		
		float aResult = 0;
		for (int i = 0; i < by; i++) {
			aResult = sub(by,amount); 
		}
		return aResult;
	}
	
	public static double div(double amount, double by)
	{
	// i  can also 
	// return amount / by;
	// but here i chose to sub repeatably 
		
		double aResult = 0;
		for (int i = 0; i < by; i++) {
			aResult = sub(by,amount); 
		}
		return aResult;
	}
	
	
	
	

}
