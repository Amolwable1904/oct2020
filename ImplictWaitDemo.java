import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplictWaitDemo
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		 System.out.println("Launch Crome Browser");
		   
	       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://mail.yahoo.com/");
	       
	       driver.manage().window().maximize();
	       
	//   Using implicit wait     
	       
	      driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  
	// USing Explicit wait
	      
	      driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	      
	      WebDriverWait wait=new WebDriverWait(driver,5);
	     
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-username']"))).sendKeys("Amol hi");
	      
	     // driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	    
	     //driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("HiAmol");
	     
	    driver.findElement(By.xpath("//input[@id='login-signin']")).click();

	}

}
