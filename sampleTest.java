package chatbot;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampleTest {

	WebDriver driver;
	
	@Before
	public void First() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ebru/Downloads/geckodriver");
		
		driver=new FirefoxDriver();
		
		driver.get("https://widget.cbot.ai/isbank");
		
		Thread.sleep(3000);
	}
	
	@After
	public void Last() {
		driver.close();
	}
	

	
	@Test
	public void MesajGöndermeTesti() throws InterruptedException  {
		
		
		
		driver.findElement(By.className("cbot-dialog-button")).click();
		
		Thread.sleep(3000);
		
		WebElement yaz=driver.findElement(By.id("cbot-form-message")); 
		
		yaz.sendKeys("hesap kesim tarihi öğrenme");
		Thread.sleep(3000);
		
		yaz.findElement(By.xpath("//*[@id=\'cbot-send-button\']")).click();
	}
		
	@Test 
	public void Senaryo1() throws InterruptedException {		
		
		WebElement ac= driver.findElement(By.className("cbot-dialog-button"));
		ac.click();
			
		WebElement yaz=driver.findElement(By.id("cbot-form-message"));
		
		
		
		yaz.sendKeys("hesap kesim tarihi öğrenme");
		
		Thread.sleep(3000);
		
		yaz.findElement(By.xpath("//*[@id=\'cbot-send-button\']")).click();
		
		Thread.sleep(3000);
		
		String a=yaz.findElement(By.xpath("//*[@id=\'cbot-chat\']/li[3]/div[2]")).getText();
		
		//System.out.println(a);
		if(a.contains("hesap")) {
		
		Assert.assertFalse	((a.contains("Ne yazık ki") && a.contains("Üzgünüm"))); 
		}
			
	}
	
	@Test 
	public void Senaryo2() throws InterruptedException {		
		
		driver.findElement(By.className("cbot-dialog-button")).click();
			
		WebElement yaz=driver.findElement(By.id("cbot-form-message"));
		
		
		
		yaz.sendKeys("kredi kartı borcum ne kadar");
		
		
		yaz.findElement(By.xpath("//*[@id=\'cbot-send-button\']")).click();
		
		Thread.sleep(3000);
		
		String a=yaz.findElement(By.xpath("//*[@id=\'cbot-chat\']/li[3]/div[2]")).getText();
		
		//System.out.println(a);
		if(a.contains("kart")||a.contains("borc")) {
		
		Assert.assertFalse	((a.contains("Ne yazık ki") && a.contains("Üzgünüm"))); 
		}
			
	}
	
	@Test 
	public void Senaryo3() throws InterruptedException {		
		
		driver.findElement(By.className("cbot-dialog-button")).click();
			
		WebElement yaz=driver.findElement(By.id("cbot-form-message"));
		
		
		
		yaz.sendKeys("kredi kartımı kaybettim");
		
		
		yaz.findElement(By.xpath("//*[@id=\'cbot-send-button\']")).click();
		
		Thread.sleep(3000);
		
		String a=yaz.findElement(By.xpath("//*[@id=\'cbot-chat\']/li[3]/div[2]")).getText();
		
		//System.out.println(a);
		if(a.contains("kart")||a.contains("kayıp")) {
		
		Assert.assertFalse	((a.contains("Ne yazık ki") && a.contains("Üzgünüm"))); 
		}}
		
		@Test 
		public void Senaryo4() throws InterruptedException {		
			
			driver.findElement(By.className("cbot-dialog-button")).click();
				
			WebElement yaz=driver.findElement(By.id("cbot-form-message"));
			
			
			
			yaz.sendKeys("atm günlük para çekme limiti");
			
			
			yaz.findElement(By.xpath("//*[@id=\'cbot-send-button\']")).click();
			
			Thread.sleep(3000);
			
			String a=yaz.findElement(By.xpath("//*[@id=\'cbot-chat\']/li[3]/div[2]")).getText();
			
			//System.out.println(a);
			if(a.contains("limit")) {
			
			Assert.assertFalse	((a.contains("Ne yazık ki") && a.contains("Üzgünüm"))); 
			}	}
		
			public void Senaryo5() throws InterruptedException {		
				
				driver.findElement(By.className("cbot-dialog-button")).click();
					
				WebElement yaz=driver.findElement(By.id("cbot-form-message"));
				
				
				
				yaz.sendKeys("konut kredisi oranları");
				
				
				yaz.findElement(By.xpath("//*[@id=\'cbot-send-button\']")).click();
				
				Thread.sleep(3000);
				
				String a=yaz.findElement(By.xpath("//*[@id=\'cbot-chat\']/li[3]/div[2]")).getText();
				
				//System.out.println(a);
				if(a.contains("konut")) {
				
				Assert.assertFalse	((a.contains("Ne yazık ki") && a.contains("Üzgünüm"))); 
				}	
			
	}
	}


