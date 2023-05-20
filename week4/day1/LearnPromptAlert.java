 package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click show button
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
		//switch  control to the alert
		Alert promptAlert = driver.switchTo().alert();
		String alertMessage = promptAlert.getText();
		System.out.println(alertMessage);
		promptAlert.sendKeys("Subraja");
		promptAlert.accept();
		String text = driver.findElement(By.id("confirm_result")).getText();
		if (text.contains("Subraja")) {
			System.out.println("Input is passed in the alert and verified");
		}
	}

}
