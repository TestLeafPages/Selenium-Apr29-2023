package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String[] args) {
		//To launch the browser(Chrome browser)
		//Create object for ChromeDriver
		
		ChromeDriver driver = new ChromeDriver();
		
		//To launch Edge browser
		//EdgeDriver driver2 = new EdgeDriver();
		
		//To load an url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize 
		driver.manage().window().maximize();
		
		//to enter username//ctrl+2,l
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crmsfa link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//to verify with title
		String title = driver.getTitle();
		System.out.println(title);
		
		//click leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//click CreateLead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		
		//enter leastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//Source DropDown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select sec = new Select(sourceDD);
		
	    //selectByIndex() for Source dropdown 
		sec.selectByIndex(4);
		
		//Ownership Dropdown
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec1 = new Select(ownershipDD);
		sec1.selectByVisibleText("Corporation");
		
		
		//Marketing campaign dropdown
		WebElement marketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec2 = new Select(marketingCampaignDD);
		sec2.selectByValue("CATRQ_AUTOMOBILE");
		
		
		//Click CreateLead Button
		driver.findElement(By.name("submitButton")).click();
		/*
		 * //selectBYVisibleText(); //sec.selectByVisibleText("Existing Customer");
		 * 
		 * 
		 * //selectByValue(); sec.selectByValue("LEAD_PARTNER");
		 */
		
		
	}

}
