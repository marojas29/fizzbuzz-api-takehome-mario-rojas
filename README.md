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

```  
+-----------------------------+
|   Please make a selection   |
+-----------------------------+
1) Generate default FizzBuzz
2) Generate with custom upper limit value
3) Generate custom value/word FizzBuzz
4) Generate with custom range AND custom value/word
0) Exit
Enter your choice:   
```  

- Be sure to input numeric values where numeric values are expected (int), although data type validation as been covered as well.

Note: data type validation has been handled only at API level, this per the nature of this assessment, usually my approach would be to implement data check at client and server side for data parameters, following a "fast-fail" approach.

Having said that, non-numeric input values have been covered accordingly 

Once you select a valid choice, and input all parameters accordingly, a list-generate method is triggered which will automatically print values based on specifications.

The application has been design to loop until user selects option to exit (choice 0).

### Prerequisites
- SDK: Since the nature of this project is java (jar executable file) having an SDK is a prerequisite 

    Note: If you haven't installed yet an up-to-date SDK on your computer here is where you can download and install it accordingly 
    https://www.oracle.com/java/technologies/sdk-downloads.html

- For executing test validation scripts, having installed MAVEN is a prerequisite as well

    Note: If you haven't installed yet Maven, here is where you can download and install it accordingly 
   http://maven.apache.org/install.html
   
Note: Helpful resource to Maven installation instructions: https://howtodoinjava.com/maven/how-to-install-maven-on-windows/ 

Due to time constraints and simplicity, current implementation has still room for improvement for sure, example such as adding Extent Report capabilities for script execution (right now is only supporting those provided by testNG ), also adding a properties file so no parameter in the source code is hard coded and therefore a more scalable and more data driven fashion is achieved. Moreover, some refactoring with the test class for it to be more scalable with case by case scenario (so far I have included top 9 scenarios as sannity test but the more requirements and more complexity, the more validations might be required).

### UPDATE [3/29]: Extent Reports capability has been implemented successfully, instructions and more details explained below


### Installing
Since this is a executable jar file based on a Maven project, no further installation other than having SDK would be neccessary to ensure proper execution.

Clone or download github repository accordingly: https://github.com/marojas29/fizzbuzz-api-takehome-mario-rojas.git

### Coding style
Program has been compiled into a executable jar file (FizzBuzz.jar) 
This program is based on Maven proyect, which has already defined all dependencies in a POM.xml file


## Jar Execution

In order to execute this program, it can be done using command prompt, to do so follow the next steps: 

* 1.- At your command prompt go to FizzBuzz proyect directory
- Example: /Users/mariorojas/FizzBuzz

* 2.- Run command for executing jar file

- Jar Execution Command: Run the following command on your command prompt (at 'FizzBuzz' proyect directory)

```
java -jar FizzBuzz.jar
```

## Test Suite execution
In order to execute this program, it can be done using command prompt, to do so follow the next steps (Making sure Maven has been already installed in your computer): 

Note: Helpful resource to Maven installation instructions: https://howtodoinjava.com/maven/how-to-install-maven-on-windows/ 

* 1.- At your command prompt go to FizzBuzz proyect directory
- Example: /Users/mariorojas/FizzBuzz

* 2.- Run command for maven clean test (this command will trigger validation scripts to be run)
```
mvn clean test
```

## Test reports

Due to time constraints, reporting has been only implemented using testNG libraries, this report is generated as a html file right after every script execution, you can find this file at the following proyect directory path.

```
fizzbuzz-api-takehome-mario-rojas/FizzBuzz/test-output/index.html
```

Tip for better visualitazion is to download file and use any broswer to visualize file.

At the home page, at the left upper corner, a link for "Passed methods (show)" is shown,
once clicked, more execution details are provided.


### UPDATE [3/29]: Extent Reports integration has been completed*
New fresh html report will be generated once every mvn clean test is executed, this file will be stored at a dedicated folder directory [fizzbuzz-test-report.html]

```
fizzbuzz-api-takehome-mario-rojas/FizzBuzz/Reports/fizzbuzz-test-report.html
``` 

## Built With
* [SDK](https://www.oracle.com/java/technologies/sdk-downloads.html) - Java ME Software Development Kit
* [Maven](https://maven.apache.org/) - Dependency Management
* [testNG](https://testng.org/doc/index.html) - API Library for testing and assertion frameworks
* [ExtentReports](https://extentreports.com/docs/versions/4/java/) - API Library for creating HTML reports out of testNG results


## Author

**Mario Rojas**
