package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_popup_iframes_alerts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='tryhome']"))).click().build().perform();
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		al.accept();
		
		driver.quit();
	}

}
