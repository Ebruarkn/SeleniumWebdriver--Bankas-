package chatbot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

public static void main (String []args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "/Users/ebru/Downloads/geckodriver");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://widget.cbot.ai/isbank");
	
	Thread.sleep(6000);
	
	

	WebElement ac= driver.findElement(By.className("cbot-dialog-button"));
	ac.click();
		
	WebElement yaz=driver.findElement(By.id("cbot-form-message"));
	
	
	
	yaz.sendKeys("hesap kesim tarihi öğrenme");
	
	Thread.sleep(3000);
	
	yaz.findElement(By.xpath("//*[@id=\'cbot-send-button\']")).click();
	
	Thread.sleep(3000);
	
	String a=yaz.findElement(By.xpath("//*[@id=\'cbot-chat\']/li[3]/div[2]")).getText();
	
	System.out.println(a);
	
	Assert.assertFalse	((a.contains("Ne yazık ki") && a.contains("Üzgünüm"))); 
		
		
		
	

	
	}
}
