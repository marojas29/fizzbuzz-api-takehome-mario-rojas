package takehome.assessment.fizzbuzz.menu;


import java.util.Scanner;

import takehome.assessment.fizzbuzz_api.Generator;

/**
 * @author mariorojas
 *	Cylance TakeHome Assessment 
 */
public class Menu {
	
	   Generator generator = new Generator();
	   boolean exit;
	
	//Method to run menu, keep running until action to exit is selected, 
	// keep loading after executing option command from menu
    public void runMenu() {
    	
        printHeader();
        
        while (!exit) {
            printMenu();
            int choice = getMenuChoice();
            performAction(choice);
        }
    }
    
    //Menu banner
    private void printHeader() {
    	
        System.out.println("+--------------------------------------+");
        System.out.println("|             FizzBuzz                 |");
        System.out.println("|             Generator!               |");
        System.out.println("+--------------------------------------+");
        
    }
    
    //Menu options
    private void printMenu() {
    	
        displayHeader("Please make a selection");
        System.out.println("1) Generate default FizzBuzz");
        System.out.println("2) Generate with custom upper limit value");
        System.out.println("3) Generate custom value/word FizzBuzz");
        System.out.println("4) Generate with custom range AND custom value/word");
        System.out.println("0) Exit");
        
    }
    
    //Menu input data validation
    private int getMenuChoice() {
    	
        Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please.");
            }
            if (choice < 0 || choice > 4) {
                System.out.println("Choice outside of range. Please chose again.");
            }
        } while (choice < 0 || choice > 4);
        
        
        return choice;
        
    }

    //Method to handle all actions from menu options, based on option it will trigger menu action method from MenuActions class
    private void performAction(int choice) {
    	
    	MenuActions actions = new MenuActions();
    	
        switch (choice) {
            case 0:
                System.out.println("Bye Bye");
                System.exit(0);
                break;
            case 1:
            	generator.generateFizzBuzz();
            	  break;
            case 2:
            	actions.setUpperLimit();
                break;
            case 3:
                actions.setNewValuesWords();
                break;
            case 4:
                actions.setCustomRangeAndValuesWords();
                break;
            default:
                System.out.println("Unknown error has occured.");
                
        }
    }
    
    //Method to construct a header in console
    private void displayHeader(String message){
    	
        System.out.println();
        int width = message.length() + 6;
        
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        
        for(int i = 0; i < width; ++i){
            sb.append("-");
        }
        
        sb.append("+");
        System.out.println(sb.toString());
        System.out.println("|   " + message + "   |");
        System.out.println(sb.toString());
        
    }
    
}
