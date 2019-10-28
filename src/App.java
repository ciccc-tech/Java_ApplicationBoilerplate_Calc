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
	
	// If true, we will run our tests
	private static boolean _shouldRunTests = false;

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an 'instance' of CommandLine object with the name cmdLine
		cmdLine = new CommandLine(args); // give it 'args' so that it knows what arguments were used (if any) on startup
		
		// set this depending on if -runTests is on the command line or not
		_shouldRunTests = cmdLine.doesArgumentExists("-runTests");		
		// should we run our tests?
		if (_shouldRunTests == true)
			{
			Debug.log("Found -runTests in argument list: - will run tests now");
			//lets run some tests
			Test.Test_Console_RunAll();
			}
		// 
		
		do  // this code will be run at least 'once' and if _shouldTerminate == false, then it will continue to loop
			{
			
			} while (_shouldTerminate == false); // will only exit if _shouldTerminate is true 

	}

}
