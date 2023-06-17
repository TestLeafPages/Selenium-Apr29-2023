package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String excelFilename;

	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	
	@DataProvider(indices= 0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readExcel(excelFilename);
	}

}
