package Strive_Next.Strive_Next;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStriveNext {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		  driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.get("http://18.213.224.210");
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		  

}
	
	
	@AfterMethod
	public void teardown() throws Exception {
		
		Thread.sleep(6000);
		driver.quit();
		
	}

}
