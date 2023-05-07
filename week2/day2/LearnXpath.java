package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
		
		//To launch Edge browser
		//EdgeDriver driver2 = new EdgeDriver();
		
		//To load an url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize 
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to enter username//ctrl+2,l
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		
     

	}

}
