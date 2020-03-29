package takehome.assessment.fizzbuzz_api;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.lang.reflect.Method;


import java.util.List;

import org.testng.Assert;

/**
 * @author mariorojas
 *	Cylance TakeHome Assessment 
 */

public class FizzBuzzTest {
	
	private Generator generator;
	private List<String> list;
	private List<String> listCustom;
	
	
	@BeforeClass 
	public void setUp() {
		
		generator = new Generator();
		
		System.out.println(" ");
		System.out.println(" Default FizzBuzz => Range [1 - 50] /  values: [3, 5] / words: [Fizz, Buzz]");
		System.out.println(" ");
		list = generator.customGenerateFizzBuzz("1", "50", "3", "Fizz", "5", "Buzz");
		
	}
	
	@BeforeMethod
    public void setUpTestCaseReport(Method method)
    {
		String testName = method.getName(); 
        System.out.println("Executing Test: "+ testName);
        
    }
	
	@Test (priority=0)
	public void fizzBuzzGenerator_multipleOfThree_shouldReturnFizz() {
		
		//creating a subset of expected values being multiple of 3
		int[] threeMultiples= {3,6,9,12,18,21,24,27};
		
		for(int n: threeMultiples) {
			Assert.assertEquals(list.get(n-1), "Fizz");
		}
		
	}
	
	@Test (priority=0)
	public void fizzBuzzGenerator_multipleOfFive_shouldReturnBuzz() {
		
		//Subset of expected values being multiple of 5
		int[] fiveMultiples= {5,10,20,25,35,40,50};
		
		for(int n: fiveMultiples) {
			
			Assert.assertEquals(list.get(n - 1), "Buzz");
		}
	}
	
	@Test (priority=0)
	public void fizzBuzzGenerator_multipleOfThreeFive_shouldReturnFizzBuzz() {
		
		//Subset of expected values being multiple of both 3 and 5
		int[] threeFiveMultiples= {15,30,45};
		
		for(int n: threeFiveMultiples) {
			
			Assert.assertEquals(list.get(n - 1), "FizzBuzz");
		}
	}
	
	@Test (priority=0)
	public void fizzBuzzGenerator_nonMultipleOfThreeFive_shouldReturnPlainValue() {
		
		//Subset of expected values not being multiple of either 3 nor 5
		int[] nonThreeFiveMultiples= {1,2,4,7,8,11,13,14,16,17,19,22,23,26,28,29};
		
		for(int n: nonThreeFiveMultiples) {
			
			Assert.assertEquals(list.get(n - 1), String.valueOf(n));
		}
	
	}
	
	@Test (priority=0)
	public void fizzBuzzGenerator_rangeFromOneToFifty_shouldReturnOneAsInitialFiftyAsFinal() {
			
			//Since initial range is non-multiple, 1 should be displayed as "1"
			Assert.assertEquals(list.get(0), "1");
			
			//Since end range is multiple of 5, range value 50 should be displayed as "50"
			Assert.assertEquals(list.get(list.size()-1), "Buzz");
		
	}
	
	@Test (priority=0)
	public void fizzBuzzGenerator_invalidCustomRange_shouldThrowErrorAndReturnEmptyList() {
		
			//Valid range values meaning initial range should be less than upper limit value
			List<String> listCustom = generator.customGenerateFizzBuzz("50", "1", "3","Fizz","5","Buzz");
			Assert.assertEquals(listCustom.size(), 0);
			
	}
	
	@Test (priority=0)
	public void fizzBuzzGenerator_invalidCustomValues_shouldThrowErrorAndReturnEmptyList() {
			//Custom values expected to be numeric and within specified range
			List<String> listCustom = generator.customGenerateFizzBuzz("1", "50", "51", "Fizz", "-4", "Buzz");
			Assert.assertEquals(listCustom.size(), 0);
		
	}
	
	@Test (priority=1)
	public void fizzBuzzGenerator_customUpperLimit_shouldGenerateListUpToNewUpperLimit() {
			
			System.out.println(" ");
			System.out.println(" Custom FizzBuzz => Range [1 - 88] /  values: [3, 5] / words: [Fizz, Buzz]");
			System.out.println(" ");
			
			//Custom values expected to be numeric and within specified range
			listCustom = generator.customGenerateFizzBuzz("1", "88", "3", "Fizz", "5", "Buzz");
			
			Assert.assertEquals(listCustom.size(), 88);
			
	}
	
	@Test (priority=2)
	public void fizzBuzzGenerator_customRangeLimitCustomValueNamePair_shouldGenerateListWithinNewLimitsUsingNewValueWordPair() {
			
			System.out.println(" ");
			System.out.println(" Custom FizzBuzz => Range [6 - 101] /  values: [6,9] / words: [Foo, Bar]");
			System.out.println(" ");
			
			//Custom values expected to be numeric and within specified range
			listCustom = generator.customGenerateFizzBuzz("6", "101", "6", "Foo", "9", "Bar");
			
			
			//Assertion for expected number of list values , should be 90 items
			Assert.assertEquals(listCustom.size(), 96);
	
			
			//Assertion for multiples of new value 6 to be replaced with "Foo"
			int[] sixMultipleSubSet= {6,12,24,30,42,48,60,66,78,84,96};
			for(int n: sixMultipleSubSet) {
				Assert.assertEquals(listCustom.get(n - 6), "Foo");
			}

		
			//Assertion for multiples of new value 9 to be replaced with "Bar"
			int[] nineMultipleSubSet= {9,27,45,63,81,99};
			for(int n: nineMultipleSubSet) {
				Assert.assertEquals(listCustom.get(n - 6), "Bar");
			}
			
			
			//Assertion for multiples of both new values 6 and 9 to be replaced with "Foo" + "Bar"
			int[] sixNineMultipleSubSet= {18, 36, 54, 72, 90};
			for(int n: sixNineMultipleSubSet) {
				Assert.assertEquals(listCustom.get(n - 6), "FooBar");
			}
		
	}
	
	@AfterMethod
	public void setSpacing() {
		
			System.out.println(" ");
		}
	
	
	@AfterClass
	public void closingRemarks() {
		
			System.out.println("");
			System.out.println("NOTE: ERROR(S) generated for validation purposes ");
			
	}

}
