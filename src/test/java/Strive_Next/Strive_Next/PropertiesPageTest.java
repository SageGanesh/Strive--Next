package Strive_Next.Strive_Next;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PropertiesPageTest extends BaseStriveNext{
	
	
	
	@Test
	public void verifythat_UserIsAbleToCreateNewPropertyWithValidCredentials_And_ValidDataTest() throws Exception {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jbavanam@sageitinc.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456!!");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/ul/li[3]/div/a[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/a/div/span")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("AutomationProperty");
		
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Address123");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("California");
		
		driver.findElement(By.xpath("//*[@id=\"mui-78639\"]")).click();
		
		
		
		
}
	
	
	

}
