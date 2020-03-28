package takehome.assessment.fizzbuzz.menu;

import java.util.Scanner;

import takehome.assessment.fizzbuzz_api.Generator;

/**
 * @author mariorojas
 *	Cylance TakeHome Assessment 
 */

public class MenuActions {
	
	Generator generator = new Generator();
	Scanner keyboard = new Scanner(System.in);
	
	/*These methods gathers the input data for new custom lower/upper limit range AND custom values/words
	NOTE: Data Type Error handling try/catch block usually implemented in here as well, 
	However by nature of assessment, data validation to be handled only at API level */
	
	//Set upper limit and run with default values
	public void setUpperLimit() {
		
		System.out.println("New range value -> Input new upper limit: ");
		String upperLimit = keyboard.nextLine();
		
		System.out.println("--------- GENERATING... ---------\n");
		
		generator.customGenerateFizzBuzz("1", upperLimit, "3", "Fizz", "5", "Buzz");
	}
	
	//Set new custom values and words and run with default range values
	public void setNewValuesWords()  {
			
		System.out.println("Custom value -> Input first numeric value: ");
		String valueOne = keyboard.nextLine();
			
		System.out.println("Custom word for value 1 -> Input new word option: ");
		String wordValueOne = keyboard.nextLine();
			
		System.out.println("Custom value -> Input first numeric value: ");
		String valueTwo = keyboard.nextLine();
			
		System.out.println("Custom word for value 2 -> Input new word option: ");
		String wordValueTwo = keyboard.nextLine();
			
			
		System.out.println("--------- GENERATING... ---------\n");
			
		generator.customGenerateFizzBuzz("1", "100", valueOne, wordValueOne, valueTwo, wordValueTwo);
	}
	
	//Set new custom range values and custom value/word and run with all custom values
	public void setCustomRangeAndValuesWords() {
		
		System.out.println("New range value -> Input new lower limit: ");
		String lowerLimit = keyboard.nextLine();
		
		System.out.println("New range value -> Input new upper limit: ");
		String upperLimit = keyboard.nextLine();
		
		System.out.println("Custom value -> Input first numeric value: ");
		String valueOne = keyboard.nextLine();
		
		System.out.println("Custom word for value 1 -> Input new word option: ");
		String wordValueOne = keyboard.nextLine();
		
		System.out.println("Custom value -> Input first numeric value: ");
		String valueTwo = keyboard.nextLine();
		
		System.out.println("Custom word for value 2 -> Input new word option: ");
		String wordValueTwo = keyboard.nextLine();
		
		
		System.out.println("--------- GENERATING... ---------\n");
		
		generator.customGenerateFizzBuzz(lowerLimit, upperLimit, valueOne, wordValueOne, valueTwo, wordValueTwo);
}
	
}
