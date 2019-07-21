package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addbook {
  
  ChromeDriver driver = new ChromeDriver();
  
  
		@BeforeMethod
		public void launch() {		
		    driver.get("http://localhost:8080/addressbook/");		     
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	  @Test
	  public void verifyaddbook() throws InterruptedException {	     
		     driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
			 driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka1");
			 driver.findElement(By.id("gwt-uid-7")).sendKeys("selenium1");
			 driver.findElement(By.id("gwt-uid-9")).sendKeys("12345671");
			 driver.findElement(By.id("gwt-uid-11")).sendKeys("devops1@gmail.com");
			 driver.findElement(By.id("gwt-uid-13")).sendKeys("05/05/1976,");
		     driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
		     Thread.sleep(5000);
  }
          @AfterMethod
          public void close() {
        	  driver.close();
          }
          
          }

  
