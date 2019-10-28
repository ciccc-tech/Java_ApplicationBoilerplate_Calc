/**
 * 
 */

/**
 * @author Ivan Malone
 *
 */
public class App {
	
	
	// A Reference to our CommandLine object we created in CommandLine.java
	private static CommandLine cmdLine;
	
	// Set a default value to false will keep our program running
	private static boolean _shouldTerminate = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an 'instance' of CommandLine object with the name cmdLine
		cmdLine = new CommandLine(args); // give it 'args' so that it knows what arguments were used (if any) on startup
		
		do  // this code will be run at least 'once' and if _shouldTerminate == false, then it will continue to loop
			{
			
			} while (_shouldTerminate == false); // will only exit if _shouldTerminate is true 

	}

}
