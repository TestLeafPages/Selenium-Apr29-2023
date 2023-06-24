package week9.day1;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// Common for all the test cases (Step1 to Step3)
		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();
		
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);
		
						
		// Step4: Create a test cases and assign test details
											// testName 	//testDescription
		ExtentTest test1 = extent.createTest("VerifyLogin", "Login with valid credential");
		test1.assignCategory("smoke");
		test1.assignAuthor("Hari");			
		
		ExtentTest test2 = extent.createTest("Create Lead", "Create Lead with mandatory data");
		test2.assignCategory("regression");
		test2.assignAuthor("Subraja");	
																					//.. -> used to come out of reports	
		// Step5: Step level status
		test1.pass("Enter username",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/login.png").build()); //test step1
		test1.pass("Enter password"); //test step2
		test1.pass("Click Login button"); // test step3
		
		test2.pass("Submit create lead"); //test step1
		
		// step6: Mandatory step
		extent.flush();

	}

}
