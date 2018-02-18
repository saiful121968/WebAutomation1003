package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		  driver.findElement(By.id("gb_70")).click();
		  Thread.sleep(2000);
		  
		 driver.findElement(By.id("identifierId")).sendKeys("ranzusarker8@gmail.com");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("shakiba2013");
		Thread.sleep(2000);
		
		
         driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
         Thread.sleep(4000);
				
		//driver.close();

	}

}
