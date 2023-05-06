package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
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
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//to verify with title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
