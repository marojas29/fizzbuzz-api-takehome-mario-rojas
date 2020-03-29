/*
 author: Mario Rojas,
 Note: Template from integrating extent reports from naveen automation, however
 it has been heavy adjusted and migrated from version 3 to version 4
  
 * 
 */
package takehome.assessment.fizzbuzz.report_util;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG implements IReporter {
	
	private ExtentHtmlReporter htmlReporter;
	private ExtentReports extent;
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		
		htmlReporter = new ExtentHtmlReporter("./Reports/fizzbuzz_test_report.html");
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle("FizzBuzz Reports");
		htmlReporter.config().setReportName("FizzBuzz Test Results");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), Status.PASS);
				buildTestNodes(context.getFailedTests(), Status.FAIL);
				buildTestNodes(context.getSkippedTests(), Status.SKIP);
			}
		}

		extent.flush();
	}

	private void buildTestNodes(IResultMap tests, Status status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.createTest(result.getMethod().getMethodName());
				
			
				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.flush();
			}
		}
	}

}