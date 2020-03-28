package takehome.assessment.fizzbuzz_api;

import java.util.ArrayList;
import java.util.List;
import takehome.assessment.fizzbuzz_api.InputParser;

/**
 * @author mariorojas
 *	Cylance TakeHome Assessment 
 */

public class Generator {
	
	public InputParser parse = new InputParser(); 

	/*NOTE: This method is just for reference purposes with default values, this since very same behavior and output can be achieved by using custom method below
	/ customGenerateFizzBuzz("1", "100", 3, "Fizz", "5", "Buzz"); */
	

	//Base method to generate default FizzBuzz 
	public List <String> generateFizzBuzz(){
		
		List <String> list = new ArrayList <String>(); //list to store generated list
		
		int initialRange = 1;
		int finalRange = 100;
		String multipleThree = "Fizz";
		String multipleFive = "Buzz";
		
		System.out.println(Integer.MAX_VALUE); // max supported value => 2147483647
		
		for(int i = initialRange; i <= finalRange; i++) {
			
			//Multiples of both 3 and 5 will return combination of FizzBuzz
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(multipleThree + multipleFive);
				list.add(multipleThree + multipleFive);
				
			 //Multiples of 3 will return Fizz 		
			} else if(i % 3 == 0) {
				System.out.println(multipleThree);
				list.add(multipleThree);
				
			 //Multiples of 5 will return Buzz	
			} else if(i % 5 == 0) {
				System.out.println(multipleFive);
				list.add(multipleFive);
				
			  //Any other value not multiple of either 3 or 5 will return plain value	
			} else {
				System.out.println(i);
				list.add(i + "");
			}
		}
		
		//Storing results into an array list to be used as testing reference
		return list;
	}
	
	//Generate FizzBuzz with custom parameters for range and for values and words implemented
	public List<String> customGenerateFizzBuzz(String strInitialRange, String strFinalRange, String strValueOne, String wordValueOne, String strValueTwo, String wordValueTwo){
		
		List <String> list = new ArrayList <String>(); //list to store generated list
		
		//Parse input values to int data type 
		int initialRange = parse.parseInputToInt(strInitialRange);
		int finalRange = parse.parseInputToInt(strFinalRange);
		int valueOne = parse.parseInputToInt(strValueOne);
		int valueTwo = parse.parseInputToInt(strValueTwo);
		
		//Data validation
		// Range Validation
		if(initialRange > finalRange) {
			System.out.println("[ ERROR - Invalid Range Values ]: Lower: " + initialRange + " / Upper: " + finalRange + " --Upper limit value expected to be greater or equal than lower limit.");
			return list;
		}
		// Values validation, expected to be within range values
		if(valueOne < initialRange || valueOne > finalRange || valueTwo < initialRange || valueTwo > finalRange) {
			System.out.println("[ ERROR - Invalid Values ] " + "Value 1 = " + valueOne + " / Value 2 = " + valueTwo +  " --Value or values expected to be numeric and within specified range");
			return list;
		}
		
		for(int i = initialRange; i <= finalRange; i++) {
			
			//Multiples of both valueOne and valueTwo will return combination of their corresponding words
			if(i % valueOne == 0 && i % valueTwo == 0) {
				System.out.println(wordValueOne + wordValueTwo);
				list.add(wordValueOne + wordValueTwo);
				
			  //Multiples of valueOne will return word for valueOne 		
			} else if(i % valueOne == 0) {
				System.out.println(wordValueOne);
				list.add(wordValueOne);
				
			 //Multiples of valueTwo will return word for valueTwo	
			} else if(i % valueTwo == 0) {
				System.out.println(wordValueTwo);
				list.add(wordValueTwo);
				
			  //Any other value not multiple of either valueOne or valueTwo will return plain value	
			} else {
				System.out.println(i);
				list.add(i + "");
			}
		}
		
		//Storing results into an array list to be used as testing reference
		return list;
	}
}
