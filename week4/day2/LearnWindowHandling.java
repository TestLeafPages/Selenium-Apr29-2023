package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {
	//NoSuchWindowException
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		//to get  a single window handle
		String pWindowHandle = driver.getWindowHandle();
		System.out.println(pWindowHandle);
		//to get the handles of allwindows opened
		Set<String> windowHandles = driver.getWindowHandles();//insertion order
		for (String each : windowHandles) {
			System.out.println(each);
		}
		//find the number of windows opened
		int size = windowHandles.size();
		System.out.println(size); 
		//to get particular window Handle, convert Set into List
		List<String> handles = new ArrayList<>(windowHandles);
	    //using list switch to the particular window
		driver.switchTo().window(handles.get(1));
		//get the title of the child window
		String cTitle = driver.getTitle();
		System.out.println(cTitle);
		if (!pTitle.equals(cTitle)) {
			System.out.println("Control is switched to new Window");
		}
		else {
			System.out.println("Control stays in the same page");
		}
		driver.quit();
		
	}

}
