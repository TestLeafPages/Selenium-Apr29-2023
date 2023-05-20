package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		//NoAlertPresentException
		//UnhandledAlertException
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch  control to the alert
		Alert simpleAlert = driver.switchTo().alert();
		//Read the text of the alert
		String alertMessage = simpleAlert.getText();
		System.out.println("Alert Message: "+alertMessage);
//		//accept the alert
        simpleAlert.accept();
		//read the confirmation message
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println("After accepitng the alert: "+text);
	}

}
