package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandlingUsingLoop {
	//NoSuchWindowException
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get the parentwindowhandle
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		//to get all the window handles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> handles = new ArrayList<>(windowHandles);
		for (String eachHandle : handles) {
			if (!eachHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachHandle).close();
			}
		}
		
		
	}

}
