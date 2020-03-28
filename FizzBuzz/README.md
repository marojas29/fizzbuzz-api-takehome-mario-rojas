# Cylance Take Home Assessment by Mario Rojas
Take Home Assessment for Cylance

## Getting Started
Few context about this project:

Goal: Write a program that prints the numbers 1 to 100, but replaces multiples of 3 with "Fizz", multiples of 5 with "Buzz", and multiples of 3 and 5 with "FizzBuzz".

Now let's pretend that our FizzBuzz application is super useful and has strong market potential. Customers are going to love it! But before we can start selling it, there are a few improvements we need to make.

Refactor your FizzBuzz code into a reusable class library so it can be invoked by external consumers such as ASP.NET, console, or WPF applications. Your Visual Studio solution should still have the original console app; it should be programmed to call into your new class library using the the defaults specified below.  
By default, the class library should return the numbers 1 to 100, replacing numbers that are evenly divisible by 3 with "Fizz" and those that are evenly divisible by 5 with "Buzz".  
Optionally, consumers of this library should be able to pass in their own upper limit, instead of using the default of 100.  
The library should also optionally allow consumers to pass in their own number / replacement word pairs. For example, maybe I want to specify an upper limit of 8,675,309 and replace numbers evenly divisible by 6 with "Foo" and those that are evenly divisible by 9 with "Bar".  
The library should return numbers / replacement words as soon as they are generated, rather than in a single batch.  

## Approach  
- Implemented in Java framework  
- For dependency management Maven
- For validation / unit testing  testNG framework (test framework and assertions libraries)

For the FizzBuzz program, I implemented a simple console interface where user input is expected, based on that the program will use fizzbuzz-api class methods to generate fizzbuzz list with either default OR custom parameters

The menu is the following: 

+-----------------------------+
|   Please make a selection   |
+-----------------------------+
1) Generate default FizzBuzz
2) Generate with custom upper limit value
3) Generate custom value/word FizzBuzz
4) Generate with custom range AND custom value/word
0) Exit
Enter your choice:   

- Be sure to input numeric values where numeric values are expected (int), although data type validation as been covered as well.

Note: data type validation has been handled only at API level, this per the nature of this assessment, usually my approach would be to implement data check at client and server side for data parameters, following a "fast-fail" apprroach.

Having said that, non-numeric input values have been covered accordingly 

Once you select a valid choice, and input parameters accordingly, a list generate method is triggered which will automatically print values based on specifications

The application has been design to loop until user selects option to exit (choice 0)

### Prerequisites
- SDK: Since the nature of this project is java (jar executable file) having an SDK is a prerequisite 

    Note: If you haven't installed yet an up-to-date SDK on your computer here is where you can download and install it accordingly 
    https://www.oracle.com/java/technologies/sdk-downloads.html

- For executing test validation scripts, having installed MAVEN is a prerequisite as well

    Note: If you haven't installed yet an up-to-date SDK on your computer here is where you can download and install it accordingly 
    https://www.oracle.com/java/technologies/sdk-downloads.html


Due to time constraints and simplicity, current implementation has room for improvement for sure such as adding Extended Report capabilities for each script execution, adding a properties file so no parameter in the source code is hard coded and therefore a more scalable and more data driven fashion is achieved, as well as few refactoring with the test class for it to be more scalable with case by case scenario (so far I included top 9 scenarios as sannity test but the more requirements and more complexity, the more validations are required)


### Installing
Since this is a executable jar file based on a Maven project, no further installation other than having SDK would be neccessary to ensure proper execution.

clone or download github repository accordingly: 

### Coding style
Program has been compiled into a executable jar file (fizzbuzz.jar) 
This program is based on Maven proyect, which has already defined all dependencies in a POM.xml file


## Execution

In order to execute this program, it can be done by requirements using command prompt, to do so follow the next steps: 

* 1.- At your command prompt go to 'whole-foods-take-home-test' root directory 
- Example: /Users/mariorojas/WholeFoods_TakeHomeTest_MarioRojas

* 2.- Run command for executing jar file as well as define parameters for input and output accordingly which aligns with txt file and expected Json file 
- Note: Input text file must have proper formatting (explained above) and it should be inside root directory

- Jar Execution Command: Run the following command on your command prompt (at 'whole-foods-take-home-test' root directory)

```
java -jar rscrape.jar inFile.txt outFile.json
```


## Built With
* [SDK](https://www.oracle.com/java/technologies/sdk-downloads.html) - Java ME Software Development Kit
* [Maven](https://maven.apache.org/) - Dependency Management
* [JSoup](https://jsoup.org/) - API Library for extracting and manipulating data
* [SIMPLE Json](https://github.com/fangyidong/json-simple) - JSON.simple is a simple Java toolkit for JSON


## Author

* **Mario Rojas**

