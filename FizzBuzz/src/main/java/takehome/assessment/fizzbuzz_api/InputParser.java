package takehome.assessment.fizzbuzz_api;

public class InputParser {
	
	//Parser class which will handle all types of data parsing, up to this moment only method is parsing from String to int, returning 0 if unsuccessful

	public int parseInputToInt(String strValue) {
		  try {
			  
		    return Integer.parseInt(strValue);
		    
		  } catch (NumberFormatException e) {
			  
		    return 0;
		    
		  }
		}
	
}
