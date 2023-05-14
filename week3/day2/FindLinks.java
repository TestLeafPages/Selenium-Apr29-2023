package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		//return type of findElement()-> WebElement
		//return type of findElements() -> List<WebElement>
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to find links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//to find the number of links
		int size = allLinks.size();
		System.out.println("The number of links available in this page : "+size);
		
		//to retrieve a particular link out of all links
		WebElement secondLinkWebElement = allLinks.get(2);
		String text = secondLinkWebElement.getText();
		System.out.println(text);
		
		//to print all the links 
		/*
		 * for (int i = 0; i <=size; i++) { String allLinksList =
		 * allLinks.get(i).getText(); System.out.println(allLinksList);
		 * 
		 * }
		 */
		
		//Declare a list
		List<String> list = new ArrayList<>();
		
		//foreach loop
		//   datatype    variable  :  data
		for (WebElement each : allLinks) {
			String text2 = each.getText();
			//System.out.println(text2);
			//add all the elements into the list
			list.add(text2);
			
		}
		
		System.out.println(list);
		
		
	}

}
