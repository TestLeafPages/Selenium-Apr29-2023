package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		//return type of findElement()-> WebElement
		//return type of findElements() -> List<WebElement>
		
		ChromeDriver driver = new ChromeDriver();
		//Load the url(https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for mobiles in the search box ad click Enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		//get all the mobile price
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		
		//Declare a list
		List<Integer> list = new ArrayList<>();
		//Iterate through for each loop and get text
		for (WebElement each : prices) {
			String text = each.getText();//10,988
			//replace , using replacaAll() 
			String replacedString = text.replaceAll(",", "");
			//Donot allow white spaces before converting String to Integer
			if (!replacedString.isEmpty()) {
				//Convert String to Integer
				int priceValues = Integer.parseInt(replacedString);
				//add all price values into the list
				list.add(priceValues);
			}
			
			
		}
		
		int listSize = list.size();
		System.out.println(listSize);
		
		//To remove duplicates
		//Declare a Set
		//To add list values into the Set, pass the list name into Set constructor
		Set<Integer> unique = new TreeSet<>(list);
		int setSize = unique.size();
		System.out.println(setSize);
		//to Confirm whether list contains duplicate values declare an if condition
		if (listSize==setSize) {
			System.out.println("No Duplicates found");
		}
		else {
			System.out.println("There are Duplicate values");
		}
	
		
		List<Integer> list2 = new ArrayList<>(unique);
		list2.get(3);
		
		/*
		 * //Sort list Collections.sort(list); //get the least price using index
		 * System.out.println("The least mobile Price : "+list.get(0));
		 */
		
		
		
		
		
		
	}

}
