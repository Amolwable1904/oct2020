import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo1 
{

	public static void main(String[] args) 
	{
		
		
		   System.out.println("Launch Crome Browser");
		   
	       System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	      
	       WebDriver driver = new ChromeDriver();
	      
	       
	       driver.get("http://demo.guru99.com/V4/");			

	      
	       driver.manage().window().maximize();
	       
	       
	       WebElement loginBtn= driver.findElement(By.xpath("//input[@name='btnLogin']")); // taking xpath of login button
	       
	       // Use java script for click on login button
	       
	       JavascriptExecutor js=(JavascriptExecutor)driver; 
	       
	       //To generate Alert window using JavascriptExecutor. Display the alert message 		
	       
	        js.executeScript("alert('Welcome to Guru99');");
	        
	        driver.switchTo().alert().dismiss();
	       
	       js.executeScript("arguments[0].click();",loginBtn );
	       
	       driver.switchTo().alert().accept();
	       
	       
	    

	}

}
