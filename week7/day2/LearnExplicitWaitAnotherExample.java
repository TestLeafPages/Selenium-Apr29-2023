package week7.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWaitAnotherExample {
public static void main(String[] args) {
	ChromeDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/waits.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	//apply WebDriverWait
	WebElement visibileEle = driver.findElement(By.xpath("//span[text()='I am here']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(visibileEle));
	System.out.println(visibileEle.getText());
}

}
