package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	
	public ChromeDriver driver;

	@Given("Open the chrome browser")
	public void openBrowser() {
		driver = new ChromeDriver();
	}

	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as (.*)$")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as (.*)$")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Login not successfull");
		}
	}

	@But("ErrorMessage should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}

	@When("Click on crmsfa link")
	public void clickCrmsfaLink() {
       driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	@And("Click on Leads Link")
	public void clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();

	}
	@And("Click on CreateLead Link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();

	}
	@Given("Enter the companyName as (.*)$")
	public void enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}
	
	@And("Enter the firstname as (.*)$")
	public void enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}
	
	@And("Enter the lastname as (.*)$")
	public void enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}
	
	@When("Click on Submit button")
	public void clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

	}
	
	@Then("ViewLeadsPage should be displayed as (.*)$")
	public void verifyViewLeadsPage(String cName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}

	}



























}
