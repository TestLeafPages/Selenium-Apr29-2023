package week7.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
public static void main(String[] args) {
	ChromeDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/window.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	//apply webdriverwait 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	driver.quit();
}
}
